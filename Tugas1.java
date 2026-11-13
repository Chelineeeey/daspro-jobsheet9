import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int n = input.nextInt();

        if(n <= 0){
            System.out.println("Banyaknya nilai mahasiswa harus lebih dari 0.");
            input.close();
            return;
        }

        int[] nilai = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
            total += nilai[i];
        }

        double rataRata = (double) total / n;
        int tertinggi = nilai[0];
        int terendah = nilai[0];

        for (int i = 1; i < n; i++){
            if (nilai[i] > tertinggi) tertinggi = nilai[i];
            if (nilai[i] < terendah) terendah = nilai[i];
        }

        System.out.println();
        System.out.println("=== DAFTAR NILAI MAHASISWA ===");
        for (int i = 0; i < n; i++){
            String status = "";
            if (nilai[i] >= rataRata) {
                status = "Lulus";
            } else {
                status = "Tidak Lulus";
            }
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i] + " (" + status +")");
        }

        System.out.println();
        System.out.println("=== RINGKASAN NILAI ===");
        System.out.printf("Rata-rata nilai: %.2f\n", rataRata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        input.close();

    }
    
}
