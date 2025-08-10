package ArrayBasics;

//import java.util.Scanner;
//public class MethodJava {
//	
//	
//	//without return type
//	void  meth()
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the elements to add:");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int  c = a*b;
//		System.out.println(c);
//		sc.close();
//	}
//	//without return type
//	void meth2(float a,int b)
//	{
//		float c = a*b;
//		System.out.println(c);
//	}
//	//with return type without parameter
//	int meth3()
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the elemenst to multiply: ");
//		int x = sc.nextInt();
//		int y =sc.nextInt();
//		return x*y;
//		
//	}
//	//with return type with parameter
//	int meth4(int x,int y,int z)
//	{
//		return x+y*z;
//		
//	}
//	public static void main(String[] z)
//	{
//		Scanner sc = new Scanner(System.in);
//		MethodJava aj = new MethodJava();
//		aj.meth();
//		
//		System.out.println("Enter the elements to multiply: ");
//		float a = sc.nextFloat();
//		int b = sc.nextInt();
//		aj.meth2(a, b);
//		System.out.println(aj.meth3());
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		int z =sc.nextInt();
//		System.out.println(aj.meth4(x,y,z));
//		
//		sc.close();
//	}
//	
//
//}
import java.util.Scanner;

public class MethodJava {
	public static void main(String[] z) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int seclar = arr[0];
		for (int i = 0; i < n; i++) {
			if (max < arr[i]) {
				seclar = max;
				max = arr[i];
			} else if (seclar < arr[i]) {
				seclar = arr[i];
			}

		}
		System.out.println(seclar);
		sc.close();
	}
}
