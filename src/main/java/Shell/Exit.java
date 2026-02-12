package Shell;

public class Exit implements Executable {
    public void execute(String[] args) {
        System.exit(0);
    }
}