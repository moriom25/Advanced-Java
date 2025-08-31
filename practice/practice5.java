package practice5;

class animal {
    void eat() {
        System.out.println("eat food");
    }
}

class cat extends animal {
    void milk() {
        System.out.println("cat eat milk");
    }
}

public class practice5 {
    public static void main(String[] args) {
        cat c = new cat();
        c.eat();
        c.milk();
    }
}