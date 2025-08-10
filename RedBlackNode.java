package Treecolor;

public class RedBlackNode {
	    private Redblack root;




	    private void rotateLeft(Redblack  node) {

	    	Redblack  rightChild = node.right;

	        node.right = rightChild.left;

	        if (rightChild.left != null) {

	            rightChild.left.parent = node;

	        }

	        rightChild.parent = node.parent;

	        if (node.parent == null) {

	            root = rightChild;

	        } else if (node == node.parent.left) {

	            node.parent.left = rightChild;

	        } else {

	            node.parent.right = rightChild;

	        }

	        rightChild.left = node;

	        node.parent = rightChild;

	    }




	    private void rotateRight(Redblack node) {

	    	Redblack  leftChild = node.left;

	        node.left = leftChild.right;

	        if (leftChild.right != null) {

	            leftChild.right.parent = node;

	        }

	        leftChild.parent = node.parent;

	        if (node.parent == null) {

	            root = leftChild;

	        } else if (node == node.parent.right) {

	            node.parent.right = leftChild;

	        } else {

	            node.parent.left = leftChild;

	        }

	        leftChild.right = node;

	        node.parent = leftChild;

	    }




	    private void fixInsert(Redblack  node) {

	        while (node.parent != null && node.parent.color == Redblack .RED) {

	            if (node.parent == node.parent.parent.left) {

	            	Redblack  uncle = node.parent.parent.right;

	                if (uncle != null && uncle.color == Redblack .RED) {

	                    node.parent.color = Redblack .BLACK;

	                    uncle.color = Redblack .BLACK;

	                    node.parent.parent.color = Redblack .RED;

	                    node = node.parent.parent;

	                } else {

	                    if (node == node.parent.right) {

	                        node = node.parent;

	                        rotateLeft(node);

	                    }

	                    node.parent.color = Redblack .BLACK;

	                    node.parent.parent.color = Redblack .RED;

	                    rotateRight(node.parent.parent);

	                }

	            } else {

	            	Redblack  uncle = node.parent.parent.left;

	                if (uncle != null && uncle.color == Redblack .RED) {

	                    node.parent.color = Redblack .BLACK;

	                    uncle.color = Redblack .BLACK;

	                    node.parent.parent.color = Redblack .RED;

	                    node = node.parent.parent;

	                } else {

	                    if (node == node.parent.left) {

	                        node = node.parent;

	                        rotateRight(node);

	                    }

	                    node.parent.color = Redblack .BLACK;

	                    node.parent.parent.color = Redblack .RED;

	                    rotateLeft(node.parent.parent);

	                }

	            }

	        }

	        root.color = Redblack .BLACK;

	    }




	    public void insert(int data) {

	    	Redblack  newNode = new Redblack (data);

	        if (root == null) {

	            root = newNode;

	            root.color = Redblack .BLACK;

	            return;

	        }

	        Redblack  parent = null, temp = root;

	        while (temp != null) {

	            parent = temp;

	            if (data < temp.data) {

	                temp = temp.left;

	            } else {

	                temp = temp.right;

	            }

	        }

	        newNode.parent = parent;

	        if (data < parent.data) {

	            parent.left = newNode;

	        } else {

	            parent.right = newNode;

	        }

	        fixInsert(newNode);

	    }




	    private void inOrderTraversal(Redblack  node) {

	        if (node != null) {

	            inOrderTraversal(node.left);

	            System.out.print(node.data + (node.color == Redblack .RED ? "(R) " : "(B) "));

	            inOrderTraversal(node.right);

	        }

	    }




	    public void inOrder() {

	        inOrderTraversal(root);

	        System.out.println();

	    }

	}

