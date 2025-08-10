package recursion;
//Basic recursion
//public class RecursionJava {
//	static void method(int n)
//	{
//		if(n==11)
//		{
//			return;
//		}
//			System.out.println(n);
//			method(n+1);
//		
//	}
//	public static void main(String[] args) {
//		int n = 1;
//		System.out.println("Recusive call");
//		method(n);
//		System.out.println("with use of loop");
//		int m =11;
//		while(m<=20)
//		{
//			System.out.println(m++);
//		}
//	}
//
//}
//tail recursion
//public class RecursionJava {
//static void method(int n)
//{
//	if(n<=100)
//	{
//		System.out.println(n++);
//		method(n+1);//tail recursion
//	}
//	
//	
//	
//}
//public static void main(String[] args) {
//	int n = 1;
//	System.out.println("Recusive call");
//	method(n);
//	
//}
//
//}
//public class RecursionJava {
//static void method(int n)
//{
//	if(n>0)
//	{
//		method(n-1);//head recursion
//		System.out.println(n);
//		
//	}
//	
//}
//public static void main(String[] args) {
//	int n = 9;
//	System.out.println("Recusive call");
//	method(n);
//	
//}
//
//}
//public class RecursionJava {
//static int fact(int n)
//{
//	if(n<=0)
//	{
//		return 1;
//	}
//	else
//	{
//		return (n*(fact(n-1)));
//	}
//}
//public static void main(String[] lk) {
//	System.out.print("Fibonacci of a number: ");
//	System.out.print(fact(5));
//}
//
//}
//public class RecursionJava {
//static int fibo(int n)
//{
//	if(n==1)
//	{
//		return 0;
//	}
//	else if(n==2)
//	{
//		return 1;
//	}
//	
//	else
//	{
//		return fibo(n-1) + fibo(n-2);
//	}
//}
//public static void main(String[] lk) {
//	System.out.print("Fibonacci of a number: ");
//	System.out.print(fibo(7));
//}
//
//}
//nested recursion
//public class RecursionJava{
//	int fun(int n)
//	{
//		if(n>100)
//		{
//			return n-10;
//		}
//		return fun(fun(n+11));
//	}
//	public static void main(String[] z)
//	{
//		RecursionJava r = new RecursionJava();
//		int num = 98;
//		int b = r.fun(num);
//		System.out.println(b);
//	}
//}
//tree recursion
//public class RecursionJava {
//static void method(int n)
//{
//	if(n>0)
//	{
//		System.out.println(n);
//		method(n-1);
//		method(n-1);
//		
//	}
//	
//}
//public static void main(String[] args) {
//	int n = 3;
//	System.out.println("Recusive call");
//	method(n);
//	
//}
//
//}

//public class RecursionJava{
//	String binary(int num)
//	{
//		String s ="";
//		while(num>0)
//		{
//			s=(num%2)+s;
//			num=num/2;
//		}
//		return s;
//	}
//	public static void main(String[] args) {
//		RecursionJava j = new RecursionJava();
//		String x =j.binary(12);
//		System.out.println(x);
//	}
//}