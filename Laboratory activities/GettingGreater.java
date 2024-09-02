import java.util.Scanner;
public class GettingGreater {
    public static void main(String[] args) {
        Scanner chValue = new Scanner(System.in);
        System.out.println("Getting the Greater Value");
        System.out.print("Enter the first character: ");
        char ch1 = chValue.next().charAt(0);
        System.out.print("Enter the second character: ");
        char ch2 = chValue.next().charAt(0);
        chValue.close();
        System.out.println("-----------------------------------------\nThe character with greater value is: " + (char)Math.max(ch1, ch2) + "\n-----------------------------------------");
        System.out.println("Showing the ASCII Codes\n" + ch1 + " : " + ((int)ch1));
        System.out.println(ch2 + " : " + ((int)ch2));
    }
}
