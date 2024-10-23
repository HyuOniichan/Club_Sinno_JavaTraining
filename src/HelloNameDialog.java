import javax.swing.JOptionPane;
public class HelloNameDialog {
    public static void main(String[] args) {
        String res = JOptionPane.showInputDialog("Name: ");
        JOptionPane.showMessageDialog(null, "Hi " + res + "!");
        System.exit(0);
    }
}
