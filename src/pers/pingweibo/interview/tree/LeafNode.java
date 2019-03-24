package pers.pingweibo.interview.tree;


/**
 * className:LeafNode
 * 子叶实现类
 * @author pingweibo
 *
 * @param <T>
 */
public class LeafNode<T> extends Node<T>{
     
	public LeafNode() {
		
	}
	
	public LeafNode(T nodeEntity) {
		super.nodeEntity = nodeEntity;
	}
	
	public void display(Node<T> treeNode, int depth) {
		StringBuilder sb = new StringBuilder("");
		for(int i = 0;i < depth; i++ ) {
			sb.append("-");
		}
		System.out.println(new String(sb) + treeNode.getNodeEntity().toString());
	}
}
