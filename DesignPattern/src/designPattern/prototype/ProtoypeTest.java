package designPattern.prototype;

import java.awt.Color;

//https://javadevcentral.com/prototype-design-pattern

public class ProtoypeTest {

	public static void main(String[] args) {

		System.out.println("The below code creates a Door object and passes it (the prototype) to the Builder class.");

		Door door = new Door(10, 10, 10, "Wood");
		BuildingComponentBuilder buildingComponentBuilder = new BuildingComponentBuilder(door);
		System.out.println("Original door is " + door);

		System.out.println("");
		System.out.println(
				"If we call createNewComponent, each time it will create new Door objects. Let us call it twice.");

		System.out.println(buildingComponentBuilder.buildNewComponent());
		System.out.println(buildingComponentBuilder.buildNewComponent());

//    We can see the (Hex value of the) hashCode is different in the two outputs and hence they are different objects. 
//    But each of these created objects will have the same value for the instance variables as the original prototype (length = width = height = 10 and material = Wood).

		System.out.println("");
		System.out.println(
				"Once we create an object from a prototype, we can change few of its values to create an object with different properties.");

		BuildingComponent newDoor = buildingComponentBuilder.buildNewComponent();
		System.out.println("create BuildingComponent newDoor = buildingComponentBuilder.buildNewComponent()");
		System.out.println("newDoor.getHeight() : " + newDoor.getHeight()); // 10.0

		System.out.println("newDoor.setHeight(20)");
		newDoor.setHeight(20);
		System.out.println("newDoor.getHeight() : " + newDoor.getHeight()); // 20.0

//    The newly built BuildingComponent object (Door) had a height of 10. But we changed it to 20 to create a new door of length 20.
//    This way of creating new objects using prototype simplifies the creation of objects.
//    We do not want to copy the individual fields, and they would be taken care by the object (prototype) itself.

		System.out.println("");
		System.out.println("Similarly, a wall component can be built and cloned as:");

		Wall wall = new Wall(10, 10, 20, Color.BLUE);
		buildingComponentBuilder = new BuildingComponentBuilder(wall);
		System.out.println("Original wall is " + wall);
		System.out.println(buildingComponentBuilder.buildNewComponent());

	}

}
