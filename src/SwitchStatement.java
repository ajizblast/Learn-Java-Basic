public class SwitchStatement {
    public static void main(String[] args) {
        //SWITCH CASE
        var nilai = "B";

        switch (nilai) {
            case "A":
                System.out.println("Wow, Anda Lulus Dengan Baik");
                break;
            //case b dan c digabung
            case "B":
            case "C":
                System.out.println("Nilai Anda Cukup Baik");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Mungkin Anda salah jurusan");
        }

        //SWITCH LAMBDA
        switch (nilai) {
            case "A" -> System.out.println("Wow, Anda Lulus Dengan Baik");
            case "B", "C" -> System.out.println("Nilai Anda Cukup Baik");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default -> {
                System.out.println("Muungkin Anda Salah Jurusan");
            }
        }

        //SWITCH YIELD
        //A. SWITCH TANPA YIELD
        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = "Wow, Anda Lulus Dengan Baik";
            case "B", "C" -> ucapan = "Nilai Anda Cukup Baik";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default -> {
                ucapan = "Muungkin Anda Salah Jurusan";
            }
        }
        System.out.println(ucapan);

        //B. SWITCH DENGAN YIELD
        ucapan = switch (nilai) {
            case "A":
                yield "Wow, Anda Lulus Dengan Baik";
            case "B", "C":
                yield "Nilai Anda Cukup Baik";
            case "D":
                yield "Anda Tidak Lulus";
            default:
                yield "Muungkin Anda Salah Jurusan";
        };

        System.out.println(ucapan);
    }
}
