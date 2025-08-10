//package ArrayBasics;

//Two dimensional array without user input
//public class TwoDArray {
//	public static void main(String[] z)
//
//	{
//		Scanner sc = new Scanner(System.in);
//		
//		int arr[][]={{10,11,12},{13,14,15}};
//		for(int row=0;row<arr.length;row++)
//		{
//			for(int col=0;col<arr[row].length;col++)
//			{
//				System.out.print(arr[row][col]+" ");
//			}
//			System.out.println();
//		}
//	}
//}
//Two dimensional array with user input
//public class TwoDArray {
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
//		for(int i=0;i<arr[0].length;i++)
//		{
//			for(int j=0;j<arr.length;j++)
//			{
//				System.out.print(arr[j][i]+" ");
//			}
//			System.out.println();
//		}
//	}
//}
//Jagged array
//public class TwoDArray {
//public static void main(String[] z)
//
//{
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the row size: ");
//	int x = sc.nextInt();
//	
//	int arr[][]=new int[3][];
//	arr[0]=new int[2];
//	arr[1]=new int[1];
//	arr[2]=new int[4];
//	System.out.println("Enter the row and col elements: ");
//	for(int i=0;i<x;i++)
//	{
//		for(int j=0;j<arr[i].length;j++)
//		{
//			arr[i][j]=sc.nextInt();
//		}
//	}
//	
//	for(int i=0;i<arr.length;i++)
//	{
//		for(int j=0;j<arr[i].length;j++)
//		{
//			System.out.print(arr[j][i]+" ");
//		}
//		System.out.println();
//	}
//}
//}
