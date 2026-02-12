package Shell;

public class Echo implements Executable {
    public void execute(String[] args) {
        if (args.length > 1)
            System.out.println(args[1]);
        else
            System.out.println("echo: missing arguments");
    }
}