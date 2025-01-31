import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter user's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter user's age: ");
        int age = scanner.nextInt();

        System.out.print("Enter user's weight: ");
        float weight = scanner.nextFloat();

        scanner.nextLine();

        System.out.print("(True or False) You are a smoker? ");
        boolean smokerStatus = scanner.nextBoolean();

        System.out.println("User's name: " + name + ", User's age: " + age + ", User's weight: " + weight + ",  You are a smoker? " + smokerStatus);

        scanner.close();
    }

}
