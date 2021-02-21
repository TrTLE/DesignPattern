package design.pattern.builder;

public class CheesePizzaBuilder extends PizzaBuilder {

	@Override
	public void buldPizzaBase() {
		pizza.setBase(Base.SOFT);
	}

	@Override
	public void buldPizzaSauce() {
		pizza.setSauce(Sauce.SOFT);
	}
	
	@Override
	public void buldToppings() {
		pizza.setToppings(Topping.CHEESE);
	}

}
