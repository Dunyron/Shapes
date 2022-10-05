package shapes;

public class Circle extends CommonShapes implements ObjectsInterface {

    private int d;

    public Circle(int d) {
        this.d = d;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public void perimeter() {
        System.out.println("The circumference of a circle is: " + (Math.PI * d));
    }
}