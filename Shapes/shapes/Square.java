package shapes;

public class Square extends CommonShapes implements ObjectsInterface {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void perimeter() {
        System.out.println("The perimeter of a square is: " + (4 * a));
    }
}