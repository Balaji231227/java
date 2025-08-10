package treeNode;
public class Tree {
          Node root=null;
		static final int NODE_COUNT=100;
		void insert(int data) {
			Node newNode=new Node(data);
			if(root==null) {
				root=newNode;
				return;
			}
			BinaryNode q=new BinaryNode(NODE_COUNT);
			q.enQueue(root);
			while(!q.isEmpty()) {
				Node current=q.deQueque();
				if(current.left==null) {
					current.left=newNode;
					return;
				}
				else {
					q.enQueue(current.left);
				}
				if(current.right==null) {
					current.right=newNode;
					return;
				}
				else {
					q.enQueue(current.right);
				}
			}
		}
		void delete(int key) {
			if(root==null) {
				System.out.println("Empty Tree");
				return;
			}
			Node keyNode=null,current=null,parent=null;
			BinaryNode q=new BinaryNode(NODE_COUNT);
			while(!q.isEmpty()) {
				current=q.deQueque();
				if(current.data==key) {
					keyNode=current;
				}
				if(current.left!=null) {
					parent=current;
					q.enQueue(current.left);
				}
				if(current.right!=null) {
					parent=current;
					q.enQueue(current.right);
				}
			}
			if(keyNode==null) {
				System.out.println("Value not in the tree");
				return;
			}
			keyNode.data=current.data;
			if(parent.right==current) {
				parent.right=null;
			}
			else {
				parent.left=null;
			}
		}
		public void inOrder(Node root) {
	        if (root != null) {
	            inOrder(root.left);
	            System.out.print(root.data + " ");
	            inOrder(root.right);
	        }
	    }
	    public void inOrder() {
	        System.out.print("In-order: ");
	        inOrder(root);
	        System.out.println();
	    }
	    public void preOrder(Node root) {
	        if (root != null) {
	            System.out.print(root.data + " ");
	            preOrder(root.left);
	            preOrder(root.right);
	        }
	    }
	    public void preOrder() {
	        System.out.print("Pre-order: ");
	        preOrder(root);
	        System.out.println();
	    }
	    // Post-order Traversal (Left, Right, Root)
	    public void postOrder(Node root) {
	        if (root != null) {
	            postOrder(root.left);
	           postOrder(root.right);
	            System.out.print(root.data + " ");
	        }
	    }
	    public void postOrder() {
        System.out.print("Post-order: ");
	        postOrder(root);
	        System.out.println();
	    }
	}







