import java.util.Scanner;
import Commands.Executable;
import Commands.InternalCommands;
import Commands.Utils;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("$ ");
            String input = scanner.nextLine();

            String[] line = input.split(" ", 2);
            String command = line[0];

            Executable cmd = InternalCommands.get(command);
            if(cmd != null && InternalCommands.isValidCommand(command)){
                cmd.execute(line);
            } else if (Utils.getExternalCommand(command) != null) {
                Process process = Runtime.getRuntime().exec(input.split(" "));
                process.getInputStream().transferTo(System.out);
            } else {
                System.out.println(input + ": command not found");
            }
        }
    }
}
