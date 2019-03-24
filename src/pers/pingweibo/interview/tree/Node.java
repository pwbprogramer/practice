package pers.pingweibo.interview.tree;

import java.io.Serializable;
import java.util.List;

/**
 * 节点类
 * @author pingweibo
 *
 * @param <T>
 */
public class Node<T> implements Serializable {
       
	protected Node<T> parenNode;
	
	protected T nodeEntity;
	
	protected List<Node<T>> childNodes;
	
	public Node() {
	}

	/**
	 * @return the parenNode
	 */
	public Node<T> getParenNode() {
		return parenNode;
	}

	/**
	 * @param parenNode the parenNode to set
	 */
	public void setParenNode(Node<T> parenNode) {
		this.parenNode = parenNode;
	}

	/**
	 * @return the nodeEntity
	 */
	public T getNodeEntity() {
		return nodeEntity;
	}

	/**
	 * @param nodeEntity the nodeEntity to set
	 */
	public void setNodeEntity(T nodeEntity) {
		this.nodeEntity = nodeEntity;
	}

	/**
	 * @return the childNodes
	 */
	public List<Node<T>> getChildNodes() {
		return childNodes;
	}

	/**
	 * @param childNodes the childNodes to set
	 */
	public void setChildNodes(List<Node<T>> childNodes) {
		this.childNodes = childNodes;
	}
	
	
	
}
