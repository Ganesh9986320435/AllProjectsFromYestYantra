package March14;

public class Fourth {
	public static void main(String[] args) {
		System.out.println(timeConversion("12:40:22AM"));
	}
	 public static String timeConversion(String s) {
		 String last="";
		    for(int i=s.length()-2;i<s.length();i++)
		    {
		        last=last+s.charAt(i);
		    }
		    String start="";
		    for(int i=0;i<2;i++)
		    {
		        start=start+s.charAt(i);
		    }
		    int startnum=Integer.parseInt(start);
		    String fin="";
		    if(last.equals("AM"))
		    {
		        if(startnum>9)
		        {
		            fin=""+startnum;
		        }
		        else{
		            fin="0"+startnum;
		        }
		    }
		    else{
		        if(startnum==12)
		        {
		            fin="12";
		        }
		        else{
		            
		            fin=""+(startnum+12);
		        }
		    }
		    String finalAnswer="";
		    finalAnswer=""+fin;
		    for(int i=2;i<s.length()-2;i++)
		    {
		        finalAnswer=finalAnswer+s.charAt(i);
		    }
		    return finalAnswer;
		    
		    }
}
