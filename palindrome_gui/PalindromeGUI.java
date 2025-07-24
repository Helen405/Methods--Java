import javax.swing.*;

public class PalindromeGUI {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter a number:");
        String reverse = new StringBuilder(input).reverse().toString();

        String message = input.equals(reverse) ?
                input + " is a palindrome." :
                input + " is NOT a palindrome.";

        JOptionPane.showMessageDialog(null, message, "Result", JOptionPane.INFORMATION_MESSAGE);
    }
}
