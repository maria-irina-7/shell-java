import java.io.File;
import java.io.FilenameFilter;
import java.util.Map;

public class Commands {
    private static final Map<String, Command> commands = Map.of(
            "exit", new Exit(),
            "echo", new Echo(),
            "type", new Type()
    );

    public static boolean isValidCommand(String name){
        return commands.containsKey(name);
    }

    public static String getOutsideCommand(String name) {
        String allOutsideCommands = System.getenv("PATH");
        String[] pathCommands = allOutsideCommands.split(":");

        for(int i = 0; i < pathCommands.length; i++) {
            File file = new File(pathCommands[i], name);
            if(file.exists() && file.canExecute()) {
                return file.getAbsolutePath();
            }
        }
        return null;
    }

    public static Command get(String name) {
        return commands.get(name);
    }
}
