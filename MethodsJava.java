//Max element in an 2D array
//package ArrayBasics;
//import java.util.Scanner;
//public class MethodsJava {
//	public static void main(String[] z)
//
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the row size: ");
//		int x = sc.nextInt();
//		System.out.println("Enter the col size: ");
//		int y = sc.nextInt();
//		
//		int arr[][]=new int[x][y];
//		System.out.println("Enter the row and col elements: ");
//		for(int i=0;i<x;i++)
//		{
//			for(int j=0;j<y;j++)
//			{
//				arr[i][j]=sc.nextInt();
//			}
//		}
//		
//		for(int i=0;i<x;i++)
//		{
//			int max = 0;
//			for(int j=0;j<y;j++)
//			{
//				if(max<arr[i][j])
//				{
//					max=arr[i][j];
//				}
//				
//			}
//			System.out.print(max+" ");
//		}
//		sc.close();
//		
//	}
//}
