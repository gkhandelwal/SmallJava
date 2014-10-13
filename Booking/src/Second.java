


import java.awt.*;
import java.awt.event.*;
 
import javax.swing.*;
public class Second {
   int weeks,cost;
   String str;
   int c;
   void makestr(int flag)
   {
       String str1 = String.valueOf(weeks);
       String str2;
       if(flag==1)
       {
           str="Single room cost per week :-\t$600 \nTotal number of weeks charged:- \t  ";
           str=str+str1;
           str1="\nTotal cost of package\t\t$";
           str=str+str1;
           cost=600*weeks;
           str1 = String.valueOf(cost);
           str=str+str1;
           
       }
       if(flag==2)
       {
           str="Double room cost per week :-\t$850 \nTotal number of weeks charged:- \t  ";
           str=str+str1;
           str1="\nTotal cost of package\t\t$";
           str=str+str1;
           cost=850*weeks;
           str1 = String.valueOf(cost);
           str=str+str1;
           
       }
       if(flag==3)
       {
           str="Single room cost per week :-\t$600\n";
           str2="Boat cost per week  :-\t\t$60\nTotal number of weeks charged:- \t ";
           str=str+str2+str1;
           str1="\nTotal cost of package\t\t$";
           str=str+str1;
           cost=660*weeks;
           str1 = String.valueOf(cost);
           str=str+str1;
           
       }
        if(flag==4)
       {
           str="Double room cost per week :-\t$850\n";
           str2="Boat cost per week  :-\t\t$60\nTotal number of weeks charged:- \t ";
           str=str+str2+str1;
           str1="\nTotal cost of package\t\t$";
           str=str+str1;
           cost=910*weeks;
           str1 = String.valueOf(cost);
           str=str+str1;
           
       }
   }
    Second(final int flag,int days)
    {
       
        final JFrame g = new JFrame("Gaurav");
        g.setSize(320, 300);
        g.setLocation(200, 200);
        g.addWindowListener(new WindowAdapter(  ) {
            public void windowClosing(WindowEvent we) { System.exit(0); }
        });
     
        g.setVisible(true);
        Container content = g.getContentPane(  );
        content.setLayout(new GridLayout(3, 1));
        JTextArea textarea= new JTextArea();
    
        textarea.setEditable(false);
        content.add(textarea);
        weeks=days/7;
        if( days % 7!=0)
            weeks=weeks+1;
        makestr(flag);
        //  Instead of flag you need to display string... flag is helpful for calculating cost
        textarea.setText(str);
        JPanel orderPanel = new JPanel(  );
        JButton orderButton = new JButton("Check Out");
        JButton backButton = new JButton("Back");
        orderPanel.add(orderButton);
        orderPanel.add(backButton);
        content.add(orderPanel);
        // Check out button function
        orderButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
                System.exit(0);
        
            }
        }
);
     backButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
               g.dispose();
               Third t=new Third(flag);
               
            }
        }
);
        
        
    }
}
