import java.text.SimpleDateFormat;
import java.util.*;

public class DateList {
   
    public static void main(String[] args) throws Exception {
        String from="2023-01-01";
        String to="2023-05-30";
        String a="2023-01-09";
        String b="2023-10-19";
       
        Date d_from = new SimpleDateFormat("yyyy-MM-dd").parse(from);
        Date d_to = new SimpleDateFormat("yyyy-MM-dd").parse(to);
       
        //System.out.println(d_from.getTime());
       
        long t1=d_from.getTime();
        long t2=d_to.getTime();
        System.out.println(t1+"   "+t2);
       
        SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd");
       
        if(t1<t2)
        {
        	int count=0;
            //1 = 1000
            for(long i=t1;i<=t2;i+=86400000)
            {
            	if(f.format(i).equals(a)||f.format(i).equals(b))
                count++;
            }
            if(count==0)
            {
            	System.out.println("hi");
            }
            else {
				System.out.println("hjkdjhfjd");
			}
        }
       
    }
   
}
