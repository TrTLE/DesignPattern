package designPattern.prototype;

import java.awt.Color;

//Concrete Prototype
public class Wall extends BuildingComponent {

	private Color wallColor;

	public Wall(double length, double width, double height, Color wallColor) {
		super(length, width, height);
		this.wallColor = wallColor;
	}

	private Wall(Wall wall) {
		super(wall);
		this.wallColor = wall.wallColor;
	}

	@Override
	public BuildingComponent clone() {
		return new Wall(this);
	}

}
