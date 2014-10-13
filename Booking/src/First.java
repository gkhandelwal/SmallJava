

import java.awt.*;
import java.awt.event.*;
 
import javax.swing.*;

public class First {
    // I am using flag as follows : a) 1 for only SR
    // b) 2 for only DR
    //c) 3 for SR+boat
    //d) 4 for DR+boat
    int flag;
    First(){
    final JFrame f = new JFrame("Gaurav");
    f.setSize(300, 150);
    f.setLocation(200, 200);
    f.addWindowListener(new WindowAdapter(  ) {
      public void windowClosing(WindowEvent we) { System.exit(0); }
    });
 
    
    JPanel gauravPanel = new JPanel(  );
    final JCheckBox SR= new JCheckBox("Single Room");
    gauravPanel.add(SR);
    final JCheckBox DR= new JCheckBox("Double Room");
    gauravPanel.add(DR);
    
    JPanel boatPanel = new JPanel(  );
    final JCheckBox boat =new JCheckBox("Boat");
    boatPanel.add(boat);
    
    
    JPanel orderPanel = new JPanel(  );
    JButton orderButton = new JButton("Place Order");
    orderPanel.add(orderButton);
    
    Container content = f.getContentPane(  );
    content.setLayout(new GridLayout(3, 1));
    content.add(gauravPanel);
    content.add(boatPanel);
    content.add(orderPanel);
    
    
    SR.addActionListener(new ActionListener() 
    {
        public void actionPerformed(ActionEvent ae) {
            
            if(DR.isSelected())
            {
                DR.setSelected(false);
                
            }
            if(SR.isSelected()==false)
            {
                if(boat.isSelected())
                    boat.setSelected(false);
                
            }
        }
    }
);
      DR.addActionListener(new ActionListener() 
    {
        public void actionPerformed(ActionEvent ae) {
           
            if(SR.isSelected())
            {
                SR.setSelected(false);
                
            }
            if(DR.isSelected()==false)
            {
                if(boat.isSelected())
                    boat.setSelected(false);
                
            }
        }
    }
);
      
      boat.addActionListener(new ActionListener() 
    {
        public void actionPerformed(ActionEvent ae) {
           
            if((!(DR.isSelected()))&&(!(SR.isSelected())))
            {
                boat.setSelected(false);
                
            }
        }
    }
);
    
    
   orderButton.addActionListener(new ActionListener() 
    {
      public void actionPerformed(ActionEvent ae) 
      {
        
        if(SR.isSelected())
        {
            if(boat.isSelected())
                flag=3;
            else
                flag=1;
            f.dispose();
            //Second c=new Second(str);
            Third c=new Third(flag);
            
            
        }
        else
        {
            if(DR.isSelected())
            {
                if(boat.isSelected())
                    flag=4;
                else
                    flag=2;
                f.dispose();
                Third c=new Third(flag);
            }
            else
                if(boat.isSelected())
                {
                    boat.setSelected(false);
                }
        }
        
         
      }
    }
);
    
    f.setVisible(true);
    }
}