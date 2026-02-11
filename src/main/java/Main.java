import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("$ ");
            String input = scanner.nextLine();

            String[] line = input.split(" ", 2);
            String command = line[0];

            String arguments = " ";
            if(line.length > 1) {
                arguments = line[1];
            }


            switch (command) {
                case "exit" -> {
                    Command c = new Exit();
                    c.execute(line);
                }
                case "echo" -> {
                    Command c = new Echo();
                    c.execute(line);
                }
                case "type" -> {
                    Command c = new Type();
                    c.execute(line);
                }
                default -> {
                    System.out.println(input + ": command not found");
                }
            }
        }
    }
}
