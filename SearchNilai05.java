public class SearchNilai05 {
    public static void main(String[] args){

        int [] nilai = {78, 65, 90, 55, 88, 72};
        int key = 90;
        boolean found = false;

        for (int i = 0; i < nilai.length; i++){
            if (nilai[i] == key){
                found = true;
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                break;
            }
        }
        if (!found){
            System.out.println("Nilai " + key + " tidak ditemukan");
        }
    }
}
