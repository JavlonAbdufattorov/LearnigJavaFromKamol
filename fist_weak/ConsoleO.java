import java.util.Scanner;

public class ConsoleO {

    public static void main(String[] args) {
        String message = "I am just want print it";
        System.out.println(message);
        System.out.println("Hello Kamol Aka");

        Scanner scan = new Scanner(System.in);
        System.out.println("Please write your name");
        String fullName = scan.nextLine();
        System.out.println("Welcom " + fullName);
        

    }
}