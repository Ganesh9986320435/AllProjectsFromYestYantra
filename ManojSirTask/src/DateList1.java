import java.text.SimpleDateFormat;
import java.util.*;

public class DateList1 {
   
    public static void main(String[] args) throws Exception {
        String from="2020-01-01";
        String to="2020-05-30";
       
        Date d_from = new SimpleDateFormat("yyyy-MM-dd").parse(from);
        Date d_to = new SimpleDateFormat("yyyy-MM-dd").parse(to);
       
        //System.out.println(d_from.getTime());
       
        long t1=d_from.getTime();
        long t2=d_to.getTime();
        System.out.println(t1+"    "+t2);
        
        
        
        SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd");
       
        if(t1<t2)
        {
            //1 = 1000
            for(long i=t1;i<=t2;i+=86400000)
            {
                System.out.println(f.format(i));
            }
        }
       
    }
   
}
