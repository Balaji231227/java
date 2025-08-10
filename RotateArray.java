//package ArrayBasics;

//import java.util.Scanner;
//public class RotateArray {
//	public static void main(String[] z)
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the array size: ");
//		int n = sc.nextInt();
//		System.out.println("Enter the array elements: ");
//		int[] arr = new int[n];
//		for(int i=0;i<n;i++)
//		{
//			arr[i]=sc.nextInt();
//		}
//		int t = arr[0];
//		for(int i =1;i<n;i++)
//		{
//			arr[i-1]=arr[i];
//			
//		}
//		arr[n-1]=t;
//		System.out.print("Rotated array: ");
//		for(int i:arr)
//		{
//			System.out.print(i+" ");
//		}
//		sc.close();
//	}
//
//}
//3 rotation in left rotation
//public class RotateArray {
//	public static void main(String[] z)
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the array size: ");
//		int n = sc.nextInt();
//		System.out.println("Enter the array elements: ");
//		int[] arr = new int[n];
//		for(int i=0;i<n;i++)
//		{
//			arr[i]=sc.nextInt();
//		}
//		System.out.println("enter the time to rotate the array: ");
//		int rotate = sc.nextInt();
//		
//		while(rotate>0)
//		{
//			int t = arr[0];
//			for(int i =1;i<n;i++)
//			{
//				arr[i-1]=arr[i];
//			}
//			arr[n-1]=t;
//			rotate--;
//		}
//		System.out.print("Rotated array: ");
//		for(int i:arr)
//		{
//			System.out.print(i+" ");
//		}
//		sc.close();
//	}
//
//}
//right rotation
//public class RotateArray {
//	public static void main(String[] z)
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the array size: ");
//		int n = sc.nextInt();
//		System.out.println("Enter the array elements: ");
//		int[] arr = new int[n];
//		for(int i=0;i<n;i++)
//		{
//			arr[i]=sc.nextInt();
//		}
//		System.out.println("enter the time to rotate the array: ");
//		int rotate = sc.nextInt();
//		
//		while(rotate>0)
//		{
//			int t = arr[n-1];
//			for(int i =n-1;i>0;i--)
//			{
//				arr[i]=arr[i-1];
//			}
//			arr[0]=t;
//			rotate++;
//		}
//		System.out.print("Rotated array: ");
//		for(int i:arr)
//		{
//			System.out.print(i+" ");
//		}
//		sc.close();
//	}
//
//}
