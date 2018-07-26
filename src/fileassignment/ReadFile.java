package fileassignment;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Ahmed El-Torky
 */
public class ReadFile {

    public static void main(String[] args) {

        File f = new File("file.txt");
        if (f.exists()) {
            try {
                read(f);
            } catch (IOException ex) {
                System.out.println("You have an error !!!");
                ex.toString();
            }

        } else {
            System.out.println("The File Not Exist !!!");
        }

    }

    public static void read(File f) throws IOException {
        if (f.canRead()) {
            String path = f.getCanonicalPath();
            Scanner read = new Scanner(new File(path));
            int i = 1;
            while (read.hasNext()) {
                System.out.printf("User_" + i + " data:" + read.next() + ", " + read.next() + ", "
                        + read.next() + ", " + read.next() + ", " + read.next());
                System.out.println();
                i++;
            }
            read.close();
        } else {
            System.out.println("The File not readable !!!");
        }
    }

}
