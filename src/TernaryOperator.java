public class TernaryOperator {
    public static void main(String[] args) {
        //A. KODE TANPA TERNARY OPERATOR
        var skor = 75;
        String kata;

        if (skor >= 70){
            kata = "Selamat Kamu Lulus";
        } else {
            kata = "Kamu Belum Lulus";
        }

        System.out.println(kata);

        //KODE DENGAN TERNARY OPERATOR
        var nilai = 75;
        String ucapan = nilai >= 75 ? "Selamat Anda Lulus" : "Silahkan Coba lagi";

        System.out.println(ucapan);

    }
}