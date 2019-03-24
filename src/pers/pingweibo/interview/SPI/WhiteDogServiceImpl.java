package pers.pingweibo.interview.SPI;

public class WhiteDogServiceImpl implements DogService {

	@Override
	public void sleep() {
		System.out.println("白色的狗狗在睡觉");
	}

	@Override
	public void eat() {
		System.out.println("白色的狗狗再吃东西");
	}

}
