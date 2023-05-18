package tanvd.creational.factorymethod.applypattern;

public class Square implements Shape {
    int edge;

    @Override
    public void draw() {
        System.out.println("Square is drawn with size = " + edge);
    }
}
