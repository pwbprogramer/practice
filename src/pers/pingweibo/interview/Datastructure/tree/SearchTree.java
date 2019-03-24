package pers.pingweibo.interview.Datastructure.tree;



/**
 * 二叉搜索树 左边节点小于根节点(意味着其左子树全部小于此根)，右边节点大于等于根节点(意味着其右子树全部大于等于此根)。
 *       
 * @author pingweibo
 *
 */
public class SearchTree {
	
	
	private Node root = null;
	
	public class Node{
		
		Node left;
		Node right;
		int value;
		
		public Node(Node left,Node right,int value) {
			this.left = left;
			this.right = right;
			this.value = value;
		}
	}
	
	/**
	 * 构建树
	 * @param value
	 */
	public void insert(int value) {
		Node node = new Node(null, null, value);
		if(this.root==null) {
			this.root = node;
		}else {
			Node currentNode = this.root;
			while(true) {
				if(value<currentNode.value) {
					if(currentNode.left!=null) {
						currentNode = currentNode.left;
					}else {
						currentNode.left = node;
						return;
					}
				}else {
					if(currentNode.right!=null) {
						currentNode = currentNode.right;
					}else {
						currentNode.right = node;
						return;
					}
				}
			}
		}
	}
	
	public void showAhead() {
		aheadTree(this.root);
	}
	
	/**
	 * 遍历树 就用递归就好
	 */
	public void aheadTree(Node node) {
		if(node != null) {
			System.out.println(node.value);
			aheadTree(node.left);
			aheadTree(node.right);
		}
		
	}
}
