

import java.awt.*;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;


public class Third {
    int flag;
    int days;
  private String[] months = {"(select month)" ,"January", "February", "March",
      "April", "May", "June", "July", "August","September","October","November","December"};
  private int[] years = { 2013,2014,2015};

  
  private JComboBox smonth = new JComboBox();
  private JComboBox syear = new JComboBox();
  private JComboBox sday = new JComboBox();
  
   private JComboBox emonth = new JComboBox();
  private JComboBox eyear = new JComboBox();
  private JComboBox eday = new JComboBox();
  
  JFrame g = new JFrame("Gaurav");
  Container content = g.getContentPane(  );

  
  void startTab()
  {
      
      for (int i = 0; i <13; i++)
            smonth.addItem(months[i]);
        for (int i = 0; i <3; i++)
            syear.addItem(years[i]);
        
        
     
       
        JLabel startLabel= new JLabel("Start Date:\t");
        
        
        JPanel startPanel = new JPanel(  );
        content.add(startPanel);
        startPanel.add(startLabel);
        startPanel.add(smonth);
        startPanel.add(syear);
        startPanel.add(sday);
      smonth.addActionListener(new ActionListener() 
      {
        public void actionPerformed(ActionEvent ae) 
        {
            
            sday.removeAllItems();
            if((smonth.getSelectedIndex())>=1)
            {
                if((smonth.getSelectedIndex())==2)
                {
                    for (int i = 1; i <=28; i++)
                        sday.addItem(i);
                }
                else
                    if((((smonth.getSelectedIndex())%2==1)&&(smonth.getSelectedIndex()<=7))||(((smonth.getSelectedIndex())%2==0)&&(smonth.getSelectedIndex()>7)))
                    {
                        for (int i = 1; i <=31; i++)
                            sday.addItem(i);
                    }
                    else
                    {
                        for (int i = 1; i <=30; i++)
                            sday.addItem(i);
                    }
            }
        }
       });
  }
  void endTab()
  {
      for (int i = 0; i <13; i++)
            emonth.addItem(months[i]);
        for (int i = 0; i <3; i++)
            eyear.addItem(years[i]);
        
        
        
        JLabel endLabel= new JLabel("End Date:\t");
        
        
        JPanel endPanel = new JPanel(  );
        content.add(endPanel);
        endPanel.add(endLabel);
        endPanel.add(emonth);
        endPanel.add(eyear);
        endPanel.add(eday);
         emonth.addActionListener(new ActionListener() 
      {
        public void actionPerformed(ActionEvent ae) 
        {
            
            eday.removeAllItems();
            if((emonth.getSelectedIndex())>=1)
            {
                if((emonth.getSelectedIndex())==2)
                {
                    for (int i = 1; i <=28; i++)
                        eday.addItem(i);
                }
                else
                    if((((emonth.getSelectedIndex())%2==1)&&(emonth.getSelectedIndex()<=7))||(((emonth.getSelectedIndex())%2==0)&&(emonth.getSelectedIndex()>7)))
                    {
                        for (int i = 1; i <=31; i++)
                            eday.addItem(i);
                    }
                    else
                    {
                        for (int i = 1; i <=30; i++)
                            eday.addItem(i);
                    }
            }
        }
       });
  }
  
  void temp()
  {
      Fourth sec= new Fourth(flag);
  }
  void temp2()
  {
      Second sec= new Second(flag,days);
  }
  void submitTab()
  {
      
      JButton submit = new JButton("Submit");
      JPanel submitPanel = new JPanel(  );
      content.add(submitPanel);
      submitPanel.add(submit);
      submit.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
               if((smonth.getSelectedIndex()>=1)&&(emonth.getSelectedIndex()>=1))
               {
                   fifth xens=new fifth();
                   xens.setcal1(years[syear.getSelectedIndex()], smonth.getSelectedIndex(),sday.getSelectedIndex());
                   xens.setcal2(years[eyear.getSelectedIndex()], emonth.getSelectedIndex(),eday.getSelectedIndex());
                   days=xens.ndays();
                if(days<=0)
                    temp();
                else
                   temp2();
                 g.dispose();
               }
        
            }
        });
  }
    Third(int flag){
        this.flag=flag;
        g.setSize(400, 150);
        g.setLocation(200, 200);
        g.addWindowListener(new WindowAdapter(  ) {
        public void windowClosing(WindowEvent we) { System.exit(0); }
        });
        startTab();
        endTab();
        submitTab();
        content.setLayout(new GridLayout(3, 1));
        g.setVisible(true);
    
  }
}
