package designPattern.prototype;

public class BuildingComponentBuilder {
	
    private BuildingComponent buildingComponent;
    
    public BuildingComponentBuilder(BuildingComponent buildingComponent) {
        this.buildingComponent = buildingComponent;
    }
    
    public BuildingComponent buildNewComponent() {
        return buildingComponent.clone();
    }
    
}
