package pers.pingweibo.interview.SPI;

public class BlackDogServiceImpl implements DogService {

	@Override
	public void sleep() {
		System.out.println("黑色的狗狗在睡觉");
	}

	@Override
	public void eat() {
		System.out.println("狗狗在吃香肠");
	}
}
