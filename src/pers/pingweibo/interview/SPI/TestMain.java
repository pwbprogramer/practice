package pers.pingweibo.interview.SPI;

import java.util.Iterator;
import java.util.ServiceLoader;
//java的spi运行流程是运用java.util.ServiceLoader
//这个类的load方法去在src/META-INF/services/寻找对应的全路径接口名称的文件，然后在文件中找到对应的实现方法并注入实现，然后你可以运用了
public class TestMain {
	
	public static void main(String[] args) {
		ServiceLoader<DogService> loader = ServiceLoader.load(DogService.class);
		Iterator<DogService> it = loader.iterator();
		while(it.hasNext()) {
			DogService d = it.next();
			d.eat();
			d.sleep();
		}
//		for (DogService dogService : loader) {
//			dogService.sleep();
//			dogService.eat();
//		}
	}

}
