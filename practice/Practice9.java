package practice9;
import java.io.*;
public class Practice9 {
    public static void main(String[] args) {
        try {
            File f1 = new File("Moriom.txt");

            if (f1.createNewFile()) {
                System.out.println("File is created: " + f1.getName());
                System.out.println("File path is: " + f1.getAbsolutePath());
            } else {
                System.out.println("File already exists");
                System.out.println("File path is: " + f1.getAbsolutePath());
            }

            System.out.println("File size: " + f1.length());

            FileWriter w1 = new FileWriter(f1, true);
            w1.write("Moriom Khondoker Munni"
            +"0272130005101101"
            +"Advanced Enterprise Java"
            +"Section-58 B");
            System.out.println("Written in file, check the file");
            w1.close();

            BufferedReader b1 = new BufferedReader(new FileReader(f1));
            String l;
            while ((l = b1.readLine()) != null) {
                System.out.println(l);
            }
            b1.close();
        } catch (IOException e) {
            System.out.println("Exception is handled");
            e.printStackTrace();
        }
    }
}
