//package ArrayBasics;

//import java.util.Scanner;
//public class ReverseArray {
//	public static void main(String[] z)
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the array size: ");
//		int n = sc.nextInt();
//		System.out.println("Enter the array elements: ");
//		int[] arr= new int[n];
//		for(int i=0;i<n;i++)
//		{
//			arr[i]=sc.nextInt();
//		}
//		int i=0,j=n-1;
//		while(i<=j)
//		{
//				
//					int temp = arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				
//				i++;
//				j--;
//		}
//		System.out.print("Reversed Array: ");
//		for(int k:arr)
//		{
//			System.out.print(k+" ");
//		}
//		sc.close();
//		
//		
//	}
//
//}
//Reverse an array
//public class ReverseArray {
//	public static void main(String[] z)
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the array size: ");
//		int n = sc.nextInt();
//		System.out.println("Enter the array elements: ");
//		int[] arr= new int[n];
//		for(int i=0;i<n;i++)
//		{
//			arr[i]=sc.nextInt();
//		}
//		int k=0;
//		int[] arr1 = new int[n];
//		for(int i=n-1;i>=0;i--)
//		{
//			arr1[k++] = arr[i];
//		}
//		System.out.print("Reversed array: ");
//		for(int j:arr1)
//		{
//			System.out.print(j+" ");
//		}
//		
//	}
//}
