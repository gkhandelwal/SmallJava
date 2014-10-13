

import java.awt.*;
import java.awt.event.*;
 
import javax.swing.*;

public class Fourth {
    int flag;
    Fourth(final int flag)
    {
        this.flag=flag;
        final JFrame f = new JFrame("Gaurav");
        f.setSize(400, 150);
        f.setLocation(200, 200);
        f.addWindowListener(new WindowAdapter(  ) {
        public void windowClosing(WindowEvent we) {f.dispose();
                Third t= new Third(flag);  }
        });
        JPanel gauravPanel = new JPanel(  );
        JPanel gunjanPanel = new JPanel(  );
        JLabel label=new JLabel("End date should be greater than Start date");
        gauravPanel.add(label);
        JButton cancel = new JButton("Cancel");
        gunjanPanel.add(cancel);
        Container content = f.getContentPane(  );
        content.setLayout(new GridLayout(3, 1));
        content.add(gauravPanel);
        content.add(gunjanPanel);
        f.setVisible(true);
        cancel.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
                f.dispose();
                Third t= new Third(flag);
        
            }
        });
        
    }
    
}
