//package StringsJava;
//import java.util.Arrays;
//import java.util.Scanner;
//public class StringMethods {
//	Scanner sc = new Scanner(System.in);
//	String s1="karuppan";
//	String s2=new String("Sathyan");
//	char ch[]=new char[] {'A','B','C','D','E'};
//	String s3 = new String(ch);
//	
//
//}
//public class StringMethods
//{
//	public static void main(String[] z)
//	{
//		Scanner sc = new Scanner(System.in);
//		String s = "Karuppannan";
//		String r = "";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			r+=s.charAt(i);
//		}
//		System.out.println(r);
//		
//		
//	}
//}
//public class StringMethods
//{
//	public static void main(String[] z)
//	{
//		Scanner sc = new Scanner(System.in);
//		String s = "karuppannan";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'||s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
//				
//			{
//				System.out.print(s.charAt(i)+" ");
//			}
//		}
//		sc.close();
//	}
//}
//low to up or up to low
//public class StringMethods
//{
//	public static void main(String[] z)
//	{
//		Scanner sc = new Scanner(System.in);
//		String s = "Naan Dhan Da Leo Leo Das";
//		char c;
//		for(int i=0;i<s.length();i++)
//		{
//			c = s.charAt(i);
//			if(c>='a' && c<='z')
//			{
//				System.out.print(c-=32);
//				
//			}
//			
//			
//			else if(c>='A' && c<='Z')
//			{
//				System.out.print(c+=32);
//			}
//			else {
//				System.out.print(" ");
//			}
//			
//			
//		}
//	}
//}
//public class StringMethods{
//	public static void main(String[] z)
//	{
//		Scanner sc = new Scanner(System.in);
//		String s = "Malayalam";
//		String c= "";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			c += s.charAt(i);
//			
//		}
//		if(s.equalsIgnoreCase(c))
//		{
//			System.out.println("It is an palindrome");
//		}
//		else
//		{
//			System.out.println("not a palindrome");
//		}
//	}
//}
//public class StringMethods{
//	public static void main(String[] z)
//	{
//		Scanner sc = new Scanner(System.in);
//		String s = "Malayalam";
//		String c= "manan";
//		String g = (s.concat(c));
//		String j=(s+c);
//		System.out.println(j);
//		System.out.println(g);
//		System.out.println(5+6+"hii"+6+99);
//		sc.close();
//	}
//}
//public class StringMethods{
//	public static void main(String[] z)
//	{
//		Scanner sc = new Scanner(System.in);
//		String s = "Malayalaman ";
//		String c= "Malabalam";
//		Boolean g = (s.equals(c));
//		Boolean b = (s.equalsIgnoreCase(c));
//		System.out.println(g);
//		System.out.println(b);
//		System.out.println(s.compareTo(c));
//		System.out.println(s.toLowerCase());
//		System.out.println(c.toUpperCase());
//		System.out.println(s.indexOf('a'));
//		System.out.println(s.lastIndexOf('l'));
//		System.out.println(s.lastIndexOf('l',4));
//		System.out.println(s.indexOf('v'));
//		System.out.println(s.contains("yal"));
//		System.out.println(c.substring(5,9));
//		System.out.println(s.trim());
//		System.out.println(s.replace("Mal", "Bal"));
//		System.out.println(c.replaceAll("[a,l,b]", "*"));
//		System.out.println(s.startsWith("M"));
//		sc.close();
//	}
//}
//count elements in array
//public class StringMethods{
//	public static void main(String[] z)
//	{
//		Scanner sc = new Scanner(System.in);
//		String s = "Malayalaman";
//		String count = "";
//		int c =0;
//		for(int i=0;i<s.length();i++)
//		{
//			 count += s.charAt(i);
//			 c++;
//		}
//		System.out.println(c);
//		sc.close();
//	}
//}
//public class StringMethods{
//	public static void main(String[] z)
//	{
//		Scanner sc = new Scanner(System.in);
//		String s = "Malayalaman";
//		String sa[] = s.split(" ");
//		String a ="";
//		for(String f:sa)
//		{
//			char ch=f.charAt(0);
//			if(ch>='a'&&ch<='z')
//			{
//				ch=(char)(ch-32);
//			}
//			a+=ch;
//			for(int i=1;i<f.length();i++)
//			{
//				a+=s.charAt(i);
//			}
//			a+=" ";
//		}
//		System.out.println(a);
//		sc.close();
//	}
//}          
//public class StringMethods{
//	public static void main(String[] z)
//	{
//		Scanner sc = new Scanner(System.in);
//		String s = "Mala yalama n";
//		String h =s.toLowerCase();
//		String r ="";
//		char d = s.charAt(4);
//		for(int i=0;i<s.length();i++)
//		{
//			int f=0;
//			char c=h.charAt(i);
//			if(r.indexOf(c)>=0)
//			{
//				continue;
//			}
//			r+=c;
//			if(d!=c)
//			{
//			for(int j=0;j<s.length();j++)
//			{
//				char a = h.charAt(j);
//				if(c==a)
//				{
//					f++;
//				}
//			}
//			System.out.println(c+" : "+f);
//			}
//			
//			
//		sc.close();
//	}
//	}
//}
//anagram o not
//public class StringMethods{
//public static void main(String[] z)
//{
//	char ch[] = new char[] {'A','E','I','O','U'};
//	String s3 = new String(ch);
//	char ch1[] = new char[] {'U','O','I','E','A'};
//	String s4 = new String(ch1);
//	if(s3.length()==s4.length())
//	{
//		Arrays.sort(ch);
//		Arrays.sort(ch1);
//		
//			if(Arrays.equals(ch,ch1))
//			{
//				System.out.println(ch);
//		    }
//			else
//			{
//			System.out.println(ch1);
//      		}
//		
//		
//	}
//}
//}
//public class StringMethods{
//public static void main(String[] z)
//{
//	String s = "CCrickKetTt";
//	
//	int[] arr = new int[26];
//	int[] arr1 = new int[26];
//	for(char ch:s.toCharArray())
//	{
//		if(ch>='a'&&ch<='z')
//		{
//		arr[ch-97]++;
//		}
//		else if(ch>='A'&&ch<='Z'){
//			arr1[ch-65]++;
//		}
//	}
//		
//	for(int i=0;i<arr.length;i++)
//	{
//		if(arr[i]!=0)
//		{
//			System.out.println((char)(i+97)+" : "+arr[i]);
//			
//		}
//		if(arr1[i]!=0)
//		{
//			System.out.println((char)(i+65)+" : "+arr1[i]);
//			
//		}
//		
//	}
//	
//	
//}
//}
//public class StringMethods{
//public static void main(String[] z)
//{
//	String s = "CCrrrickKetTt";
//	
//	int[] arr = new int[128];
//	
//	for(char ch:s.toCharArray())
//	{
//		
//		arr[ch]++;
//		
//	}
//	int max=arr['A'];
//	char c='A';
//	for(int i='A';i<'Z';i++)
//	{
//		if(arr[i]>max)
//		{
//			max=arr[i];
//			c=(char)(i);
//		}
//	}
//		
//	for(int i='a';i<'z';i++)
//	{
//		if(arr[i]>max)
//		{
//			max=arr[i];
//			c=(char)(i);
//		}
//		
//	}
//	for(int i='0';i<'9';i++)
//	{
//		if(arr[i]>max)
//		{
//			max=arr[i];
//			c=(char)(i);
//		}
//		
//	}
//	System.out.println(c+" : "+max);
//	
//	
//}
//}
