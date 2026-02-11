import java.util.HashMap;
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

    public static Command get(String name) {
        return commands.get(name);
    }
}
