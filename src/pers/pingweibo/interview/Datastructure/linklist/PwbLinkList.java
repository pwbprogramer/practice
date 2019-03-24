package pers.pingweibo.interview.Datastructure.linklist;

/**
 * 链表实现
 * @author pingweibo
 * 外部类的内部是可以访问内部类的private属性的
 * 实现删除时，1  2  3删除2时 将1的next指向3，关键需要将3的prev指向1。 
 */
public class PwbLinkList {
    
	private Node currentNode = null;
	
	private class Node {
		
		private  Node pre;
		private  Node next;
		private  int  key;
		
		public Node(Node pre,Node next,int key) {
			this.pre = pre;
			this.next = next;
			this.key = key;
		}
		
	};
	
	
	public void insert(int value) {
		if(this.currentNode==null) {
			Node node = new Node(null, null, value);
			this.currentNode = node;
		}else {
			Node node = new Node(this.currentNode, null, value);
			this.currentNode = node;
		}
	}
	
	public void delete(int value) {
		if(this.currentNode!=null) {
			if(this.currentNode.key == value) {
				if(this.currentNode.pre!=null) {
					Node pre = this.currentNode.pre;
					pre.next = null;
				}else {
					this.currentNode = null;
				}
			}else{
				searchNode(this.currentNode,value);
			};
		}
	}
	
	private boolean searchNode(Node node,int value) {
		if(node.pre!=null) {
			Node nowNode = node.pre;
			if(nowNode.key==value) {
				Node nowNodePre = nowNode.pre;
				node.pre = nowNodePre;
				nowNodePre.next = node;
				return true;
			}else {
				searchNode(nowNode,value);
			}
		}
		return false;
	}
	
	public void display() {
		show(this.currentNode);
	}
	
	private void show(Node node) {
		System.out.println(node.key);
		if(node.pre!=null) {
			show(node.pre);
		}
	}
	
	
}
