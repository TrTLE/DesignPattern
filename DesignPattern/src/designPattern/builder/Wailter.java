package designPattern.builder;

public class Wailter {
	
	private PizzaBuilder pizzaBuilder;  
	
	public void setPizzaBuilder(PizzaBuilder pPizzaBuilder) {
		this.pizzaBuilder = pPizzaBuilder;
	}

	public Pizza getPizza() {
		return pizzaBuilder.getPizza();
	}
	
	public void constructPizza() {
		pizzaBuilder.createNewPizzaProduct();
		pizzaBuilder.buldPizzaBase();
		pizzaBuilder.buldPizzaSauce();
		pizzaBuilder.buldToppings();
	}
	
}
