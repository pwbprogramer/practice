package test1;

/**
 * protected同包子类
 * @author pingweibo
 *
 */
public class Test1_1Child extends Test1_1{
   
	public void print() {
		System.out.println("protect同包子类--"+super.name+":"+super.age);
	}
}
