package stack;
class Node{
	int data;
	Node next;
}
class code extends Node{
	Node head=null;
     void insertBegin(int data) {
	 Node dk=new Node();
	 dk.data=data;
	 dk.next=null;
	 if(head==null) {
		 head=dk;
		 dk.next=head;
	 }else {
		 Node temp=head;
		 while(temp.next!=head) {
			 temp=temp.next;
		 }
		 temp.next=dk;
		 dk.next=head;
		 head=dk;
	 }
	 }
void insertEnd(int data) {
	Node dk=new Node();
	dk.data=data;
	dk.next=null;
	if(head==null) {
		head=dk;
		dk.next=head;
	}else {
		Node temp=head;
		while(temp.next!=head) {
			temp=temp.next;
		}
		dk.next=head;
		temp.next=dk;
		
	}}
void insertpos(int pos,int data) {
	Node temp=head;
	Node dk=new Node() ;
	dk.data = data;
	if(pos==0) {
		insertBegin(data);
	}int i;
	for( i=1;i<pos&&temp.next!=head;i++) {
		temp=temp.next;
	}if(temp.next==head) {
		insertEnd(data);
	}else {
		dk.next=temp.next;
		temp.next=dk;
	}
}
void delBegin(){
    if(head==null) {
    	System.out.println("leodas");
    	}
    Node temp=head;
   while(temp.next!=head) {
	   temp=temp.next;   
    }
   head=head.next;
   temp.next=head;
}
void delEnd() {
	if(head==null) {
		System.out.println("leodas");
	}
	Node temp=head;
	while(temp.next.next!=head) {
		temp=temp.next;
	}
	
	   temp.next=head;
	}
void display() {
	Node temp=head;
	while(temp.next!=head) {
		System.out.println(temp.data);
		temp=temp.next;
	}
	System.out.println(temp.data);
}}
public class Cirda extends code{
public static void main(String[]args){
	Cirda n=new Cirda();
	n.insertBegin(5);
	n.insertBegin(4);
	n.insertBegin(3);
	n.insertBegin(2);
	n.insertEnd(7);
	n.insertEnd(8);
	n.insertpos(4, 6);
	n.delBegin();
	n.delEnd();
	n.display();
}
}
