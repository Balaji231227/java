package ArrayBasics;

import java.util.Arrays;
//Selection sort
//import java.util.Scanner;
//public class SortingJava {
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
//			
//		}
//		for(int i=0;i<n-1;i++)
//		{
//			int minInd = i;
//			for(int j=i+1;j<n;j++)
//			{
//				if(arr[minInd]>arr[j])
//				{
//					minInd = j;
//				}
//			}
//			if(minInd != arr[i])
//			{
//				int temp =arr[i];
//				arr[i]=arr[minInd];
//				arr[minInd]=temp;
//			}
//			
//		}
//		System.out.print("Sorted array: ");
//		for(int i=0;i<n;i++)
//		{
//			System.out.print(arr[i]+" ");
//		}
//		sc.close();
//		
//	}
//
//}
//Unique elements in an array
//import java.util.Scanner;
//public class SortingJava {
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
//			
//		}
//		Arrays.sort(arr);
//		if(arr[0]!=arr[1])
//		{
//			System.out.println(arr[0]+" ");
//		}
//		for(int i=1;i<n-1;i++) {
//				if(arr[i-1]!=arr[i] && arr[i+1]!=arr[i])
//				{
//					System.out.println(arr[i]+" ");
//				}
//			}
//		if(arr[n-1]!=arr[n-2])
//		{
//			System.out.println(arr[n-1]);
//		}
//		sc.close();
//		
//	}
//}
//Duplicate elements in array 
//import java.util.Scanner;
//public class SortingJava {
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
//			
//		}
//		Arrays.sort(arr);
//		
//		for(int i=1;i<n;i++) {
//				if(arr[i-1]==arr[i])
//				{
//					System.out.println(arr[i]+" ");
//				}
//			}
//		
//		sc.close();
//		
//	}
//}
//unique elements with duplicate
import java.util.Scanner;

public class SortingJava {
	public static void main(String[] z) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size: ");

		int n = sc.nextInt();
		System.out.println("Enter the array elements: ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		Arrays.sort(arr);
		int i = 1;
		while (i < n) {
			if (arr[i] + 1 < arr.length && arr[i] == arr[n - 2]) {
				i++;
			}
			i++;

		}
		sc.close();
	}
}
