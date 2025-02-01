import java.util.Scanner;

public class Array2d {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter arr["+i+"]["+j+"] = ");
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        System.out.println("arr[" + arr.length + "][" + arr[0].length + "] = { ");
        // System.out.printf("arr[%d][%d] = { \n", arr.length, arr[0].length);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("\t");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d, ", arr[i][j]);
            }
            System.out.printf("\b\b \n");
        }
        System.out.println("}");
    }
}
