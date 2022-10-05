import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import shapes.CommonShapes;

public class StateMachine {
    State state = State.ChooseFunctionalityState;
    Functionality func = new Functionality();
    List<CommonShapes> shapes = new ArrayList<>();
    Boolean exit = true;

    public void changeState(String choice) {
        switch (choice) {
            case "ChooseFunctionalityState":
                state = StateMachine.State.ChooseFunctionalityState;
                break;
            case "add":
                state = StateMachine.State.add;
                break;
            case "change":
                state = StateMachine.State.change;
                break;
            case "remove":
                state = StateMachine.State.remove;
                break;
            case "info":
                state = StateMachine.State.info;
                break;
            case "ainfo":
                state = StateMachine.State.ainfo;
                break;
            case "exit":
                state = StateMachine.State.exit;
                break;
        }
    }

    public enum State {
        ChooseFunctionalityState,
        add,
        change,
        remove,
        info,
        ainfo,
        exit
    }

    public void run() {
        while (exit) {
            switch (state) {
                case ChooseFunctionalityState:
                    String choice = func.chooseFirstFunctionality();
                    changeState(choice);
                    break;
                case add:
                    shapes = func.addChoice(shapes);
                    state = State.ChooseFunctionalityState;
                    break;
                case change:
                    shapes = func.change(shapes);
                    state = State.ChooseFunctionalityState;
                    break;
                case remove:
                    shapes = func.remove(shapes);
                    state = State.ChooseFunctionalityState;
                    break;
                case info:
                    func.info(shapes);
                    state = State.ChooseFunctionalityState;
                    break;
                case ainfo:
                    func.ainfo(shapes);
                    state = State.ChooseFunctionalityState;
                    break;
                case exit:
                    System.out.println("This will exit the programm, are you sure?");
                    System.out.println("Type 'yes' for exit.");
                    Scanner sc = new Scanner(System.in);
                    String exitChoice = sc.next();
                    if (exitChoice.equals("yes")) {
                        exit = false;
                    }
                    state = State.ChooseFunctionalityState;
                    break;
            }
        }
    }
}