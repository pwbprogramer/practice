package pers.pingweibo.interview.thread;

import java.util.concurrent.Callable;

public class CallablePractice implements Callable<String> {
    
	/**
	 * callable 重写的方法是call
	 */
	@Override
	public String call() throws Exception {
		System.out.println("callable 创 建 线 程");
		return "callable 创 建 线 程 ";
	}

}
