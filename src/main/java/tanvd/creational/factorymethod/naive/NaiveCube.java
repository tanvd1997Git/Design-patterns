package tanvd.creational.factorymethod.naive;

public class NaiveCube {
    int size;

    public NaiveCube(int size) {
        this.size = size;
    }

    public void draw() {
        System.out.println("Cube is draw with size = " + size);
    }
}
