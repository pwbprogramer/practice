package pers.pingweibo.interview.Datastructure.tree.redOrBlackTree;

public class TestTree {
	
	private Node root;
	
	public void insert(int value) {
		Node child = new Node(null, null, null, value);
		Node currentRoot = root;
		Node parent = null;
		while(currentRoot!=null) {
			parent = currentRoot;
			if(child.key<currentRoot.key) {
				currentRoot = currentRoot.Left;
			}else {
				currentRoot = currentRoot.Right;
			}
		}
		child.Parent = parent;
		if(parent==null) {
			root = child;
			return;
		}
		if(child.key<parent.key) {
			parent.Left=child;
		}else {
			parent.Right=child;
		}
	}
	
	public void ahead() {
		show(root);
	}
	
	public void show(Node node) {
		if(node!=null) {
			System.out.println(node.key);
			show(node.Left);
			show(node.Right);
		}
	}
	
	public class Node {
		Node Parent;
		Node Left;
		Node Right;
		int key;
		public Node(Node Parent,
					Node Left,
					Node Right,
					int key) {
			this.key = key;
			this.Left = Left;
			this.Right = Right;
			this.Parent = Parent;
		}
	}

}
