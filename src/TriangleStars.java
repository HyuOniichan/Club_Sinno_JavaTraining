// 5.3
import java.util.Scanner;
public class TriangleStars {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int n = keyboard.nextInt();

        for (int i = 1; i <= n; i++) {
            String thisLine = "";
            int space = 5-i;
            for (int j = 1; j <= n*2-1; j++) {
                if (space < j && j < n*2 - space) thisLine += "*";
                else thisLine += " ";
            }
            System.out.println(thisLine);
        }

        System.exit(0);
    }
}
