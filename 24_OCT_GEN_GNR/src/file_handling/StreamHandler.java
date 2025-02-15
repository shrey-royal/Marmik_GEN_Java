package file_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class StreamHandler {
    public void writeFile(String fileName, String folderPath) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (folderPath == null) folderPath = "";

        FileOutputStream fout = new FileOutputStream(folderPath + fileName);
        System.out.println("Enter the data you want to write into " + fileName);
        byte[] data = sc.nextLine().getBytes();

        fout.write(data);
        System.out.println("\n\nFile written successfully...");
        fout.close();
    }

    public void readFile(String fileName, String folderPath) throws IOException {
        if (folderPath == null) folderPath = "";

        FileInputStream fin = new FileInputStream(folderPath + fileName);
        int i = 0;
        while( (i = fin.read()) != -1) System.out.print((char) i);

        System.out.println("\n\nEnd of file...");
        fin.close();
    }
}
