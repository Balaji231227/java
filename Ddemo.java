package stack;
class Dharunkasi{
	int data;
	Dharunkasi next;
	Dharunkasi prev;
}
class Eshwer extends Dharunkasi{
	Dharunkasi head;
	Dharunkasi tail;
	void insertBegin(int data) {
		Dharunkasi dk=new Dharunkasi();
		dk.data=data;
		dk.next=null;
		dk.prev=null;
		if(head==null) {
			head=dk;
			tail=dk;
		}else {
			head.prev=dk;
			dk.next=head;
			head=dk;
		}
	}
	void insertEnd(int data) {
		Dharunkasi dk=new Dharunkasi();
		dk.data=data;
		dk.next=null;
		dk.prev=null;
		if(head==null) {
			head=dk;
			tail=dk;
		}else {
			tail.next=dk;
			dk.prev=tail;
			tail=dk;
		}
	}
	void insertpos(int data,int pos) {
		Dharunkasi dk=new Dharunkasi();
		dk.data=data;
		dk.next=null;
		dk.prev=null;
		if(pos==0) {
			insertBegin(data);	
		}else {
			Dharunkasi temp=head;
			for(int i=1;i<=pos-1;i++) {
				temp=temp.next;
				
			}
			temp.next.prev=dk;
			dk.next=temp.next;
			temp.next=dk;
			dk.prev=temp;
			
		}
		
	}
	void delBegin() {
		Dharunkasi temp=head;
	    if(head==null) {
	    	System.out.println("thambi");
	    	return;
	    	}
	    else {
	    	temp=temp.next;
	    	head=head.next;
	    }
	}void delEnd(){
		Dharunkasi temp=head;
		if(head==null) {
			System.out.println("thambi");
			return;
		}
		else {
			tail=tail.prev;
			tail.next.prev=null;
			tail.next=null;
		}
	}
	void delpos(int pos) {
		Dharunkasi temp=head;
		Dharunkasi pre=null;
		if(head==null) {
			System.out.println("thambi");
			return;
		}
		else {
			for(int i=1;i<=pos;i++) {
				pre=temp;
				temp=temp.next;
				
			}
			temp.next.prev=pre;
			pre.next=temp.next;
			temp.next=null;
			temp.prev=null;
			
		}
		
	}
	void search(int key) {
		Dharunkasi temp=head;
		int pos=0;
	     boolean found=false;
	     while(temp!=null){
	    	 if(temp.data==key) {
	    		 System.out.println("element "+key+" found the pos");
	    		 found=true;
	    		 break;
	    	 }
	    	 temp=temp.next;
	    	 pos++;
	     }
		if(!found) {
			System.out.println("element "+key+" not found in the pos");
		}
	}
	
	
	void display() {
		Dharunkasi temp=new Dharunkasi();
		temp=head;
		while(temp!=null) {
			System.out.println(temp.data+" ");
			temp=temp.next;
			
		}
	}
		void revDisplay() {
			Dharunkasi temp=new Dharunkasi();
			temp=tail;
			while(temp!=null) {
				System.out.println(temp.data+"");
				temp=temp.prev;
}
}
}
public class Ddemo extends Eshwer {
public static void main(String[]args) {
	Ddemo dd=new Ddemo();
	dd.insertBegin(1);
	dd.insertBegin(2);
	dd.insertBegin(3);
	dd.insertEnd(10);
	dd.insertEnd(56);
	dd.display();
	dd.revDisplay();
	dd.insertpos(7,2 );
	dd.display();
	dd.delBegin();
	dd.display();
	dd.delEnd();
	dd.display();
	dd.delpos(2);
	dd.display();
	dd.search(100);
	dd.display();
}
}
