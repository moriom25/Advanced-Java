package practice10;
import java.util.*;
public class Practice10{
    public static void main(String[] args) {
        List<String> s2 = new ArrayList<>();
        s2.add("C programming by ANSI C");
        s2.add("Ikigai");
        s2.add("Ikigai");
        s2.add("Ikigai");
        System.out.println("ArrayList: " + s2);
        Set<String> s3 = new HashSet<>();
        s3.add("Morium khondoker");
        s3.add("Munni");
        s3.add("Munni"); 
        System.out.println("HashSet: " + s3);
        Queue<String> s4 = new LinkedList<>();
        s4.add("Student1");
        s4.add("Student2");
        System.out.println("LinkedList (Queue): " + s4);
        Map<Integer, String> s5 = new HashMap<>();
        s5.put(101, "Java");
        s5.put(102, "Python");
        s5.put(103, "JavaScript");
        System.out.println("HashMap: " + s5);
        System.out.println("HashSet size: " + s3.size());
        s2.clear();
        System.out.println("After clear, ArrayList: " + s2);
        System.out.println("ArrayList size: " + s2.size());
        Set<String> s6 = new HashSet<>();
        s6.add("Morium khondoker");
        s6.add("Munni");
        s6.add("Munni"); 
        System.out.println("HashSet s6: " + s6);
        s6.remove("Munni");
        System.out.println("After remove, HashSet s6: " + s6);
        System.out.println("HashSet s6 size: " + s6.size());
        
        Queue<String> s1 = new LinkedList<>();
        s1.add("Student2");
        s1.add("Student3");
        System.out.println("LinkedList s1: " + s1);
        System.out.println("LinkedList s1 size: " + s1.size());

        Map<Integer, String> s = new HashMap<>();
        s.put(101, "Java");
        s.put(102, "Python");
        s.put(103, "JavaScript");
        System.out.println("Another HashMap: " + s);
    }
}
