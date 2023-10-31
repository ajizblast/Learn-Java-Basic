public class MethodStatic {
    public static void main(String[] args) {
        sayHello("Chahyo", "Aji");
        sayHello("Mas", "Oji");
        sayHello("Pajar", "Nugraha");
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
