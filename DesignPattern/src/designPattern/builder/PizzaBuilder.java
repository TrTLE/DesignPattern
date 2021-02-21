package designPattern.builder;

public abstract class PizzaBuilder {
	
	protected Pizza pizza;
	
	public Pizza getPizza() {
		return pizza;
	};

    public void createNewPizzaProduct() {
        pizza = new Pizza();
    }
	
	public abstract void buldPizzaBase();
	public abstract void buldPizzaSauce();
	public abstract void buldToppings();
	
}
