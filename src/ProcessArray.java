// 5.5
import java.util.Arrays;
import java.util.Scanner;

public class ProcessArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the size of the array
        System.out.print("Size of array: ");
        int size = scanner.nextInt();

        // Initialize the array
        double[] array = new double[size];

        // Input elements into the array
        System.out.println("Enter " + size + " numeric values:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }

        // Sort the array
        Arrays.sort(array);

        // Calculate the sum and average
        double sum = 0;
        for (double num : array) sum += num;
        double average = sum / size;

        System.out.println("Sorted Array: " + Arrays.toString(array));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

    }
}
