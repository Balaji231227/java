package Naathanda;
import java.util.Arrays;
import java.util.Scanner;
public class Matrix {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]={ {1,2,3},
				      {4,5,6},
				      {7,8,9}};
		int arr1[][]= {{9,8,7},
				       {6,5,4},
				       {3,2,1}};
		int res[][]=new int[arr.length][arr[0].length];
		for(int r=0;r<arr.length;r++) {
			for(int p=0;p<arr[r].length;p++) {
				res[r][p]=arr[r][p]/arr1[r][p];
			}
		}
		for(int r=0;r<arr.length;r++) {
			System.out.println(Arrays.toString(res[r]));
		}
		}
				

}
