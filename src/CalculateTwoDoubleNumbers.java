// 1.1.5
import javax.swing.JOptionPane;
public class CalculateTwoDoubleNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;
        double a, b, sum, diff, product, quotient;
        String ln = System.getProperty("line.separator");
        String res;

        strNum1 = JOptionPane.showInputDialog(
                null,
                "a = ",
                "First number",
                JOptionPane.INFORMATION_MESSAGE
        );
        a = Double.parseDouble(strNum1);

        strNum2 = JOptionPane.showInputDialog(
                null,
                "b = ",
                "Second number",
                JOptionPane.INFORMATION_MESSAGE
        );
        b = Double.parseDouble(strNum2);

        sum = a + b;
        diff = a - b;
        product = a * b;
        quotient = a / b;

        res = "a + b = " + sum + ln
            + "a - b = " + diff + ln
            + "a * b = " + product + ln
            + "a / b = " + quotient;

        JOptionPane.showMessageDialog(
                null,
                res,
                "Calculate 2 numbers",
                JOptionPane.INFORMATION_MESSAGE
        );

        System.exit(0);
    }
}
