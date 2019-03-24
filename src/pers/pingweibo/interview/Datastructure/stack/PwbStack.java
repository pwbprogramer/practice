package pers.pingweibo.interview.Datastructure.stack;

/**
 * 栈 后进先出
 * 考虑栈溢出，以及栈元素为空的异常
 * @author pingweibo
 *
 */
public class PwbStack {
	
	private int i;
	
	private int[] stack;
	
	public PwbStack(int capacity) {
		this.stack = new int[capacity];
		this.i = -1;
	}
	
	public void pop() {
		if(this.i!=-1) {
			System.out.println(this.stack[i]);
			this.i--;
		}else {
			System.out.println("栈为空");
		}
	}
	
	public void push(int data) {
		if(this.i==(this.stack.length-1)) {
			System.out.println("栈已满");
			display();
		}else {
			this.stack[++this.i] = data;
		}
	}
	
	public void display() {
		for(int j=this.stack.length-1;j>=0;j--) {
			System.out.println(j+":"+this.stack[j]);
		}
	}
	
	public int currentLength() {
		return this.i+1;
	}

}
