import javax.swing.JOptionPane;
public class ShowTwoNumbers {
    public static void main(String[] args) {
        String num1, num2;
        String noti = "You have just entered: ";

        num1 = JOptionPane.showInputDialog(
                null,
                "First number: ",
                "Input first number",
                JOptionPane.INFORMATION_MESSAGE
        );

        noti += num1 + " and ";

        num2 = JOptionPane.showInputDialog(
                null,
                "Second number: ",
                "Input second number",
                JOptionPane.INFORMATION_MESSAGE
        );

        noti += num2;

        JOptionPane.showMessageDialog(
                null,
                noti,
                "Show 2 numbers",
                JOptionPane.INFORMATION_MESSAGE
        );

        System.exit(0);

    }
}
