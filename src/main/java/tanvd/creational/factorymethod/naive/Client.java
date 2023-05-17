package tanvd.creational.factorymethod.naive;

public class Client {
    public static void main(String[] args) {
        NaiveCircle naiveCircle = new NaiveCircle(10);
        naiveCircle.draw();
    }
}
