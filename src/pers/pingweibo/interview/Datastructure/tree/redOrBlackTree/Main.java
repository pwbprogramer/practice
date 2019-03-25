package pers.pingweibo.interview.Datastructure.tree.redOrBlackTree;

import java.util.TreeMap;

public class Main {
   
	public static void main(String[] args) {
//		TestTree testTree = new TestTree();
//		for(int i=0;i<10;i++) {
//			testTree.insert(i);
//		}
//		testTree.ahead();
		
		redOrBlackTree redOrBlackTree = new redOrBlackTree();
		for(int i=0;i<10;i++) {
			redOrBlackTree.insert(i);
		}
		redOrBlackTree.show();
		
		TreeMap treeMap = new TreeMap();
	}
}
