package pers.pingweibo.interview.test;

import java.io.File;
import java.io.IOException;
import java.lang.Thread.State;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;


import pers.pingweibo.interview.io.IoReadPractice;
import pers.pingweibo.interview.io.IoWritePractice;
import pers.pingweibo.interview.nio.FileChannelPractice;
import pers.pingweibo.interview.order.GuiBingOrder;
import pers.pingweibo.interview.order.InsertOrder;
import pers.pingweibo.interview.order.MaoPaoOrder;
import pers.pingweibo.interview.order.SelectOrder;
import pers.pingweibo.interview.order.XiErOrder;
import pers.pingweibo.interview.thread.CallablePractice;
import pers.pingweibo.interview.thread.RunnablePractice;
import pers.pingweibo.interview.thread.ThreadPractice;

public class Test {

	public static void main(String[] args) {
		
//		ThreadPractice thread1 = new ThreadPractice("thread1");
//		System.out.println(thread1.getName());
//		thread1.run();
//		
//		RunnablePractice run = new RunnablePractice();
//		Thread thread2 = new Thread(run,"thread2");
//		System.out.println(thread2.getName());
//		thread2.run();
//		
//		CallablePractice callRun = new CallablePractice();
//		FutureTask<String> futureTask = new FutureTask<>(callRun);
//		Thread thread3 = new Thread(futureTask);
//		thread3.start();
//		try {
//			System.out.println("================");
//			System.out.println(futureTask.get());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		/*Integer[] num = {5,6,7,9,10,8,1,14,2,43,87,58,93,100};
		//maopao
		List<Integer> NumList = Arrays.asList(num);
		long s1 = System.currentTimeMillis();
		MaoPaoOrder maoPao = new MaoPaoOrder(NumList);
		maoPao.Desc();
		long s2 = System.currentTimeMillis();
		List<?> list= maoPao.getMaoPaoList();
		for (Object object : list) {
			System.out.println(object);
		}
		System.out.println("time:"+(s2-s1));
		System.out.println("================");
		//选择
		long s3 = System.currentTimeMillis();
		SelectOrder select = new SelectOrder(num);
		select.Asc();
		long s4 = System.currentTimeMillis();
		System.out.println("time:"+(s4-s3));
		select.display();
		System.out.println("================");
		//插入排序
		InsertOrder insertOrder = new InsertOrder(num);
		insertOrder.insertionSort();
		insertOrder.display();*/
		
		//归并排序
//		GuiBingOrder guibing = new GuiBingOrder();
//		int[] a = {1,2,3,4,5};
//		int[] b = {6,7,8,9,10};
//		int[] c = new int[10];
//		guibing.GuiBing(a, a.length, b, b.length, c);
//		guibing.display();
		
		//希尔排序
//		XiErOrder xiErOrder = new XiErOrder(10);
//		for(int i=0;i<10;i++) {
//			long temp = (int)(Math.random()*99);
//			xiErOrder.insert(temp);
//		}
//		xiErOrder.display();
//		System.out.println("============");
//		xiErOrder.shellOrder();
//		xiErOrder.display();
		
//		IoReadPractice ioReadPractice = new IoReadPractice(); 
//		String file = "D:"+File.separator+"test.txt";
//		try {
//			ioReadPractice.createFile(file);
//			ioReadPractice.readFile();
//			ioReadPractice.readBufferFile();
//			ioReadPractice.readFileChar();
//			ioReadPractice.readBufferFileChar();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		IoWritePractice ioWritePractice = new IoWritePractice();
//		String file = "D:"+File.separator+"love.txt";
//		try {
//			ioWritePractice.createFile(file);
//			ioWritePractice.writeFileData();
//			ioWritePractice.writeFileBuffer();
//			ioWritePractice.writerFile();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
//		FileChannelPractice fileChannelPractice= new FileChannelPractice();
//		String file = "D:"+File.separator+"life.txt";
//		try {
//			fileChannelPractice.createFile(file);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		fileChannelPractice.writeFileChannel();
//		fileChannelPractice.readFileChannel();
		int a = 9/2;
		System.out.println(a);
	}

}
