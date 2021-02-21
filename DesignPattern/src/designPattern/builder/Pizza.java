package designPattern.builder;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

	private Base base;
	private Sauce sauce;
	private List<Topping> toppings = new ArrayList<>();
	
	public Base getBase() {
		return base;
	}
	
	public void setBase(Base base) {
		this.base = base;
	}

	public Sauce getSauce() {
		return sauce;
	}

	public void setSauce(Sauce sauce) {
		this.sauce = sauce;
	}
	
	public List<Topping> getToppings() {
		return toppings;
	}
	
	public void setToppings(Topping topping) {
		this.toppings.add(topping);
	}
	
	public void setToppings(List<Topping> toppings) {
		this.toppings.addAll(toppings);
	}
	
	@Override
	public String toString() {
		return "Pizza [base=" + base + ", sauce=" + sauce + ", toppings=" + toppings + "]";
	}
	
}
