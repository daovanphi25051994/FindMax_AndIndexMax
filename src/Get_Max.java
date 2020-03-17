import java.util.Scanner;
import java.util.Scanner;

public class Get_Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the size of array : ");
        int size = scanner.nextInt();
        if (size > 0) {
            int[] arrNumber = new int[size];
            for (int i = 0; i < arrNumber.length; i++) {
                System.out.printf("arr[%d] = ", i);
                arrNumber[i] = scanner.nextInt();
            }
            int indexMax = getMaxIndexOfArray(arrNumber);
            System.out.printf("max = %d ; index = %d", arrNumber[indexMax], indexMax);
        } else {
            System.out.printf("Invalid input !!");
        }
    }

    public static int getMaxIndexOfArray(int[] arrayNumber) {
        int indexMax = 0;
        int max = arrayNumber[0];
        for (int i = 1; i < arrayNumber.length; i++) {
            if (max < arrayNumber[i]) {
                max = arrayNumber[i];
                indexMax = i;
            }
        }
        return indexMax;
    }
}


