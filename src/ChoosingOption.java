// 5.1
import javax.swing.JOptionPane;
public class ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(
            null,
            "Choose option"
        );
        JOptionPane.showMessageDialog(
            null,
            "You've chosen: " + ((option == JOptionPane.YES_OPTION)? "Yes": "No")
        );

        System.exit(0);
    }
}
