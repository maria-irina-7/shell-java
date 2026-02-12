interface Command {
    void execute(String[] args);
}

class Exit implements Command {
    public void execute(String[] args) {
        System.exit(0);
    }
}
class Echo implements Command {
    public void execute(String[] args) {
        if (args.length > 1)
            System.out.println(args[1]);
        else
            System.out.println("echo: missing arguments");
    }
}

class Type implements Command {
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

class PrintWorkingDirectory implements Command {
    public void execute(String[] args) {
        System.out.println(System.getProperty("user.dir"));
    }
}

