package Algorithm;
import java.util.Arrays;
public class AlgoGreed {
	public static int countJumps(int[] arr) {
		if (arr == null || arr.length == 0) {
			return 0;
		}
		int jumps = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {
				jumps++;
			}
		}
		return jumps;
	}
	public static void main(String[] args) {
		int arr[]= {1,3,2,1,0,3,5};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		  int jumpCount = countJumps(arr);
		  System.out.print("Number of jumps : " + jumpCount);
		    }
		
}
