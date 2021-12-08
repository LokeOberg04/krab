import javax.swing.*;
public class krab {
    public static void main(String[]args) {
        String input = JOptionPane.showInputDialog("pos?");
        String B = "";
        int output = 99999999;
        int crabs = 1;
        int diff = 0;
        String tal = "";
        for (int pos = 0; pos < 1000; pos++) {
            for (int n = 0; n < input.length(); n++) {
                if (input.charAt(n) == ',') {
                    diff += ((Math.abs(pos - Integer.parseInt(tal))) * ((Math.abs(pos - Integer.parseInt(tal))) + 1))/2;
                    tal = "";
                } else {
                    tal += input.charAt(n);
                }
            }
            diff += ((Math.abs(pos - Integer.parseInt(tal))) * ((Math.abs(pos - Integer.parseInt(tal))) + 1))/2;
            tal = "";
            if (diff < output) {
                output = diff;
                }
            diff = 0;
            }
        JOptionPane.showMessageDialog(null, output);
        }
    }