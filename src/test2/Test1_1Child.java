package test2;

import test1.Test1_1;

/**
 * protected 不同包子类
 * @author pingweibo
 *
 */
public class Test1_1Child extends Test1_1{
   
	public void print() {
		System.out.println("protected不同包子类--"+super.name+":"+super.age);
	}
}
