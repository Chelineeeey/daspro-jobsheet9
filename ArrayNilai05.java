import java.util.Scanner;

public class ArrayNilai05 {
    public static void main(String[] args){
        int[] nilaiAkhir = new int [10];
        Scanner input = new Scanner(System.in);
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < nilaiAkhir.length; i++){
            System.out.print("Masukkan nilai akhir mahasiswa ke-" + (i + 1) + " : ");
            nilaiAkhir[i] = input.nextInt();
        }

        for (int i = 0; i < nilaiAkhir.length; i++){
            String status;
            if (nilaiAkhir[i] > 70){
                status = "LULUS";
                jumlahLulus++;
            } else {
                status = "TIDAK LULUS";
                jumlahTidakLulus++;
            }
             System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" + status + ")");
        }
        System.out.println("Jumlah mahasiswa LULUS       : " + jumlahLulus);
        System.out.println("Jumlah mahasiswa TIDAK LULUS : " + jumlahTidakLulus);
        input.close();
    }
}
