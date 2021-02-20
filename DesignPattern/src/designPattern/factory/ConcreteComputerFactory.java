package designPattern.factory;

public class ConcreteComputerFactory extends ComputerFactory{

	public ConcreteComputerFactory() {
		System.out.println("ConcreteComputerFactory is creating");
	}
	
	@Override
	public Processor getProcessor() {
		return new ConcreteProcessor();
	}

}
