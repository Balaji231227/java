package Naathanda;
import java.util.Arrays;
public class Bubble {
	public static void main(String[]args) {
	
	int arr[]= {23,1,2,3,4};
	System.out.println(Arrays.toString(arr));
    boolean swap=true;
    while(swap) {
    	swap=false;
    	for(int i=0;i<arr.length-1;i++) {
    		if(arr[i]>arr[i+1]) {
    			int temp=arr[i];
    			arr[i]=arr[i+1];
    			arr[i+1]=temp;
    		}
    		 System.out.println(Arrays.toString(arr));
    	}
    	System.out.println(Arrays.toString(arr));
    }
   
	}

}
