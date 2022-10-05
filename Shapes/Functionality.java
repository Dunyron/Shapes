import java.util.List;
import java.util.Scanner;
import shapes.Circle;
import shapes.CommonShapes;
import shapes.Rectangle;
import shapes.Square;
import shapes.Triangle;

public class Functionality {
    Scanner sc = new Scanner(System.in);

    public String chooseFirstFunctionality() {
        System.out.println("--- Type 'add' to add an object ---");
        System.out.println("--- Type 'change' to change and object ---");
        System.out.println("--- Type 'remove' to remove and object from array ---");
        System.out.println("--- Type 'info' to write out infromation about certain object ---");
        System.out.println("--- Type 'ainfo' to write out all infromation about objects ---");
        System.out.println("--- Type 'exit' to exit the programm ---");
        String choice = sc.next();

        return choice;
    }

    public List<CommonShapes> addChoice(List<CommonShapes> shapes) {
        System.out.println("--- Type 'square' to add a square object to array ---");
        System.out.println("--- Type 'triangle' to add a triangle object to array ---");
        System.out.println("--- Type 'rectangle' to add a rectangle object to array ---");
        System.out.println("--- Type 'circle' to add a cirlce object to array ---");
        System.out.println("--- Type 'back' to go back to the main menu ---");
        String secondChoice = sc.next();
        switch (secondChoice) {
            case "circle":
                System.out.println("Enter diameter:");
                Circle circleD = new Circle(sc.nextInt());
                shapes.add(circleD);
                break;
            case "square":
                System.out.println("Enter side A:");
                Square squareA = new Square(sc.nextInt());
                shapes.add(squareA);
                break;
            case "triangle":
                System.out.println("Enter side A:");
                int triangleA = sc.nextInt();
                System.out.println("Enter side B:");
                int triangleB = sc.nextInt();
                System.out.println("Enter side C:");
                int triangleC = sc.nextInt();
                Triangle t = new Triangle(triangleA, triangleB, triangleC);
                shapes.add(t);
                break;
            case "rectangle":
                System.out.println("Enter side A:");
                int rectangleA = sc.nextInt();
                System.out.println("Enter side B:");
                int rectangleB = sc.nextInt();
                Rectangle r = new Rectangle(rectangleA, rectangleB);
                shapes.add(r);
                break;
            case "back":
                // change state back
                break;
        }
        return shapes;
    }

    public List<CommonShapes> change(List<CommonShapes> shapes) {
        System.out.println("Write an index of object in array that you wish to change.");
        int change = sc.nextInt();

        if (shapes.get(change) == null) {
            System.out.println("There is no registered object under the index that You have written.");
            System.out.println("Try checking, which index the object that you want to change, has");
        }

        if (shapes.get(change) instanceof Square) {
            System.out.println("You want to change SQUARE with:");
            System.out.println("Side A: " + ((Square) shapes.get(change)).getA());
            System.out.println("To confirm this action write 'yes'");
            String confirmChangeSquare = sc.next();

            if (confirmChangeSquare.equals("yes")) {
                System.out.println(
                        "Set a new side A (previous side A was: " + ((Square) shapes.get(change)).getA() + ")");
                int sideA = sc.nextInt();
                shapes.remove(change);
                shapes.add(change, new Square(sideA));
                System.out.println("Change was succsesful");
            }
            return shapes;
        }

        if (shapes.get(change) instanceof Circle) {
            System.out.println("You want to change CIRCLE with:");
            System.out.println("Diameter: " + ((Circle) shapes.get(change)).getD());
            System.out.println("To confirm this action write 'yes'");
            String confirmChangeCircle = sc.next();

            if (confirmChangeCircle.equals("yes")) {
                System.out.println("Set a new diameter (previous diameter was: "
                        + ((Circle) shapes.get(change)).getD() + ")");
                int diameter = sc.nextInt();
                shapes.remove(change);
                shapes.add(change, new Circle(diameter));
                System.out.println("Change was succsesful");
            }
            return shapes;
        }

        if (shapes.get(change) instanceof Triangle) {
            System.out.println("You want to change TRIANGLE with:");
            System.out.println("Side A: " + ((Triangle) shapes.get(change)).getA());
            System.out.println("Side B: " + ((Triangle) shapes.get(change)).getB());
            System.out.println("Side C: " + ((Triangle) shapes.get(change)).getC());
            System.out.println("To confirm this action write 'yes'");
            String confirmChangeCircle = sc.next();
            if (confirmChangeCircle.equals("yes")) {
                System.out.println("Set a new side A (previous side A was: "
                        + ((Triangle) shapes.get(change)).getA() + ")");
                int sideA = sc.nextInt();
                System.out.println("Set a new side B (previous side B was: "
                        + ((Triangle) shapes.get(change)).getB() + ")");
                int sideB = sc.nextInt();
                System.out.println("Set a new side C (previous side C was: "
                        + ((Triangle) shapes.get(change)).getC() + ")");
                int sideC = sc.nextInt();
                shapes.remove(change);
                shapes.add(change, new Triangle(sideA, sideB, sideC));
                System.out.println("Change was succsesful");
            }
            return shapes;
        }
        if (shapes.get(change) instanceof Rectangle) {
            System.out.println("You want to change Rectangle with:");
            System.out.println("Side A: " + ((Rectangle) shapes.get(change)).getA());
            System.out.println("Side B: " + ((Rectangle) shapes.get(change)).getB());
            System.out.println("To confirm this action write 'yes'");
            String confirmChangeCircle = sc.next();
            if (confirmChangeCircle.equals("yes")) {
                System.out.println("Set a new side A (previous side A was: "
                        + ((Rectangle) shapes.get(change)).getA() + ")");
                int sideA = sc.nextInt();
                System.out.println("Set a new side B (previous side B was: "
                        + ((Rectangle) shapes.get(change)).getB() + ")");
                int sideB = sc.nextInt();
                shapes.remove(change);
                shapes.add(change, new Rectangle(sideA, sideB));
                System.out.println("Change was succsesful");

            }
            return shapes;
        }
        return shapes;
    }

    public List<CommonShapes> remove(List<CommonShapes> shapes) {
        System.out.println("Write an index of object in array that you wish to remove.");
        int remove = sc.nextInt();
        if (shapes.get(remove) == null) {
            System.out.println("There is no registered object under the index that You have written.");
            System.out.println("Try checking, which index the object that you want to remove, has");
        }
        if (shapes.get(remove) instanceof Square) {
            System.out.println("You want to remove SQUARE with:");
            System.out.println("Side A: " + ((Square) shapes.get(remove)).getA());
            System.out.println("To confirm this action write 'yes'");
            String confirmRemoveSquare = sc.next();
            if (confirmRemoveSquare.equals((String) "yes")) {
                shapes.remove(remove);
            }
            return shapes;
        }
        if (shapes.get(remove) instanceof Circle) {
            System.out.println("You want to remove CIRCLE with:");
            System.out.println("Diameter being: " + ((Circle) shapes.get(remove)).getD());
            System.out.println("To confirm this action write 'yes'");
            String confirmRemoveCircle = sc.next();
            if (confirmRemoveCircle.equals((String) "yes")) {
                shapes.remove(remove);
            }
            return shapes;
        }
        if (shapes.get(remove) instanceof Triangle) {
            System.out.println("You want to remove TRIANGLE with:");
            System.out.println("Side A: " + ((Triangle) shapes.get(remove)).getA());
            System.out.println("Side B: " + ((Triangle) shapes.get(remove)).getB());
            System.out.println("Side C: " + ((Triangle) shapes.get(remove)).getC());
            System.out.println("To confirm this action write 'yes'");
            String confirmRemoveTriangle = sc.next();
            if (confirmRemoveTriangle.equals((String) "yes")) {
                shapes.remove(remove);
            }
            return shapes;
        }
        if (shapes.get(remove) instanceof Rectangle) {
            System.out.println("You want to remove RECTANGLE with:");
            System.out.println("Side A: " + ((Rectangle) shapes.get(remove)).getA());
            System.out.println("Side B: " + ((Rectangle) shapes.get(remove)).getB());
            System.out.println("To confirm this action write 'yes'");
            String confirmRemoveRectangle = sc.next();
            if (confirmRemoveRectangle.equals((String) "yes")) {
                shapes.remove(remove);
            }
            return shapes;
        }
        return shapes;
    }

    public void info(List<CommonShapes> shapes) {
        System.out.println("Write an index of object in array that you wish to get information about");
        int info = sc.nextInt();
        if (shapes.get(info) == null) {
            System.out.println("There is no registered object under the index that You have written.");
            System.out.println(
                    "Try checking, which index the object that you want to get information about, has");
        }
        if (shapes.get(info) instanceof Square) {
            System.out.println("--- " + info + ". --- SQUARE ---");
            System.out.println("Side A: " + ((Square) shapes.get(info)).getA());
            ((Square) shapes.get(info)).perimeter();
        }
        if (shapes.get(info) instanceof Circle) {
            System.out.println("--- " + info + ". --- CIRCLE ---");
            System.out.println("Diameter being: " + ((Circle) shapes.get(info)).getD());
            ((Circle) shapes.get(info)).perimeter();
        }
        if (shapes.get(info) instanceof Triangle) {
            System.out.println("--- " + info + ". --- TRIANGLE ---");
            System.out.println("Side A: " + ((Triangle) shapes.get(info)).getA());
            System.out.println("Side B: " + ((Triangle) shapes.get(info)).getB());
            System.out.println("Side C: " + ((Triangle) shapes.get(info)).getC());
            ((Triangle) shapes.get(info)).perimeter();
        }
        if (shapes.get(info) instanceof Rectangle) {
            System.out.println("--- " + info + ". --- RECTANGLE ---");
            System.out.println("Side A: " + ((Rectangle) shapes.get(info)).getA());
            System.out.println("Side B: " + ((Rectangle) shapes.get(info)).getB());
            ((Rectangle) shapes.get(info)).perimeter();
        }
    }

    public void ainfo(List<CommonShapes> shapes) {
        int size = shapes.size();
        for (int i = 0; i < size; i++) {
            if (shapes.get(i) instanceof Square) {
                System.out.println("--- " + i + ". --- SQUARE ---");
                System.out.println("Side A: " + ((Square) shapes.get(i)).getA());
                ((Square) shapes.get(i)).perimeter();
            }
            if (shapes.get(i) instanceof Circle) {
                System.out.println("--- " + i + ". --- CIRCLE ---");
                System.out.println("Diameter being: " + ((Circle) shapes.get(i)).getD());
                ((Circle) shapes.get(i)).perimeter();
            }
            if (shapes.get(i) instanceof Triangle) {
                System.out.println("--- " + i + ". --- TRIANGLE ---");
                System.out.println("Side A: " + ((Triangle) shapes.get(i)).getA());
                System.out.println("Side B: " + ((Triangle) shapes.get(i)).getB());
                System.out.println("Side C: " + ((Triangle) shapes.get(i)).getC());
                ((Triangle) shapes.get(i)).perimeter();
            }
            if (shapes.get(i) instanceof Rectangle) {
                System.out.println("--- " + i + ". --- RECTANGLE ---");
                System.out.println("Side A: " + ((Rectangle) shapes.get(i)).getA());
                System.out.println("Side B: " + ((Rectangle) shapes.get(i)).getB());
                ((Rectangle) shapes.get(i)).perimeter();
            }
        }
    }
}
