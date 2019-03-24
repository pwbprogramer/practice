package pers.pingweibo.interview.thread;

public class ThreadPractice extends Thread{
	
	
	public ThreadPractice() {
		super();
	}
	
	public ThreadPractice(String name){
		super(name);
	}
	
	@Override
	public void run() {
          System.out.println("thread 创建线程");
	}

}
