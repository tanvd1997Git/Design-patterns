package tanvd.creational.factorymethod.applypattern;

public class Circle implements Shape {
    int radiant;

    @Override
    public void draw() {
        System.out.println("Circe is drawn with radiant " + radiant);
    }
}
