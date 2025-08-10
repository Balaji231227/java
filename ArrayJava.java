//package ArrayBasics;

//import java.util.*;
//import java.util.Scanner;
//public class ArrayJava {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int  sum = 0;
//		float avg =0;
//		System.out.println("Enter the array size: ");
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		
//		System.out.println("Enter the array elements");
//		
//		for(int i=0;i<n;i++)
//		{
//			arr[i] = sc.nextInt();
//			
//		}
//		for(int i=n-1;i>=0;i--)
//		{
//			
//				System.out.print(arr[i]+" ");
//			
//		}
//		}
//}
//import java.util.Scanner;
//public class ArrayJava {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the array size: ");
//		int n = sc.nextInt();
//		System.out.println("Enter the array elements");
//		int[] arr = new int[n];
//		for(int i=0;i<n;i++)
//		{
//			arr[i] = sc.nextInt();
//			
//		}
//		int key = sc.nextInt();
//		boolean flag = false;
//		for(int i=0;i<n;i++)
//		{
//			if(arr[i]==key)
//			{
//				flag = true;
//			}
//			
//		}
//		if(flag)
//		{
//			System.out.println("key found!");
//		}
//		else
//		{
//			System.out.println("key not found");
//		}
//		}
//}
//}
//import java.util.Scanner;
//public class ArrayJava {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the array size: ");
//		int n = sc.nextInt();
//		System.out.println("Enter the array elements");
//		int[] arr = new int[n];
//		for(int i=0;i<n;i++)
//		{
//			arr[i] = sc.nextInt();
//			
//		}
//		System.out.println("Before sorting: ");
//		for(int i=0;i<n;i++)
//		{
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
//		System.out.println("After sorting; ");
//		Arrays.sort(arr);
//		for(int i=0;i<n;i++)
//		{
//			System.out.print(arr[i]+" ");
//		}
//	}
//}
