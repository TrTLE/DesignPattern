package designPattern.singleton;

public class Singleton {
	
	private Singleton uniqueInstance;
	
	private int count;
	
	public Singleton instance() {
		return uniqueInstance;
	}
	
	public void singletonOperation() {
		
	}
	
	public void getSingletonData() {
		System.out.println("Do high memory or CPU consume operation. count :-" + this.count);
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
