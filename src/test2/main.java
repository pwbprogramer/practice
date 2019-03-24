package test2;

import test1.Test1;
import test1.Test1_1;

public class main {
	
	public static void main(String[] args) {
		Test1Child test1Child = new Test1Child();
		test1Child.print();
		Test1 test1 = new Test1();
		System.out.println("default不同包类访问不到");
		Test1_1Child test1_1Child = new Test1_1Child();
		test1_1Child.print();
		Test1_1 test1_1 = new Test1_1();
		System.out.println("protected不同包非子类访问不到");
	}
}
