package designPattern.singleton;

//https://www.go4expert.com/articles/design-patterns-simple-examples-t5127/#singleton

public class SingletonTest {

	public static void main(String[] args) {

		System.out.println("With SingletonEnum\n");
		SingletonEnum.INSTANCE.setCount(1);
		SingletonEnum.INSTANCE.doProcess();
		SingletonEnum.INSTANCE.setCount(2);
		SingletonEnum.INSTANCE.doProcess();
		SingletonEnum.INSTANCE.doProcess();
		SingletonEnum.INSTANCE.doProcess();
		
		System.out.println("\nWith SingletonClass\n");
		Singleton singleton = new Singleton();
		singleton.setCount(1);
		singleton.getSingletonData();
		singleton.setCount(2);
		singleton.getSingletonData();
		singleton.getSingletonData();
		singleton.getSingletonData();

	}

}
