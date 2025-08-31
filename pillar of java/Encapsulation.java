package encapsulation;

public class Encapsulation {

    static class Person {
        private String name; 

        public void setName(String newName) {
            name = newName;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Person p = new Person();

        p.setName("Moriom Khondoker Munni");  
        System.out.println("Name: " + p.getName());
    }
}
