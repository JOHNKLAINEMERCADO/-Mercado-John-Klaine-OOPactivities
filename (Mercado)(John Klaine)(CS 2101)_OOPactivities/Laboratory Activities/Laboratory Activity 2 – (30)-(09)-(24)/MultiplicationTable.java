import java.util.Scanner;
public class MultiplicationTable {
    public static void multiplicationTable(int size){
        int number;
        System.out.println("Multiplication Table: ");
        for(int i = 1; size >= i; i++){
            for(int j = 1; size >= j; j++){
                number = i*j;
                System.out.printf("%4d", number);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the multiplication table: ");
        int size = input.nextInt();
        multiplicationTable(size);
        input.close();
    }
}
