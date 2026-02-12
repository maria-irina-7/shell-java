package Commands;

public class PrintWorkingDirectory implements Executable {
    public void execute(String[] args) {
        System.out.println(System.getProperty("user.dir"));
    }
}
