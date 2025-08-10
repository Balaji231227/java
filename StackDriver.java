package stack;

import java.net.MulticastSocket;

public class StackDriver {
public static void main(String[]args) {
	StackArr sa=new StackArr();
	System.out.println(sa.capacity);
	sa.push("balaji");
	sa.push("eshwar");
	sa.push("Suki");
	sa.push("");
	sa.push("dharun");
	sa.push("maddy");
	
}
}
