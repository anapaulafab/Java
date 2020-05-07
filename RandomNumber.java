
import java.util.Random;


public class RandomNumber {
        public static void main(String[] args) {

        int[] n = new int[10];
        int maior = 0;

        Random r = new Random();

        for (int i = 0; i < n.length; i++) {
            n[i] = r.nextInt(100);
        }

        for (int i = 0; i < n.length; i++) {
            if(n[i] > maior){
                maior=n[i];
            }

        }
        System.out.println("O numero maior é:"+maior);

}
}
