package design.pattern.builder;

import java.util.List;

public class MixedPizzaBuilder extends PizzaBuilder {

	@Override
	public void buldPizzaBase() {
		pizza.setBase(Base.THICK);
	}

	@Override
	public void buldPizzaSauce() {
		pizza.setSauce(Sauce.BBQ);
	}

	@Override
	public void buldToppings() {
		pizza.setToppings(List.of(Topping.CHEESE, Topping.HAM, Topping.MUSHROOM));
	}

}
