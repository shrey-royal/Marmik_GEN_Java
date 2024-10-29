import java.util.Random;

public class Arrayy {
    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        int size = Integer.parseInt(System.console().readLine());

        int arr[] = new int[size];
        Random r = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(100);
            // arr[i] = (int)(Math.random() * 100) + 1;
        }

        // System.out.println();
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + ", ");
        // }
        // System.out.println();

        for (int elem : arr) {
            System.out.print(elem + ", ");
        }
    }
}
