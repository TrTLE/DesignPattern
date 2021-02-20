package designPattern.factory;

public class ConcreteProcessor extends Processor {

	public ConcreteProcessor(){
		System.out.println("ConcreteProcessor is creating");
		mHz = "3600";
	}
	
}
