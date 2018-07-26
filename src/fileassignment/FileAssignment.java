package fileassignment;

import java.io.*;
import java.util.Scanner;
import java.util.Formatter;
import java.util.StringTokenizer;

/**
 *
 * @author Ahmed El-Torky
 */
public class FileAssignment {

    public static void main(String[] args) {

        File file = new File("file.txt");
        if (!file.exists()) {
            createFile();
        }

        System.out.println("Please Enter Your\n"
                + "1-name\n"
                + "2-phone\n"
                + "3-email\n"
                + "4-password\n"
                + "5-birthdate\n"
                + "Sepearate your data by ',' :");
        addData(new Scanner(System.in).nextLine());

    }

    public static void createFile() {
        try {
            Formatter newFile = new Formatter("file.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found");
            ex.toString();
        }
    }

    public static void addData(String data) {
        try {
            FileWriter fw = new FileWriter("file.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            StringTokenizer st = new StringTokenizer(data, ",");
            while (st.hasMoreTokens()) {
                pw.println(st.nextToken());
            }
            pw.println();
            pw.close();
        } catch (IOException ex) {
            System.out.println("Error !!!\n");
            ex.toString();
        }
    }

}
