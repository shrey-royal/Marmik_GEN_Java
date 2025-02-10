package file_handling;

import java.io.IOException;
import java.util.Scanner;

public class ReadWriteFiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReadWriteHandler handler = new ReadWriteHandler();
        String fileName = "";
        int choice;

        do {
            System.out.println("1. Write into a file");
            System.out.println("2. Read from the file");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the file: ");
                    fileName = sc.next();
                    try {
                        handler.writeFile(fileName, null);
                    } catch (IOException e) {
                        System.out.println("Error writing file!");
                    }
                    break;
                case  2:
                    System.out.print("Enter the name of the file: ");
                    fileName = sc.next();
                    try {
                        handler.readFile(fileName, null);
                    } catch (IOException e) {
                        System.out.println("Error reading file!");
                    }
                    break;
                case 0:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice, Please try again!");
            }
        } while (choice != 0);
        sc.close();
    }
}
