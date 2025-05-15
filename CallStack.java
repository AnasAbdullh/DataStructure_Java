public class FunctionCallDemo {

    public static void main(String[] args) {
        System.out.println("Starting the program...");
        A();
        System.out.println("Program finished.");
    }

    public static void A() {
        System.out.println("Inside function A");
        B();
    }

    public static void B() {
        System.out.println("Inside function B");
        C();
    }

    public static void C() {
        System.out.println("Inside function C");
        D();
    }

    public static void D() {
        System.out.println("Inside function D");
    }
}