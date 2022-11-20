import java.util.Arrays;

public class denemeler {
    public static void main(String[] args) {
        int[] liste = {15, 1, 99, 7, 7, -22, 11, 2, -49, 52};

        //Arrays.fill(liste, 2);
        System.out.println(Arrays.toString(liste));

        int[] liste2 = {15, 1, 99, 5, 9, -22, 11, 2, -49, 52};

        Arrays.fill(liste2, 5, 7, 7);
        System.out.println(Arrays.toString(liste2));

        for (int a: liste) {
            System.out.print(a+" ");
        }
    }
}
