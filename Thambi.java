package Naathanda;
import java.util.Scanner;
public class Thambi {
	public static void main(String[]args) {
		String str="baLAji";
		String Str1=" ";
		char ch;
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			if(ch>=65 &&ch<=90) {
				ch=(char)(ch+32);
				
			}else if(ch>=95&& ch<=122){
				ch=(char)(ch-32);
			}
			Str1=Str1+ch;
		}
		
		System.out.println(Str1);
	}

}
