package March14;

import java.util.List;

public class Sixth {
	public static void main(String[] args) {
		
		
		
		
	}
	public static int flippingMatrix(List<List<Integer>> matrix) {
	    // Write your code here
	        int max=0;
	        int index=0;
	        for(List<Integer> l:matrix)
	        {
	        	for(int i:l) {
	        		if(l==matrix.get(0)||l==matrix.get(matrix.size()-1))
	        		{
	        			if(i>max)
	        			{
	        				max=i;
	        			}
	        		}
	        	}
	        }
	        for(List<Integer> l:matrix)
	        {
	        	for(int i:l) {
	        		if(l==matrix.get(0)||l==matrix.get(matrix.size()-1))
	        		{
	        			if(max==i)
	        			{
	        				index=l.indexOf(i);
	        			}
	        		}
	        	}
	        }
	        
	        
	        
	        
	    }
}
