

import java.util.*;
public class fifth {
    int days;
    Calendar cal1;
    Calendar cal2;
 
    fifth() 
    {
         cal1 = new GregorianCalendar();
         cal2 = new GregorianCalendar();
    }
    void setcal1(int yy, int mm, int dd)
    {
        cal1.set(yy, mm, dd);
    }
    void setcal2(int yy, int mm, int dd)
    {
        cal2.set(yy, mm, dd);
    }  
    int ndays()
    {
        days= (int)( (cal2.getTime().getTime() - cal1.getTime().getTime()) / (1000 * 60 * 60 * 24));
        return days;

    }
}
