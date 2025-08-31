package practice12;
interface study{
void coding();
}
class student implements study{
public void coding(){
    System.out.println("Moriom Khondoker Munni");
}
 }
public class Practice12 {

    public static void main(String[] args) {
       student s1= new student();
       s1.coding();
    }
    
}
