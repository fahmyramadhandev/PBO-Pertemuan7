import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String[] kodeBarang = {"a001", "a002", "a003"};
        String[] namaBarang = {"Buku", "Pensil", "Pulpen"};
        int[] hargaBarang = {3000, 4000, 5000};
        
        System.out.println("TOKO SERBA ADA");
        System.out.println("**************");
        System.out.print("Masukkan Item Barang : ");
        int item = input.nextInt();
        
        String[] kode = new String[item];
        int[] jumlahBeli = new int[item];
        String[] nama = new String[item];
        int[] harga = new int[item];
        int[] jumlahBayar = new int[item];
        
        for (int i = 0; i < item; i++) {
            System.out.println("Data ke " + (i+1));
            System.out.print("   Masukkan Kode        : ");
            kode[i] = input.next();
            System.out.print("   Masukkan jumlah Beli : ");
            jumlahBeli[i] = input.nextInt();
            
            if (kode[i].equals("a001")) {
                nama[i] = namaBarang[0];
                harga[i] = hargaBarang[0];
            } else if (kode[i].equals("a002")) {
                nama[i] = namaBarang[1];
                harga[i] = hargaBarang[1];
            } else if (kode[i].equals("a003")) {
                nama[i] = namaBarang[2];
                harga[i] = hargaBarang[2];
            } else {
                nama[i] = "Tidak Ada";
                harga[i] = 0;
            }
            
            jumlahBayar[i] = harga[i] * jumlahBeli[i];
        }
        
        int totalBayar = 0;
        for (int i = 0; i < item; i++) {
            totalBayar = totalBayar + jumlahBayar[i];
        }
        
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("***********************");
        System.out.println("No  Kode Barang  Nama Barang  Harga  Jumlah Beli  Jumlah Bayar");
        System.out.println("===============================================================");
        
        for (int i = 0; i < item; i++) {
            System.out.println((i+1) + "   " + kode[i] + "        " + nama[i] + "       " + harga[i] + "  " + jumlahBeli[i] + "            " + jumlahBayar[i]);
        }
        
        System.out.println("===============================================================");
        System.out.println("Total Bayar                              " + totalBayar);
        System.out.println("===============================================================");
        
    }
}
