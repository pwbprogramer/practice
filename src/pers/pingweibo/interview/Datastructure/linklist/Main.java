package pers.pingweibo.interview.Datastructure.linklist;

public class Main {
    
	public static void main(String[] args) {
		PwbLinkList linkList = new PwbLinkList();
		for(int i=0;i<20;i++) {
			linkList.insert(i);
		}
		linkList.display();
		
		linkList.delete(18);
		System.out.println("===============");
		linkList.display();
	}
}
