package Commands;

public class Type implements Executable {
    public void execute(String[] args) {
        if (args.length <= 1) {
            System.out.println("type: missing operand");
            return;
        }

        String name = args[1];
        if (Commands.isValidCommand(name)) {
            System.out.println(name + " is a shell builtin");
        } else if (Commands.getOutsideCommand(name) != null) {
            System.out.println(name + " is " + Commands.getOutsideCommand(name));
        } else {
            System.out.println(name + ": not found");
        }
    }
}