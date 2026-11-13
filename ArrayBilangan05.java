import java.util.Arrays;

public class ArrayBilangan05 {
    public static void main(String[] args) {

        int[] bilangan = {5, 13, -7, 17};

        for (int i = 0; i < bilangan.length; i++){
            System.out.println("Bilangan[" + i + "] = " + bilangan[i]);
        }

        for (int nilai : bilangan){
            System.out.println(nilai);
        }

        System.out.println(Arrays.toString(bilangan));
    }     
}
