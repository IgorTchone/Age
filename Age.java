import java.util.Scanner;

public class Age {
    public static void main(String[ ] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Your age is " + age + ".");

        if (age >= 18) {
            System.out.println("You are of legal age.");
        } else {
            System.out.println("You are a minor.");
        }
    }

}
