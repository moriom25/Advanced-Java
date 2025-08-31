package Practice8;
import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int id;
    transient String password;

    public Person(String s, int i, String p) {
        name = s;
        id = i;
        password = p;
        System.out.println("Default Constructor");
    }

    public void display() {
        System.out.println(name + "\n" + id + "\n" + password);
    }
}

public class Practice8 {
    public static void main(String[] args) {
        Person p1 = new Person("Moriom", 1101, "58B");
        p1.display();
        try {
            FileOutputStream fo = new FileOutputStream("person.ser");
            ObjectOutputStream os = new ObjectOutputStream(fo);
            os.writeObject(p1);
            os.close();
            fo.close();
            System.out.println("Object is Serialized");

            FileInputStream fi = new FileInputStream("person.ser");
            ObjectInputStream os2 = new ObjectInputStream(fi);
            Person dp = (Person) os2.readObject();
            os2.close();
            fi.close();
            System.out.println("Object is Deserialized");
            dp.display();
        } catch (Exception e) {
            System.out.println("An Error Occurred");
            e.printStackTrace();
        }
    }
}
