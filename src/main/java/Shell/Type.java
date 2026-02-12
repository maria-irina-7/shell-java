package Shell;

public class Type implements Executable {
    public void execute(String[] args) {
        if (args.length <= 1) {
            System.out.println("type: missing operand");
            return;
        }

        String name = args[1];
        if (InternalCommands.isValidCommand(name)) {
            System.out.println(name + " is a shell builtin");
        } else if (Utils.getExternalCommand(name) != null) {
            System.out.println(name + " is " + Utils.getExternalCommand(name));
        } else {
            System.out.println(name + ": not found");
        }
    }
}