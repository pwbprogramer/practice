package test1;

public class main {

	public static void main(String[] args) {
		Test1Child test1Child = new Test1Child();
		test1Child.print();
		Test1 test1 = new Test1();
		System.out.println("default同包--"+test1.name+":"+test1.age);
		Test1_1Child test1_1Child = new Test1_1Child();
		test1_1Child.print();
		Test1_1 test1_1 = new Test1_1();
		System.out.println("protected同包--"+test1_1.name+test1_1.age);
	}

}
