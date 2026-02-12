package Shell;

import java.io.File;

public class ChangeDirectory extends WorkingDirectory implements Executable{
    WorkingDirectory dir;
    ChangeDirectory() {
        super();
        dir = new WorkingDirectory();
    }

    public void execute(String[] args) {
        if (args.length <= 1) {
            System.out.println("type: missing operand");
            return;
        }

        File directory = new File(args[1]);
        if(directory.isDirectory()) {
            dir.setCurrentDirectory(args[1]);
        } else {
            System.out.println("cd: " + args[1] + ": No such file or directory");
        }
    }
}
