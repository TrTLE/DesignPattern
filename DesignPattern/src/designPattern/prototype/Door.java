package designPattern.prototype;

//Concrete Prototype
public class Door extends BuildingComponent {

	private String material;

	public Door(double length, double width, double height, String material) {
		super(length, width, height);
		this.material = material;
	}

	private Door(Door door) {
		super(door);
		this.material = door.material;
	}

	@Override
	public BuildingComponent clone() {
		return new Door(this);
	}

}