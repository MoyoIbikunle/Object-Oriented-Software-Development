import java.io.*;

public class EasyIn {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    // Read a line of text
    public static String getString() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            System.out.println("Input error: " + e.getMessage());
            return "";
        }
    }

    // Read an integer
    public static int getInt() {
        while (true) {
            try {
                String line = getString();
                return Integer.parseInt(line.trim());
            } catch (NumberFormatException e) {
                System.out.print("Invalid integer, try again: ");
            }
        }
    }

    // Read a double
    public static double getDouble() {
        while (true) {
            try {
                String line = getString();
                return Double.parseDouble(line.trim());
            } catch (NumberFormatException e) {
                System.out.print("Invalid number, try again: ");
            }
        }
    }

    // Read a single character
    public static char getChar() {
        while (true) {
            String line = getString();
            if (line.length() > 0) {
                return line.charAt(0);
            } else {
                System.out.print("No input, try again: ");
            }
        }
    }
}
