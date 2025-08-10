package Naathanda;
import java.util.Arrays;
import java.util.Scanner;
public class Boys {
	    public static boolean Boys(String st) {
	        String stArr[]  = {"qwertyuiop","asdfghjkl","zxcvbnm"}; 
	        char ch=st.charAt(0);
	        int ind=-1;
	        for(int i=0;i<stArr.length;i++) {
	        	if(stArr[i].indexOf(ch)>=0) {
	        		ind=i;
	        		break;
	        			}
	        		}
	        for(int i=0;i<st.length();i++) {
	        	ch=st.charAt(i);
	        	if(stArr[i].indexOf(ch)>0) {
	        		return false;
	        	}
	        }
	        		return true;
	        		}
	        	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a word: ");
	        String word = sc.nextLine();
	        if (Boys(word)) {
	            System.out.println("same row");
	        } else {  
	            System.out.println("not a same row");
	        }}}
	    			
		
	    
		
	


