package tanvd.creational.factorymethod.applypattern;

public class Client {
    public static void main(String[] args) {
        Shape myShape = ShapeFactory.getShape("square");
        myShape.draw();
    }
}
