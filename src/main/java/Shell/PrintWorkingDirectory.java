package Shell;

public class PrintWorkingDirectory implements Executable {
    WorkingDirectory dir;
    PrintWorkingDirectory() {
        super();
        dir = new WorkingDirectory();
    }
    public void execute(String[] args) {
        System.out.println(dir.getCurrentDirectory());
    }
}
