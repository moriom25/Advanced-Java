package practice11;
interface shape {
    void area();
}
class circle implements shape {
    public void area(){
        System.out.println("The shape is circle");}
}
class triangle implements shape {
    public void area() {
        System.out.println("The shape is triangle"); }
}
public class Practice11 {
    public static void main(String[] args) {
        circle c1 = new circle();
        c1.area();
        triangle t1 = new triangle();
        t1.area();
    }
}