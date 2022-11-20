import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = input.nextInt();
        }

        int sum, count = 0;
        for (int i=0; i< arr.length; i++) {
            sum = 0;
            for(int j=i;j<arr.length;j++)
            {
                sum = arr[j] + sum;
                if(sum<0){
                    count++;
                }
            }
        }

        System.out.println(count);
/*
                            1	-2	4	-5	1

                                -2	4	-5	1

                                    4	-5	1

                                        -5	1

                                            1

 */

    }
}
