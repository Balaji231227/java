//package ExceptionHandling;
//Basic program for exception 
//import java.util.Scanner;
//public class ExceptionsJava {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		try {
//			System.out.print("Enter the value of n: ");
//			int n = sc.nextInt();
//			System.out.print("Enter the value of m: ");
//			int m = sc.nextInt();
//			System.out.println(n/m);
//		}
//		catch(ArithmeticException e)
//		{
//			System.out.println(e.getMessage());
//		}
//		System.out.println("vankkam da mapla");
//		sc.close();
//	}
//
//} 
//multiple exceptions 
//import java.util.Scanner;
//public class ExceptionsJava {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		try {
//			String s = "Karuppannan";
//			System.out.print("Enter the value of n: ");
//			int n = sc.nextInt();
//			System.out.print("Enter the value of m: ");
//			int m = sc.nextInt();
//			System.out.println(n/m);
//			char ch = s.charAt(19);
//			System.out.println("Last Line"+ch);
//		}
//		catch(ArithmeticException e)
//		{
//			System.out.println(e.getMessage());
//		}
//		catch(StringIndexOutOfBoundsException e)
//		{
//			System.out.println(e.getMessage());
//		}
//		System.out.println("vankkam da mapla");
//		sc.close();
//	}
//
//}
//finally block
//public class ExceptionsJava {
//	public static void main(String[] args) {
//		try {
//			int[] arr = new int[7];
//			arr[11]=8;
//		}
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println(e.getMessage());
//		
//			return;
//		}
//		finally {
//			System.out.println("Hii i am finally block!");
//		}
//		
//	}
//
//}
//nested try blocks
//public class ExceptionsJava {
//	public static void main(String[] args) {
//		try {//outer try block
//			System.out.println("hii iam outer try block");
//			try {//inner try block
//				System.out.println("hii iam inner try block");
//				int n =8;
//				int m = 0;
//				System.out.println(n/m);
//				}
//			catch(ArithmeticException e)
//			{
//				System.out.println(e.getMessage());
//			}
//			int[] arr = new int[7];
//			arr[11]=8;
//		}
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println(e.getMessage());
//		
//			return;
//		}
//		catch(Exception e)
//		{
//			System.out.println(e.getMessage());
//		}
//		finally {
//			System.out.println("Hii i am finally block!");
//		}
//		
//	}
//
//}
//Throw and throwable keywords
//public class ExceptionsJava {
//void n() throws ArrayIndexOutOfBoundsException 
//	{
//		int[] arr = new int[5];
//		arr[9]=9;
//		throw new ArrayIndexOutOfBoundsException();
//	}
//	void p()
//	{		try {
//			n();
//			System.out.println("P method");
//		}
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println("Array index out of bound");
//		}
//		finally {
//			System.out.println("Finally block executed");
//		}
//	}
//	public static void main(String[] args) {
//		ExceptionsJava e = new ExceptionsJava();
//		e.p();
//		System.out.println("Program reach the end");
//	}
//
//}
//For Checked(CompileTime Exception) extends the class Exception 
//For Checked exception throws must be placed in the method signature
//For Unchecked (Runtime Exception) extends the class RuntimeException 
//For Unchecked exception throws is an optional
//
//class InsufficientBalanceException extends RuntimeException{
//	InsufficientBalanceException(String message){
//		super(message);
//	}
//}
//
//class ATM{
//	private int balance=20000;
//	void withdraw(int amount)  {
//		if(amount>balance) {
//			throw new InsufficientBalanceException("Insufficient Balance. Available Balance is "+balance);
//		}
//		balance-=amount;
//		System.out.println("Withdrawal successful. Remaining balance is "+ balance);
//	}
//}
//
//          
//public class ExceptionsJava {
//	public static void main(String[] args) {
//		ATM atm=new ATM();
//		try {
//			atm.withdraw(16000);
//		}
//		catch(InsufficientBalanceException e) {
//			System.out.println(e.getMessage());
//		}
//	}
//}
//public class ExceptionsJava{
//	public void finalize()
//	{
//		System.out.println("object is garbage collected!");
//	}
//	public static void main(String[] args) {
//		ExceptionsJava e =  new ExceptionsJava();
//		e=null;
//		System.gc();
//	}
//}

