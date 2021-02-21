package designPattern.factory;

//https://www.go4expert.com/articles/design-patterns-simple-examples-t5127/#factory

public class FactoryTest {

	public static void main(String[] args) {
		ConcreteComputerFactory amd = new ConcreteComputerFactory();
		Processor processor = amd.getProcessor();
		System.out.println(processor);
	}

}
