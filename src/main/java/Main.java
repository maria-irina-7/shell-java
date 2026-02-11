import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("$ ");
            String input = scanner.nextLine();

            String[] line = input.split(" ", 2);
            String command = line[0];

            Command cmd = Commands.get(command);
            if(cmd != null && Commands.isValidCommand(command)){
                cmd.execute(line);
            } else {
                System.out.println(input + ": command not found");
            }
        }
    }
}
