package designPattern.factory;

public class FactoryTest {

	public static void main(String[] args) {
		ConcreteComputerFactory amd = new ConcreteComputerFactory();
		Processor processor = amd.getProcessor();
		System.out.println(processor);
	}

}
