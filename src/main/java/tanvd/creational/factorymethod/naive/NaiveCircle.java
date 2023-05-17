package tanvd.creational.factorymethod.naive;

public class NaiveCircle {
    int radiant;

    public NaiveCircle(int radiant) {
        this.radiant = radiant;
    }

    public void draw() {
        System.out.println("Circe is drawn with R = " + radiant);
    }
}
