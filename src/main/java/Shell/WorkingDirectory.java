package Shell;

public class WorkingDirectory {
    private static volatile String currentDirectory = System.getProperty("user.dir");

    public void setCurrentDirectory(String path) {
        currentDirectory = path;
    }

    public String getCurrentDirectory() {
        return currentDirectory;
    }

}
