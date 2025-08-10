package OopsJava;

//default cons 
//public class ConstructorJava {
//	ConstructorJava()
//	{
//		System.out.println("hi naan dhan da! constructor.");
//	}
//	public static void main(String[] args) {
//		ConstructorJava cj1 = new ConstructorJava();
//		ConstructorJava cj2 = new ConstructorJava();
//		ConstructorJava cj3 = new ConstructorJava();
//	
//}
//}
//parameterized cons
//public class ConstructorJava {
//	int roll;
//	String c;
//	ConstructorJava(int roll,String c)
//	{
//		this.roll = roll;
//		this.c = c;
//		
//	}
//	void dis()
//	{
//		System.out.println(roll+" nan dhan da leo "+c);
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		ConstructorJava cj1 = new ConstructorJava(4,"dinesh");
//		ConstructorJava cj2 = new ConstructorJava(5,"leo");
//		ConstructorJava cj3 = new ConstructorJava(6,"parthiban");
//		ConstructorJava cj4 = new ConstructorJava(7,"leodas");
//		cj1.dis();
//		cj2.dis();
//		cj3.dis();
//		cj4.dis();
//		sc.close();
//		
//		
//	
//}
//}
//super keyword
//public class ConstructorJava {
//	int roll;
//	String c;
//	ConstructorJava()
//	{
//		super();
//		
//	}
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		ConstructorJava cj1 = new ConstructorJava();
//		ConstructorJava cj2 = new ConstructorJava();
//		ConstructorJava cj3 = new ConstructorJava();
//		ConstructorJava cj4 = new ConstructorJava();
//		
//		sc.close();
//		
//		
//	
//}
//}
//multiple constructor
//public class ConstructorJava {
//	int roll;
//	String c;
//	ConstructorJava(int roll,String c)
//	{
//		this.roll = roll;
//		this.c = c;
//		
//	}
//	ConstructorJava()
//	{
//		System.out.println("hi naan dhan da leo");
//		
//	}
//	ConstructorJava(String c,int roll)
//	{
//		this.roll = roll;
//		this.c = c;
//		
//	}
//	void dis()
//	{
//		System.out.println(roll+" nan dhan da leo "+c);
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		ConstructorJava cj1 = new ConstructorJava(4,"dinesh");
//		ConstructorJava cj2 = new ConstructorJava();
//		ConstructorJava cj3 = new ConstructorJava("parthiban",89);
//		ConstructorJava cj4 = new ConstructorJava(7,"leodas");
//		cj1.dis();
//		cj2.dis();
//		cj3.dis();
//		cj4.dis();
//		sc.close();
//		
//		
//	
//}
//}
//array of objects
//public class ConstructorJava{
//	String name;
//	int roll;
//	public ConstructorJava()
//	{
//		System.out.println("hii naan dhan da leo");
//	}
//	public ConstructorJava(String name,int roll)
//	{
//		this.name = name;
//		this.roll = roll;
//	}
//	void disp()
//	{
//		System.out.println(name+" Sathya da naanu "+roll);
//	}
//	public static void main(String[] z)
//	{
//		Scanner sc =new Scanner(System.in);
//		ConstructorJava[] cr = new ConstructorJava[50];
//		cr[0]=new ConstructorJava();
//		cr[1]=new ConstructorJava("dinesh",14);
//		cr[0].disp();
//		cr[1].disp();
//		sc.close();
//	}
//}
//array of objects iteration
//public class ConstructorJava{
//String name;
//int roll;
//public ConstructorJava()
//{
//	System.out.println("hii naan dhan da leo");
//}
//public ConstructorJava(String name,int roll)
//{
//	this.name = name;
//	this.roll = roll;
//}
//void disp()
//{
//	System.out.println(name+" Sathya da naanu "+roll);
//}
//public static void main(String[] z)
//{
//	
//	ConstructorJava[] cr = new ConstructorJava[50];
//	cr[0]=new ConstructorJava();
//	cr[1]=new ConstructorJava("dinesh",14);
//	cr[2]=null;
//	for(ConstructorJava i:cr)
//	{
//		System.out.println(i);
//	}
//}
//}
//this keyword
//public class ConstructorJava {
//int roll;
//String c;
//ConstructorJava()
//{
//	System.out.println("hii");
//}
//ConstructorJava(int roll,String c)
//{
//	this(); //invoke current class constructor
//	this.roll = roll;//invoke instance variable
//	this.c = c;
//	
//}
//void meth()
//{
//	System.out.println(this);//used to refer the current class instance
//	this.dis(this);//invoke instance method() and passing this as a parameter
//
//}
//void dis(ConstructorJava g)
//{
//	System.out.println(g);
//	
//	System.out.println(roll+" "+c);
//}
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	ConstructorJava cj1 = new ConstructorJava(4,"dinesh");
//	System.out.println(cj1);
//	   
//	cj1.meth();
//	
//	sc.close();
//	
//	
// 
//}
//}