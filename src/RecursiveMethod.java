public class RecursiveMethod {
    public static void main(String[] args) {

        System.out.println(factorialLoop(10));
        System.out.println(1 * 2 * 3 * 4 * 5);

        System.out.println(factorialRecursive(10));

        loop(100);

    }

    //1. MENGGUNAKAN FACTORIAL LOOP
    static int factorialLoop(int value){
        var result = 1;

        for (var counter = 1; counter <= value; counter++){
            result *= counter;
        }
        return result;
    }

    //2. MENGGUNAKAN FACTORIAL RECURSIVE
    static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }

    static void loop(int value) {
        if (value == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop " + value);
            loop(value - 1);
        }
    }
}
