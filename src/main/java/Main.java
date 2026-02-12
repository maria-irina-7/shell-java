import java.util.Scanner;
import Commands.Executable;
import Commands.Commands;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("$ ");
            String input = scanner.nextLine();

            String[] line = input.split(" ", 2);
            String command = line[0];

            Executable cmd = Commands.get(command);
            if(cmd != null && Commands.isValidCommand(command)){
                cmd.execute(line);
            } else if (Commands.getOutsideCommand(command) != null) {
                Process process = Runtime.getRuntime().exec(input.split(" "));
                process.getInputStream().transferTo(System.out);
            } else {
                System.out.println(input + ": command not found");
            }
        }
    }
}
