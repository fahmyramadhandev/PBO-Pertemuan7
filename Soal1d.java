package Soal1;

public class Soal1d {
    public static void main(String[] args) {
        int N = 5;
        int j = N;
        do {
            System.out.println("Anak ayam turun " + j + ", mati satu tinggal " + (j - 1));
            j--;
        } while (j >= 1);
        System.out.println("Anak ayam tidak ada yang tersisa.");
    }
}
