package pers.pingweibo.interview.tree;

public class main {

	public static void main(String[] args) {
		TreeNode<String> root = new TreeNode<String>("中国");
		TreeNode<String> r1 = new TreeNode<String>("四川");
		TreeNode<String> r2 = new TreeNode<String>("广东");
		TreeNode<String> r3 = new TreeNode<String>("成都");
		TreeNode<String> r4 = new TreeNode<String>("泸州");
		TreeNode<String> r5 = new TreeNode<String>("广州");
		root.addChildNode(r1);
		root.addChildNode(r2);
		r1.addChildNode(r3);
		r1.addChildNode(r4);
		r2.addChildNode(r5);
		root.display(root, 2);
	}
}
