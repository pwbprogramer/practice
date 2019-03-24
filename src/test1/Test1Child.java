package test1;

/**
 * 默认修饰符同包子类可以访问到
 * @author pingweibo
 *
 */
public class Test1Child extends Test1 {
	
	public void print() {
		System.out.println("default同包子类"+super.name+":"+super.age);
	}

}
