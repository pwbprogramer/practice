package test2;

import test1.Test1;

/**
 * default不同包子类
 * @author pingweibo
 *
 */
public class Test1Child extends Test1{
     
	public void print() {
		System.out.println("default不同包子类访问不到");
	}
}
