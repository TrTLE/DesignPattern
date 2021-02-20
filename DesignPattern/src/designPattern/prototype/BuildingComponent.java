package designPattern.prototype;

//Cloning BuildingComponent
public class BuildingComponent extends Component {
	private double length;
	private double width;
	private double height;

	public BuildingComponent(BuildingComponent buildingComponent) {
		this.length = buildingComponent.length;
		this.width = buildingComponent.width;
		this.height = buildingComponent.height;
	}

	public BuildingComponent(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public BuildingComponent clone() {
		return new BuildingComponent(this);
	}

}
