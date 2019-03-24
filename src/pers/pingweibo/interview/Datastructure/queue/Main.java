package pers.pingweibo.interview.Datastructure.queue;

public class Main {
	
	public static void main(String[] args) {
		PwbQueue pwbQueue = new PwbQueue(10);
		for(int i=1;i<=11;i++) {
			pwbQueue.enqueue(i);
		}
		for(int i=1;i<=11;i++) {
			pwbQueue.dequeue();
		}
		
	}

}
