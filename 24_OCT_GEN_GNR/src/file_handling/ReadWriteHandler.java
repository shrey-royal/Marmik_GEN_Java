package file_handling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteHandler {

    public void writeFile(String fileName, String folderPath) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (folderPath == null) folderPath = "";

        FileWriter fout = new FileWriter(folderPath + fileName + ".txt");
        System.out.println("Enter the data you want to write into " + fileName);
        String data = sc.nextLine();

        fout.write(data);
        System.out.println("\n\nFile written successfully...");
        fout.close();
    }

    public void readFile(String fileName, String folderPath) throws IOException {
        if (folderPath == null) folderPath = "";

        FileReader fin = new FileReader(folderPath + fileName + ".txt");
        int i = 0;
        while( (i = fin.read()) != -1) System.out.print((char) i);

        System.out.println("\n\nEnd of file...");
        fin.close();
    }
}
