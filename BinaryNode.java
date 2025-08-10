package treeNode;
 class BinaryNode {
		Node arr[];
	int capacity,front,rear,size;
	BinaryNode(int capacity){
			arr=new Node[capacity];
		this.capacity=capacity;
		rear=-1;
		}
		boolean isEmpty() {
			return size==0;
		}
		boolean isFull() {
			return size==capacity;
		}
		void enQueue(Node ob) {
			if(isFull()) {
				System.out.println("Overflow");
				return;
			}
			rear=(rear+1)%capacity;
			arr[rear]=ob;
			size++;
		}
		Node deQueque() {
			if(isEmpty()) {
				System.out.println("Queue Underflow");
				return null;
			}
             Node ob=arr[front];
			front=(front+1)%capacity;
			size++;
			return ob;
		}
	}

