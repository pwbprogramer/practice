package pers.pingweibo.interview.test;

import pers.pingweibo.interview.Datastructure.tree.book.Tree;

public class main {
	
	public static void main(String[] args) {
		Tree theTree = new Tree();
		theTree.insert(50, 1.5);
		theTree.insert(25, 1.2);
		theTree.insert(75, 1.7);
		theTree.insert(12, 1.5);
		theTree.insert(37, 1.2);
		theTree.insert(43, 1.7);
		theTree.insert(30, 1.5);
		theTree.insert(33, 1.2);
		theTree.insert(87, 1.7);
		theTree.insert(93, 1.5);
		theTree.insert(97, 1.5);
//		theTree.displayTree();
		theTree.traverse(1);
	}

}
