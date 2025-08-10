package Naathanda;
import java.util.Scanner;
import java.util.Arrays;
public class Rotate {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int n=5;
	int arr[][]=new int[n][n];
	for(int row=0;row<arr.length;row++) {
		for(int col=0;col<arr[row].length;col++) {
			arr[row][col]=sc.nextInt();
		}
	}
	for(int row=0;row<arr.length;row++) {
		for(int col=0;col<arr[row].length;col++) {
	     System.out.print(arr[row][col]+" ");

	}
		System.out.println();}
	System.out.println("sum of diagonal value: " + (arr[0][0]+arr[1][1]+arr[2][2]));}}
