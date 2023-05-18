package tanvd.creational.factorymethod.naive;

public class NaiveSquare {
    int edge;

    public NaiveSquare(int edge) {
        this.edge = edge;
    }

    public void draw() {
        System.out.println("Cube is draw with size = " + edge);
    }
}
