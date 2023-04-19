package march7th;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class SubArray {
	public static void main(String[] args) {
		int a[]= {1,2,8,9,7,5};
		int target=5;
		System.out.println(maxSubarray(a, target));
	    Object o[]= {'c','f','h',1};
	    char c[]=new char[o.length];
	    int i=0;
	    for(Object o1:o)
	    {
	    	c[i]=(char) o1;
	    	i++;
	    }
	    		}
	public static int maxSubarray(int[] arr, int target) {
	    int maxSoFar = 0;
	    int maxEndingHere = 0;
	    for (int i = 0; i < arr.length; i++) {
	        maxEndingHere += arr[i];
	        if (maxEndingHere < 0) {
	            maxEndingHere = 0;
	        }
	        if (maxEndingHere > maxSoFar && maxEndingHere <= target) {
	            maxSoFar = maxEndingHere;
	        }
	    }
	    return maxSoFar;	
	}
}
