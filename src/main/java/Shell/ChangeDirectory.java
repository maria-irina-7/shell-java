package Shell;

import java.io.File;
import java.nio.file.Path;

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

        if (args[1].startsWith("/")) {
            absolutePath(args[1]);
        } else if (args[1].startsWith("~")) {
            dir.setCurrentDirectory(System.getenv("HOME"));
        } else {
            relativePath(args[1]);
        }
    }

    private void absolutePath(String path) {
        File directory = new File(path);
        if(directory.isDirectory()) {
            dir.setCurrentDirectory(path);
        } else {
            System.out.println("cd: " + path + ": No such file or directory");
        }
    }

    private void relativePath(String path) {
        Path normalize = Path.of(dir.getCurrentDirectory()).resolve(path).normalize();
        setCurrentDirectory(normalize.toString());
    }
}
