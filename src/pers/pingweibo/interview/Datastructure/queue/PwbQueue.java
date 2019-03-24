package pers.pingweibo.interview.Datastructure.queue;

/**
 * 
 * @author pingweibo
 * 队列 先进先出原则
 * 处理队列为空异常
 * 以及队列满的异常
 */
public class PwbQueue {
    
	private int[] pwbQueue;
	
	private int i;
	
	public PwbQueue(int capacity) {
         this.pwbQueue = new int[capacity];
         this.i=-1;
	}
	
	public void enqueue(int data) {
		if(this.i==(this.pwbQueue.length-1)) {
			System.out.println("队列已满");
			this.i=0;
			display();
		}else {
			this.pwbQueue[++i] = data;
		}
	}
	
	public void dequeue() {
		if(i!=-1&&i!=this.pwbQueue.length) {
			System.out.println(this.pwbQueue[this.i]);
			i++;
		}else {
			System.out.println("队列为空");
			this.pwbQueue = new int[0];
		}
	}
	
	public void display() {
		for(int j=0;j<this.pwbQueue.length;j++) {
			System.out.println(j+":"+this.pwbQueue[j]);
		}
	}
	
	public int currentLength() {
		return this.i+1;
	}
}
