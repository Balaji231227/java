package singledharun;

public class Singlyll {
      Node head=null;
      void inBegin(int data) {
    	  Node newNode=new Node(data);	
    	  newNode.next=head;
    	  head=newNode;
      }
      void display() {
    	  if(head==null) {
    		  System.out.println("naathada leodass");
    		  return;
    	  }
    	  Node current=head;
    	  while(current.next!=null) {
    		  System.out.print(current.data+"--->");
    		  current=current.next;
    		  
    	  }
    	  System.out.println(current.data);
      }
      void delete(int val) {
    	  if(head==null) {
    		  System.out.println("ll is empty");
    		  return;
    	  }
    	  if(head.data==val) {
    		  head=head.next;
    		  return;
    	  }
    	  Node current=head;
    	  while(current.next!=head) {
    		  System.out.print(current.data+"--->");
    		  current=current.next;
    		  
    		  
    	  }
    	  System.out.println(current.data);
      }
}
