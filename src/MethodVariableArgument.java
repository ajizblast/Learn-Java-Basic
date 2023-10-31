public class MethodVariableArgument {
    public static void main(String[] args) {

        int[] values = {80,60,60,60,80};
        sayCongrats("Ilham", values);

        sayCongrats("Chahyo ", 80,90,100,80,90);

    }
    static void sayCongrats(String name, int... values){
        var total = 0;
        for (var value : values){
            total += value;
        }
        var finalValue = total/values.length;

        if (finalValue >= 75){
            System.out.println("Selamat "+ name+ "Kamu Lulus!");
        } else {
            System.out.println("Maaf "+ name + " Tidak Lulus!");
        }
    }
}
