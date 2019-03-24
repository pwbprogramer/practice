package pers.pingweibo.interview.Datastructure.tree.redOrBlackTree;


/**
 * 红黑树
 * @author pingweibo
 * 黑高：从任一个节点开始，其黑高都是一样的
 * 左旋：顺时针旋转，从左往右旋 是右孩子的父节点变为以右孩子为根的左节点，把右孩子变为根，把根变为左孩子。
 * 右旋：逆时针旋转，从右往左旋 是左孩子的父节点变为以左孩子为根的右节点，把左孩子变为根，把根变为右孩子。
 * 
 * 树结构的思路就是 从根想起，按照规则一层层考虑；
 *          或者 从树的末尾向上考虑；
 */
public class redOrBlackTree {
	
	
	private Node root = null;
	
	public class Node{
		
		Color color;
		Node parent;
		Node left;
		Node right;
		int key;
		
		public Node(Color color,
				    Node parent,
				    Node left,
				    Node right,
				    int key) {
			this.color = color;
			this.parent = parent;
			this.left = left;
			this.right = right;
			this.key = key;
		}
	}
	
	/**
	 * 从树根的情况开始考虑
	 * @param value
	 */
	public void insert(int value) {
		Node insertNode = new Node(null, null, null, null, value);
		Node tempFather = null;//
		Node treeRoot = root;
		while(treeRoot!=null) {
			tempFather = treeRoot;
			if(insertNode.key<treeRoot.key) {
				treeRoot = treeRoot.left; 
			}else {
				treeRoot = treeRoot.right;
			}
		}
		insertNode.parent = tempFather;
		if(tempFather == null) {
			root = insertNode;
			return;
		}else if(insertNode.key<tempFather.key) {
			tempFather.left=insertNode;
		}else {
			tempFather.right=insertNode;
		}
		insertNode.color = Color.Red;
		fix(insertNode);
	}
	
	/**
	 * 修正(是一个从树脚到树顶的过程，修正颜色的过程，并通过左旋，右旋，来保证树的平衡)
	 * @param insertNode
	 */
	private void fix(Node insertNode) {
		while(insertNode.parent.color==Color.Red) {
			if(insertNode.parent==insertNode.parent.parent.left) {
				Node t = insertNode.parent.parent.right;
				if(t.color==Color.Red) {
					t.color = Color.Black;
					insertNode.parent.color = Color.Black;
					insertNode.parent.parent.color = Color.Red;
					insertNode = insertNode.parent.parent;
				}else if(insertNode == insertNode.parent.right) {
					insertNode = insertNode.parent;
					leftRotate(insertNode);
				}
				insertNode.parent.color = Color.Black;
				insertNode.parent.parent.color = Color.Red;
				rightRotate(insertNode.parent.parent);
			}else {
				Node t = insertNode.parent.parent.left;
				if(t.color==Color.Red) {
					t.color = Color.Black;
					insertNode.parent.color =  Color.Black;
					insertNode.parent.parent.color = Color.Red;
					insertNode = insertNode.parent.parent;
				}else if(insertNode == insertNode.parent.right) {
					insertNode = insertNode.parent;
					leftRotate(insertNode);
				}
				insertNode.parent.color = Color.Black;
				insertNode.parent.parent.color = Color.Red;
				rightRotate(insertNode.parent.parent);
			}
		}
	}
	
	/**
	 * 左旋
	 * 第一步孩子变父亲，考虑孩子的孩子，左旋考虑左孩子
	 * 第二步父亲变孩子
	 * @param indexNode
	 */
	public void leftRotate(Node indexNode) {
		Node rightChild = indexNode.right;
		indexNode.right = rightChild.left;
		if(rightChild.left!=null) {
			rightChild.left.parent = indexNode;
		}
		rightChild.parent = indexNode.parent;
		if(indexNode.parent==null) {
			this.root = rightChild;
		}else if (indexNode == indexNode.parent.left) {
			indexNode.parent.left = rightChild;
		}else {
			indexNode.parent.right = rightChild;
		}
		rightChild.left = indexNode;
		indexNode.parent = rightChild;
	}
	
	/**
	 * 右旋
	 * 第一步孩子变父亲，考虑孩子的孩子，右旋考虑右孩子
	 * 第二步父亲变孩子
	 * @param indexNode
	 */
	public void rightRotate(Node indexNode) {
		Node leftChild = indexNode.left;
		indexNode.left = indexNode.right;
		if(leftChild.right!=null) {
			leftChild.right.parent = indexNode;
		}
		leftChild.parent = indexNode.parent;
		if(indexNode.parent==null) {
			this.root = leftChild;
		}else if(indexNode == indexNode.parent.left) {
			indexNode.parent.left = leftChild;
		}else {
			indexNode.parent.right = leftChild;
		}
		leftChild.right = indexNode;
		indexNode.parent = leftChild;
	}
    
	
	public void show() {
		ahead(this.root);
	}
	
	public void ahead(Node node) {
		if(node!=null) {
			System.out.println(node.key+":"+node.color);
			ahead(node.left);
			ahead(node.right);
		}
	}
}
