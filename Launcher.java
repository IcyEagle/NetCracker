public class Launcher {

    public static void main(String[] args) {
        A instance = new AB();
        instance.a();
    }
}

class A {

    void a() {
        System.out.println("Hello world!");
        b();
    }
}

class B {

    void a() {
        System.out.println("Hello world!");
    }

    void b() {
        System.out.println("Hello world!");
    }

}

class AB extends A, B {

}