package March14;

import March9.main;

public class Fifth {
	public static void main(String[] args) {
		String s="abca";
		String s1="";
        for(int i=s.length()-1;i>=0;i--)
        {
            s1=s1+s.charAt(i);
        }
        if(s.equals(s1))
        {
            System.out.println(-1);
        }else{
            int finalans=0;
            for(int i=0;i<s.length();i++)
            {
                String s2="";
                for(int j=0;j<s.length();j++)
                {
                    if(i!=j)
                    {
                    s2=s2+s.charAt(j);
                    }
                }
                String s3="";
                for(int k=s2.length()-1;k>=0;k--)
                {
                    s3=s3+s2.charAt(k);
                }
                if(s3.equals(s2))
                {
                    finalans=i;
                }
            }
            System.out.println(finalans);
        }
		    


	}
}
