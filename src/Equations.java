import javax.swing.JOptionPane;
import java.lang.Math;
public class Equations {
    public static void main(String[] args) {
        LinearEquation();
        LinearSystem();
        SecondDegreeEquation();
    }

    static String ln = System.getProperty("line.separator");

    private static double GetDouble(String msg) {
        return Double.parseDouble(
            JOptionPane.showInputDialog(
                null,
                msg,
                "Linear system",
                JOptionPane.INFORMATION_MESSAGE
            )
        );
    }

    public static void LinearEquation() {
        double a = GetDouble("a = "), b = GetDouble("b = ");

        if (a == 0) {
            if (b == 0) {
                JOptionPane.showMessageDialog(null, "∀x");
            } else {
                JOptionPane.showMessageDialog(null, "∄x");
            }
        } else {
            JOptionPane.showMessageDialog(null, "x = " + (-b/a));
        }

    }

    public static void LinearSystem() {
        String infoMsg = "First-degree equations with 2 variables" + ln
                + "a1.x + b1.y = c1" + ln
                + "a2.x + b2.y = c2";
        JOptionPane.showMessageDialog(null, infoMsg);

        double a1 = GetDouble("a1 = "), b1 = GetDouble("b1 = "), c1 = GetDouble("c1 = ");
        double a2 = GetDouble("a2 = "), b2 = GetDouble("b2 = "), c2 = GetDouble("c2 = ");

        double det = a1 * b2 - a2 * b1;
        double detX = c1 * b2 - c2 * b1;
        double detY = a1 * c2 - a2 * c1;

        String res;

        if (det != 0) {
            res = "x = " + (detX / det) + ln + "y = " + (detY / det);
        } else {
            if (detX == 0 && detY == 0) res = "∀x";
            else res = "∄x";
        }

        JOptionPane.showMessageDialog(null, res);
    }

    public static void SecondDegreeEquation() {
        String infoMsg = "Second-degree equation ax^2 + bx + c = 0";
        JOptionPane.showMessageDialog(null, infoMsg);

        double a = GetDouble("a = "), b = GetDouble("b = "), c = GetDouble("c = ");
        double delta = b*b - 4*a*c;
        double x1;

        String res;

        if (a == 0) {
            res = "x = " + (-c/b);
        } else {
            if (delta < 0) {
                double posDelta = Math.sqrt(-delta) / (2*a);
                String Im = posDelta + "i";
                x1 = -b/(2*a);
                res = "x1 = " + x1 + " + " + Im + ln
                    + "x2 = " + x1 + " - " + Im;
            } else if (delta == 0) {
                x1 = -b/(2*a);
                res = "x = " + x1;
            } else {
                double posDelta = Math.sqrt(delta);
                double x2;
                x1 = (-b + posDelta) / 2;
                x2 = (-b - posDelta) / 2;
                res = "x1 = " + x1 + ln
                    + "x2 = " + x2;
            }
        }

        JOptionPane.showMessageDialog(null, res);

    }
}
