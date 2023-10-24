import java.util.Scanner;

public class Pemilihan2Percobaan314 {
    public static void main (String[] args) {
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        Scanner noAbsen = new Scanner(System.in);
        System.out.println("Masukkan Kategori : ");
        kategori = noAbsen.nextLine();
        System.out.println("Masukkan Besarnya Penghasilan : ");
        penghasilan = noAbsen.nextInt();

        if (kategori.equals("pekerja")) {
            if (penghasilan <= 2000000)
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else
                pajak= 0.2;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan Bersih : " + gajiBersih);
        } else if (kategori.equals("pebisnis")) {
            if (penghasilan <= 2500000)
                 pajak = 0.15;
            else if (penghasilan <= 3500000)
                pajak = 0.2;
            else 
                pajak = 0.25;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan Bersih :" + gajiBersih);
        } else
            System.out.println("Masukkan Kategori Salah ");

    }
      
}