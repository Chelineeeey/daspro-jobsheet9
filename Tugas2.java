import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("===DAFTAR MENU KAFE KAMPUS===");
        for (int i = 0; i < menu.length; i++){
            System.out.println((i + 1) + ". " + menu[i] + " Rp" + harga[i]);
        }

        System.out.print("\nMasukkan nama menu yang ingin dicari ketersediaannya: ");
        String cariMenu = input.nextLine();
        boolean found = false;
        int indeksMenu = -1;

        for (int i = 0; i < menu.length; i++){
            if (menu[i].equalsIgnoreCase(cariMenu)){
                found = true;
                indeksMenu = i;
                break;
            }
        }

        if (found){
            System.out.println("[INFO] Menu \"" + menu[indeksMenu] + "\" tersedia dengan harga Rp " + harga[indeksMenu]);
        } else {
            System.out.println("[INFO] Mohon maaf, menu \"" + cariMenu + "\" tidak tersedia");
        }
        System.out.print("\nmasukkan jumlah item berbeda yang ingin dipesan: ");
        int jumlahPesanan = input.nextInt();
        input.nextLine();

        String [] pemesananNama = new String[jumlahPesanan];
        int [] pesananJumlah = new int[jumlahPesanan];
        int[] pesananSubtotal = new int[jumlahPesanan];
        int totalBiayaKeseluruhan = 0;

        for (int i = 0; i < jumlahPesanan; i++){
            System.out.println("\nPesanan ke-" + (i + 1));
            boolean menuDitemukan = false;
            String namaPesananInput = "";

            while (!menuDitemukan){
                System.out.print("Masukkan nama menu yang dipesan: ");
                namaPesananInput = input.nextLine();

                for (int j = 0; j < menu.length; j++){
                    if(menu[j].equalsIgnoreCase(namaPesananInput)){
                        menuDitemukan = true;
                        namaPesananInput = menu[j];
                        indeksMenu = j;
                        break;
                    }
                }

                if (!menuDitemukan){
                    System.out.println("[PERINGATAN] Menu tidak valid atau tidak terdaftar. Silahkan masukkan ulang!");
                }
            }

            System.out.print("Masukkan jumlah porsi/item untuk menu \"" + namaPesananInput + "\": ");
            int jumlahPorsi = input.nextInt();
            input.nextLine();

            pemesananNama[i] = namaPesananInput;
            pesananJumlah[i] = jumlahPorsi;
            pesananSubtotal[i] = harga[indeksMenu] * jumlahPorsi;
            totalBiayaKeseluruhan += pesananSubtotal[i];
        }
        System.out.println("========================================");
        System.out.println("           RINCIAN PEMESANAN      ");
        System.out.println("========================================");
        System.out.printf("%-18s | %-6s | %-10s\n", "Nama Menu", "Jumlah", "Subtotal");
        System.out.println("----------------------------------------");

        for (int i = 0; i < jumlahPesanan; i++){
            System.out.printf("%-18s | %-6d | Rp %-10d\n", pemesananNama[i], pesananJumlah[i], pesananSubtotal[i]);
        }
        System.out.println("----------------------------------------");
        System.out.println("TOTAL BIAYA KESELURUHAN: Rp " + totalBiayaKeseluruhan);
        System.out.println("========================================");
        System.out.println("Terimakasih atas kunjungan Anda!");

        input.close();
        
    }
    
}
