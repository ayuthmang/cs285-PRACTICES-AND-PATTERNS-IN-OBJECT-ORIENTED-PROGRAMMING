package command;

import java.util.Stack;

public class User {

    private Stack<Command> commands;

    public User() {
        commands = new Stack<>();
    }

//    public double compute(String operator, String operand) {
//        switch (operator) {
//            case "+":
//            case "-":
//
//            default:
//        }
//    }

    public double execute() {
        return 0f;
    }

    public double undo(int level) {
        return 0f;
    }

    public double redo(int level) {
        return 0f;
    }

    public static void main(String... args) {
        User user = new User();

    }
}
