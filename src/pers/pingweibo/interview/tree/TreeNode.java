package pers.pingweibo.interview.tree;

import java.util.ArrayList;

public class TreeNode<T> extends Node<T>{
     
	public TreeNode(){
		
	}
	
	public TreeNode(T nodeEntity) {
		super();
		super.nodeEntity = nodeEntity;
	}
	
	/**
	 * 有点吊啊,这个思路
	 * @param childNode
	 */
	@SuppressWarnings("unused")
	protected void addChildNode(Node<T> childNode) {
		childNode.setParenNode(this);
		if(super.childNodes == null) {
			super.childNodes = new ArrayList<Node<T>>();
		}
		super.childNodes.add(childNode);
	}
	
	protected void removeChildNode(Node<T> childNode) {
		if(super.childNodes != null ) {
			super.childNodes.remove(childNode);
		}
	}
	
	/**
	 * 遍历树结构
	 * 采用递归，这思想简直太吊了
	 */
	public void display(Node<T> treeNode,int depth) {
		StringBuilder sb = new StringBuilder("");
		for(int i = 0; i < depth; i++) {
		    sb.append("-");
		}
		if(treeNode.parenNode == null) {
			System.out.println(treeNode.getNodeEntity().toString());
		}
		for(Node<T> childNode : treeNode.getChildNodes()) {
			System.out.println(new String(sb) + childNode.getNodeEntity().toString());
			if(childNode.getChildNodes() != null) {
				display(childNode,depth + 2);
			}
		}
	}
}
