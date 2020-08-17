import javax.swing.*;
public class EvenOdd {
    public static void main (String[] args) {
        int num;
        String str, output;
        str = JOptionPane.showInputDialog(null, "Enter an integer");
        num = Integer.parseInt(str);
        if (num % 2 == 0)
            output = "even.";
        else
            output = "odd.";
        JOptionPane.showMessageDialog(null, "The number you entered is " + output);
    }
}
