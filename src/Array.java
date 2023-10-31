public class Array {
    public static void main(String[] args) {

        String[] stringArray;

        stringArray = new String[3];

        stringArray[0] = "Chahyo";
        stringArray[1] = "Purnomo";
        stringArray[2] = "Aji";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        stringArray[0] = "Ikan Mas";
        System.out.println(stringArray[0]);

        String[] stringArray2 = new String[3];

        String[] namaNama = {
                "Chahyo", "Purnomo", "Aji"
        };

        namaNama [0] = null;

        int[] arrayInt = new int[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };

        long[] arrayLong = {
                10L, 20L, 30L
        };

        arrayLong[0] = 100;

        System.out.println(arrayLong[0]);
        System.out.println(arrayLong[1]);
        System.out.println(arrayLong.length);

        String [][] members = {
                {"chahyo", "purnomo", "aji" },
                {"muhammad", "bima"},
                {"maria", "owaza"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
    }
}
