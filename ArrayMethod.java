//package ArrayBasics;
//import java.util.Arrays;
//import java.util.Scanner;
//public class ArrayMethod {
//	public static void main(String[] z)
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the array size: ");
//		int n = sc.nextInt();
//		System.out.println("enter the array elements: ");
//		int[] arr = new int[n];
//		for(int i=0;i<n;i++)
//		{
//			arr[i]=sc.nextInt();
//		}
//		Arrays.sort(arr);
//		int i,j;
//		for( i=1;i<n-1;i++)
//		{
//			if(arr[i]!=arr[i-1]&&arr[i]!=arr[i+1])
//			{
//				System.out.println( arr[i]);
//			}
//			
//		}
//		for( i=0;i<n;i++)
//		{
//			System.out.println(arr[i]);
//		}
//		
//		sc.close();
//	}
//}
