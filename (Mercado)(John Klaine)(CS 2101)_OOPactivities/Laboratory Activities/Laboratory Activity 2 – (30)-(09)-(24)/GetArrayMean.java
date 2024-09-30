import java.util.Scanner;
public class GetArrayMean {
    public static double getArrayMean(int []values){
        int sum = 0, size;
        double mean;
        size = values.length;

        for(int index = 0; size > index; index++){
            sum += values[index];
        }
        mean = (double) sum/size;

        return mean;
    }
    public static void main(String[] args){
        int size, element;
        double mean;
        int []values;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        size = input.nextInt();
        values = new int[size];
        
        for(int index = 0; size > index; index++){
            System.out.print("Enter number: ");
            element = input.nextInt();
            values[index] = element;
        }
        mean = getArrayMean(values);
        System.out.print("Mean of array is: " + mean);
        input.close();
    }
}
