import java.util.Scanner;

public class ArrayNilai05 {
    public static void main(String[] args){
        int[] nilaiAkhir = new int [10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nilaiAkhir.length; i++){
            System.out.print("Masukkan nilai akhir mahasiswa ke-" + (i + 1) + " : ");
            nilaiAkhir[i] = input.nextInt();
        }

        System.out.println();
        for (int i = 0; i < nilaiAkhir.length; i++){
            String status = (nilaiAkhir[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" + status + ")");
        }
    }
}
