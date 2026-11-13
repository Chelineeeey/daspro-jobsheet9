import java.util.Scanner;

public class SearchNilai05 {
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya elemen array: ");
        int n = input.nextInt();
        int [] nilai = new int[n];

        System.out.println("Masukkan " + n + " nilai:");
        for (int i = 0; i < n; i++) {
            nilai[i] = input.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari (key): ");
        int key = input.nextInt();

        boolean found = false;
        for (int i = 0; i < nilai.length; i++){
            if (nilai[i] == key){
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i + "(urutan ke-" + (i + 1) + ")");
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("Nilai yang dicari tidak ditemukan: nilai " + key + " tidak ada di dalam array yang berisi " + nilai.length + " elemen.");
        }

        input.close();
    }
}
