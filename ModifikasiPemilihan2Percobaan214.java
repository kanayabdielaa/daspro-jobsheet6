import java.util.Scanner;

public class ModifikasiPemilihan2Percobaan214 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Tahun: ");
        int tahun = scanner.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0) {
                System.out.println("Tahun Kabisat");
        } else {
                System.out.println("Bukan Tahun Kabisat");
        }
            } else {
                System.out.println("Bukan Tahun Kabisat");
            }
    }
}