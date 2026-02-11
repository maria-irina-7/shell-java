import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // loop
        while(true) {
            // read
            System.out.print("$ ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            // eval
            if (input.equals("exit")) {
                break;
            }
            // print
            System.out.println(input + ": command not found");

        }
    }

}
