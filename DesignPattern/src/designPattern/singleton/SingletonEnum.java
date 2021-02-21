package designPattern.singleton;

public enum SingletonEnum {
	
	INSTANCE;
	
	private int count;
	
	public void setCount(int pCount) {
		this.count = pCount;
	}

	public void doProcess() {
		System.out.println("Do high memory or CPU consume operation. count :-" + this.count);
	}
	
}
