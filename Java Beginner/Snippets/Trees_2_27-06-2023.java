import java.util.*;

class Main {
	
	// Build Treee
	public static class Node {
		int val;
		Node left;
		Node right;
		
		public Node(int val) {
			this.val = val;
			this.left = this.right = null;
		}
	}
	
	public static Node makeTree(int[] pre, int pstart, int pend, 
								int[] in, int istart, int iend) {
		// base case
		if(pstart > pend || istart > iend) {
			return null;
		}
		// create root node using first element of pre 
		Node node = new Node(pre[pstart]);
		// find index of root node in inorder 
		int indx = 0;
		for(int i = istart; i <= iend; i++) {
			if(in[i] == pre[pstart]) {
				indx = i;
				break;
			}
		}
		// number of element in left subtree 
		int nele = indx - istart;
		// make call to build tree for left side  and attach left result in node.left 
		node.left = makeTree(pre, pstart + 1, pstart + nele, in, istart, indx - 1);
		
		// make call to build tree for right side  and attach left result in node.right 
		node.right = makeTree(pre, pstart + nele + 1, pend, in, indx + 1, iend);
		
		return node;
	}
	
	public static Node buildTree(int[] pre, int[] in) {
		Node node = makeTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
		return node;
	}
	
	
	public static void display(Node node) {
		if(node == null) {
			return;
		}
		
		String str = "";
		if(node.left != null) {
			str += node.left.val;
		}
		str += " <- " + node.val + " -> ";
		if(node.right != null) {
			str += node.right.val;
		}
		System.out.println(str);
		display(node.left);
		display(node.right);
	}
	
	
	
	// inorder using recursion
	public static void printInorder(Node node) {
		if(node == null) {
			return;
		}
		// pre area
		printInorder(node.left);
		// in area
		System.out.print(node.val + " ");		
		printInorder(node.right);
		//post area
	}
	
	// inorder using iterative method
	
	public static class Pair {
		Node node;
		int state;
		Pair(Node node, int state) {
			this.node = node;
			this.state = state;
		}
	}
	
	public static void printInorder_Itr(Node node) {
		Stack<Pair> st = new Stack<>();
		// push root with initial state in stack => call printInorder(root);
		st.push(new Pair(node, 0));
		while(st.size() > 0) {
			Pair top = st.peek();
			if(top.state == 0) {
				// PRE-AREA increment in state and add left child
				top.state++;
				if(top.node.left != null) {
					st.push(new Pair(top.node.left, 0));
				}
			} else if(top.state == 1) {
				// IN-AREA print, increment in state and add right child
				System.out.print(top.node.val + " ");
				top.state++;
				if(top.node.right != null) {
					st.push(new Pair(top.node.right, 0));
				}
			} else {
				// POST-AREA pop
				st.pop();
			}
		}
	}
	
	
	
	
	
	
	
	public static void main(String args[]) {
		int[] pre = {10, 20, 40, 50, 60, 30, 70, 90, 80};
		int[] in = {40, 20, 60, 50, 10, 70, 90, 30, 80};
		
		Node root = buildTree(pre, in);
		display(root);
		
	}
}