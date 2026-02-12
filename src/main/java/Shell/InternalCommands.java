package Shell;

import java.util.Map;

public class InternalCommands {
    private static final Map<String, Executable> commands = Map.of(
            "exit", new Exit(),
            "echo", new Echo(),
            "type", new Type(),
            "pwd", new PrintWorkingDirectory(),
            "cd", new ChangeDirectory()
    );

    public static boolean isValidCommand(String name){
        return commands.containsKey(name);
    }

    public static Executable get(String name) {
        return commands.get(name);
    }
}
