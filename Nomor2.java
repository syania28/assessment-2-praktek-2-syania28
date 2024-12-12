import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        import java.util.ArrayList;
import java.util.Scanner;
public class soal2 {
    static int[] hargaBuku = {350000, 450000, 500000, 95000};
    static String[] namaBuku = {"Sherlock Holmes", "Arsene Lupin", "Game of Thrones", "Psychology of Money"};
    
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> hargaBelanja = new ArrayList<>();
        int pilihan;

        System.out.println("Daftar Buku:");
        for (int i = 0; i < namaBuku.length; i++) {
            System.out.println((i + 1) + ". " + namaBuku[i] + " " + hargaBuku[i]);
        }

        do {
            System.out.print("Masukan Pilihan Buku[1/2/3/4]: ");
            int pilihanBuku = scanner.nextInt();
            hargaBelanja.add(hargaBuku[pilihanBuku - 1]);

            System.out.print("Input lagi (Y/N)?: ");
            pilihan = scanner.next().charAt(0);
        } while (pilihan == 'Y' || pilihan == 'y');

        int totalHarga = hitungTotalHarga(hargaBelanja);
        int totalVoucher = hitungVoucher(totalHarga);

        System.out.println("Total voucher belanja = " + totalVoucher);
        System.out.println("Total yang harus dibayar = " + (totalHarga - totalVoucher));
    }
    
    public static int hitungTotalHarga(ArrayList<Integer> hargaBelanja) {
        int total = 0;
        for (int harga : hargaBelanja) {
            total += harga;
        }
        return total;
    }

    public static int hitungVoucher(int totalHarga) {
        if (totalHarga < 200000) {
            return 0;
        } else if (totalHarga <= 500000) {
            return 50000;
        } else if (totalHarga <= 750000) {
            return 100000;
        } else if (totalHarga <= 1000000) {
            return 150000;
        } else {
            return 200000;
        }
    }
}


