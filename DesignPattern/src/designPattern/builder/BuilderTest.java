package designPattern.builder;

//https://www.go4expert.com/articles/design-patterns-simple-examples-t5127/#builder
	
public class BuilderTest {

	public static void main(String[] args) {

		Wailter wailter = new Wailter();
		PizzaBuilder cheesePizzaBuilder = new CheesePizzaBuilder();
		PizzaBuilder mixedPizzaBuilder = new MixedPizzaBuilder();
		
		wailter.setPizzaBuilder(cheesePizzaBuilder);
		wailter.constructPizza();
		
		Pizza pizza = wailter.getPizza();
		System.out.println(pizza);
		
		wailter.setPizzaBuilder(mixedPizzaBuilder);
		wailter.constructPizza();
		
		pizza = wailter.getPizza();
		System.out.println(pizza);
		
	}

}
