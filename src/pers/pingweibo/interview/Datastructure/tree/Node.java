package pers.pingweibo.interview.Datastructure.tree;

public class Node<T> {
	
	protected Node<T> leftChild;
	
	protected Node<T> rightChild;
	
	protected T data;
    
	public Node(T data) {
		this.data = data;
		this.leftChild = null;
		this.rightChild = null;
	}
	
	/**
	 * @return the leftChild
	 */
	public Node<T> getLeftChild() {
		return leftChild;
	}

	/**
	 * @param leftChild the leftChild to set
	 */
	public void setLeftChild(Node<T> leftChild) {
		this.leftChild = leftChild;
	}

	/**
	 * @return the rightChild
	 */
	public Node<T> getRightChild() {
		return rightChild;
	}

	/**
	 * @param rightChild the rightChild to set
	 */
	public void setRightChild(Node<T> rightChild) {
		this.rightChild = rightChild;
	}

	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}
	
	

}
