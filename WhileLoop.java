package ForLoop;

//import java.util.Scanner;
//
//public class ForLop {
//	public static void main(String[] z)
//	{
//		Scanner sc = new Scanner(System.in);
//		int i;
//		int count = 0;
//		System.out.println("Enter the Number: ");
//		int n = sc.nextInt();
//		for(i=1;i<n-1;i++)
//		{
//			if(n%i==0)
//			{
//				System.out.println(i+" ");
//				count++;
//			}
//		}
//		System.out.println(count);
//	}
//
//}
//import java.util.Scanner;
//public class ForLop{
//	public static void main(String[] z)
//	{
//		Scanner sc = new Scanner(System.in);
//		int i;
//		int count = 0;
//		System.out.print("Enter the number: ");
//		int n = sc.nextInt();
//		for(i=2;i<=n/2;i++)
//		{
//			if(n%i==0)
//			{
//				count++;
//			}
//		}
//		if(count ==0)
//		{
//			System.out.println("hii");
//		}
//		else
//		{
//			System.out.println("Not a prime");
//		}
//	}
//}
//import java.util.Scanner;
//public class ForLop{
//	public static void main(String[] z)
//	{
//		Scanner sc = new Scanner(System.in);
//		int i;
//		System.out.print("Enter a num: ");
//		int n = sc.nextInt();
//		int fact =1;
//		for(i=1;i<=n;i++)
//		{
//			fact = fact*i;
//			
//		}
//		System.out.println(fact);
//	}
//}
//import java.util.Scanner;
//public class ForLop{
//	public static void main(String[] z)
//	{
//		Scanner sc = new Scanner(System.in);
//		int i=1;
//		int c = 0;
//		int  o =1;
//		System.out.print("Enter a num: ");
//		int n = sc.nextInt();
//		while(i<=n)
//		{
//			if(i%2==0)
//			{
//				c+=i;
//			}
//			else
//			{
//				o*=i;
//			}
//			i++;
//		}
//		System.out.println(c+" ");
//		System.out.println(o+" ");
//	}
//}
//import java.util.Scanner;
//public class WhileLoop{
//	public static void main(String[] z)
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter a num: ");
//		int n = sc.nextInt();
//		int sum =0;
//		while(n>0)
//		{
//			sum += n%10;
//			n = n/10;
//			
//		
//		
//		if(n==0 && sum>9)
//		{
//			n=sum;
//			sum=0;
//		}
//		
//		}
//			
//		System.out.println(sum);
//	}
//}
//import java.util.Scanner;
//public class WhileLoop{
//	public static void main(String[] z)
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter a num: ");
//		int n = sc.nextInt();
//		int rev =0;
//		while(n>0)
//		{
//			int tmp= n%10;
//			rev = rev*10+tmp;
//			n = n/10;
//		}
//		System.out.println(rev);
//	}
//}
//import java.util.Scanner;
//public class WhileLoop{
//	public static void main(String[] z)
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter a num: ");
//		int n = sc.nextInt();
//		int p=1;
//		do {
//			if(n%2==0)
//			{
//				p=p*n;
//				
//			}
//			n--;
//		}while(n>0);
//		System.out.println(p);
//	}
//}
//import java.util.Scanner;
//public class WhileLoop{
//	public static void main(String[] z)
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter a num: ");
//		int n = sc.nextInt();
//		int sum =1;
//		int count = 0;
//		while(n>0)
//		{
//			int temp = n%10;
//			if(temp!=0)
//			{
//				sum = sum*temp;
//			}
//			else
//			{
//				count++;
//			}
//			n = n/10;
//		}
//		System.out.println(sum);
//		System.out.println(count);
//	}
//}
