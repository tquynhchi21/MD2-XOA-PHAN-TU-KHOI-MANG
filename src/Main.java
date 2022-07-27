import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {5, 6, 10, 3, 2, 1, 8, 4};

        boolean found = false;

        System.out.println("Enter a value: ");

        int value = sc.nextInt();

        System.out.println("Old array:");
        for (int k : array) {
            System.out.print(k + "\t");
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                found = true;
                System.out.println("Find value in position " + i);
                System.arraycopy(array, i + 1, array, i, array.length - 1 - i);
                array[array.length - 1] = 0;
                System.out.println("New array:");
                for (int k : array) {
                    System.out.print(k + "\t");
                }
                System.out.println();
                System.out.println();
            }
        }
        if (!found) System.out.println("Value does not exist in array.");
    }
}