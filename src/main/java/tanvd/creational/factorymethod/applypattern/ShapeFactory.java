package tanvd.creational.factorymethod.applypattern;

public class ShapeFactory {
    public static Shape getShape(String shapeType) {
        switch (shapeType) {
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            default:
                throw new RuntimeException("Invalid shape type");
        }
    }
}
