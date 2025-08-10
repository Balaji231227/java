package Naathanda;
import java.util.Arrays;
public class Unique {
public static void main(String[]args) {
	int arr[]= {2,2,3,4,5,5,6,6,8,8};
	System.out.println(Arrays.toString(arr));
	int n=arr.length;
	if(arr[0]==arr[1]){
		System.out.println(arr[0]);	
	}
	for(int i=1;i<arr.length-1;i++) {
		if(arr[i]!=arr[i-1]&&arr[i]==arr[i+1]) {
			System.out.println(arr[i]);
		}
	}
	
	}
	
}

