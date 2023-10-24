import java.util.Scanner;

public class ModifikasiPemilihan2PercobaanKedua {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Tahun: ");
        int tahun = scanner.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0) {
                System.out.println("Tahun Kabisat");
        } else if ((tahun % 400) == 0) {
                System.out.println("Merupakan tahun");
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
            } else {
                System.out.println("Bukan Tahun Kabisat");
            }
    }
}