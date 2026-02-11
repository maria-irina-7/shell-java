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
                case "exit" -> exit();
                case "echo" -> echo(arguments);
                default -> notFound(command);
            }
        }

    }

    private static void exit() {
        System.exit(0);
    }

    private static void echo(String text) {
        System.out.println(text);
    }

    private static void notFound(String input) {
        System.out.println(input + ": command not found");
    }

}
