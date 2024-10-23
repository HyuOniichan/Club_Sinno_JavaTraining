// 5.2
import java.util.Scanner;
public class InputFromKeyboard {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Name?");
        String name = keyboard.nextLine();
        System.out.println("Old?");
        int age = keyboard.nextInt();
        System.out.println("Tall?");
        double height = keyboard.nextDouble();

        System.out.println("Hi Mr. " + name + ", " + age + " years old. Your height is " + height + "m.");

        System.exit(0);
    }
}
