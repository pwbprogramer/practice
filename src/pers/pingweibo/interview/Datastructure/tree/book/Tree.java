package pers.pingweibo.interview.Datastructure.tree.book;

import java.util.Stack;

/**
 * 二叉搜索树 左节点小于根节点，右节点大于等于根节点
 * 
 * 前序遍历：根节点，左节点，右节点（输出结果值）
 * 中序遍历：左节点，根节点，右节点（输出结果值）
 * 后序遍历：左节点，右节点，根节点（输出结果值）
 * @author pingweibo
 *
 */
public class Tree {
	
	private Node root;
	
	public Tree() {
		root = null;
	}
	
	/**
	 * 查询方法
	 * 中序遍历
	 * @param key
	 * @return
	 */
	public Node find(int key) {
		Node current = root;
		while(current.iData != key) {
			if(key < current.iData) {
				current = current.leftChild;
			}else {
				current = current.rightChild;
			}
			if(current == null) {
				return null;
			}
		}
		return current;
	}
	
	/**
	 * 插入方法（按照二叉搜索树的规则进行查询插入）
	 * @param id
	 * @param dd
	 */
	public void insert(int id,double dd) {
		Node newNode = new Node();
		newNode.iData = id;
		newNode.dData = dd;
		if(root==null) {//如果根节点为null，该节点作为根节点
			root = newNode;
		}else {
			Node current = root;
			Node parent;
			while(true) {
				parent = current;
				if(id < current.iData) {//小于 去左子树
					current = current.leftChild;
					if(current == null) {
						parent.leftChild = newNode;
						return;
					}
				}else {
					current = current.rightChild;
					if(current == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
	
	/**
	 * 
	 */
	public boolean delete(int key) {
		Node current = root;
		Node parent = root;
		boolean isLeftChild = true;
		
		while(current.iData != key) {//search for node;
			parent = current;
			if(key < current.iData) {
				isLeftChild = true;
				current = current.leftChild;//go left;
			}else {
				isLeftChild = false;
				current = current.rightChild;//go right;
			}
			if(current == null) {
				return false;
			}
		}
		//found node to delete
		//判断节点位置，保持树结构
		if(current.leftChild==null&&current.rightChild==null) {
			if(current == root) {
				root = null;
			}else if(isLeftChild) {
				parent.leftChild = null;
			}else {
				parent.rightChild = null;
			}
		}else if(current.rightChild==null) {
			if(current == root) {
				root = current.leftChild;
			}else if(isLeftChild) {
				parent.leftChild = current.leftChild;
			}else {
				parent.rightChild = current.leftChild;
			}
		}else {
			Node successor = getSuccessor(current);
			if(current == root) {
				root = successor;
			}else if(isLeftChild) {
				parent.leftChild = successor;
			}else {
				parent.rightChild = successor;
			}
			successor.leftChild = current.leftChild;
		}
		return true;
	}
	
	//goes to right child,then right child's left descendents
	private Node getSuccessor(Node delNode) {
		Node successorParent = delNode;
		Node successor = delNode;
		Node current = delNode.rightChild;
		while(current != null) {
			successorParent = successor;
			successor = current;
			current = current.leftChild;
		}
		
		if(successor != delNode.rightChild) {
			successorParent.leftChild = successor.rightChild;
			successor.rightChild = delNode.rightChild;
		}
		return successor;
	}
	
	/**
	 *  遍历
	 * @param traverType
	 */
	public void traverse(int traverType) {
		switch(traverType) {
		   case 1:System.out.println("\nPreorder traversal");
		          preOrder(root);
		          break;
		   case 2:System.out.println("\nInorder traversal");
		          inOrder(root);
		          break;
		   case 3:System.out.println("\nPostorder traversal");
		          postOrder(root);
		          break;
		}
	}

	private void postOrder(Node localRoot) {
		if(localRoot != null) {
			postOrder(localRoot.leftChild);
			postOrder(localRoot.rightChild);
			System.out.println(localRoot.iData + " ");
		}
	}

	private void inOrder(Node localRoot) {
		if(localRoot != null) {
			inOrder(localRoot.leftChild);
			System.out.println(localRoot.iData + " ");
			inOrder(localRoot.rightChild);
		}
	}

	private void preOrder(Node localRoot) {
		if(localRoot != null) {
			System.out.println(localRoot.iData + " ");
			preOrder(localRoot.leftChild);
			preOrder(localRoot.rightChild);
		}
	}
	
	public void displayTree() {
		Stack<Node> globalStack = new Stack();
		globalStack.push(root);
		int nBlanks = 32;
		boolean isRowEmpty = false;
		System.out.println("....................................");
		while(isRowEmpty==false) {
			Stack<Node> localStack = new Stack<>();
			isRowEmpty = true;
			for(int j=0; j<nBlanks; j++) {
				System.out.println(' ');
			}
			while(globalStack.isEmpty()==false) {
				Node temp = globalStack.pop();
				if(temp != null) {
					System.out.println(temp.iData);
					localStack.push(temp.leftChild);
					localStack.push(temp.rightChild);
					if(temp.leftChild != null || temp.rightChild != null) {
						isRowEmpty = false;
					}
				}else {
					System.out.println("--");
					localStack.push(null);
					localStack.push(null);
				}
				for(int j=0; j<nBlanks*2-2;j++) {
					System.out.println(" ");
				}
			}
			System.out.println();
			nBlanks /=2;
			while(localStack.isEmpty()==false) {
				globalStack.push( localStack.pop() );
			}
		}
		System.out.println("....................................");
	}
}
