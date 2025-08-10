package Treecolor;

public class Redblack {
	int data;
	Redblack left,right,parent;
	boolean color;
	static final boolean RED=true;
	static final boolean BLACK=false;
	Redblack(int data){
		this.data=data;
		this.color=RED;
		this.left=null;
		this.right=null;
		this.parent=null;
	}

}
