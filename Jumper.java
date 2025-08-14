package Algorithm;
public class Jumper {
	    public static void main(String[] args) {
	        int[] arr = {3,2,5,1,2,1,1};
	        int position = 0;   
	        if (position >= 0 && position < arr.length) {
	            System.out.println("Jump " +arr[position]+" indexes from position "+position);
	        } else {
	            System.out.println("Invalid position");
	        }
	    }
	}

