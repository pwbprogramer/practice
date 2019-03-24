package pers.pingweibo.interview.Datastructure.tree.book;

/**
 * 节点类
 * @author pingweibo
 *
 */
public class Node {
	
	public int iData;//data item key
	
	public double dData;//data item
	
	public Node leftChild;
	
	public Node rightChild;
	
	public void displayNode() {
		System.out.println("{");
		System.out.println(iData);
		System.out.println(", ");
		System.out.println(dData);
		System.out.println("} ");
	}

}
