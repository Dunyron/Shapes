package shapes;

public class Rectangle extends CommonShapes implements ObjectsInterface {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void perimeter() {
        System.out.println("The perimeter of a rectangle is: " + (2 * (a + b)));
    }
}