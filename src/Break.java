public class Break {
    public static void main(String[] args) {

        //1. BREAK
        var counter = 1;

        while (true){
            System.out.println("Ini Perulangan " + counter);

            counter++;

            if (counter > 10){
                break;
            }
        }

        System.out.println("Perulangan Telah Berhenti");
    }
}
