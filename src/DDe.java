public class DDe {
    public static void main(String[] args) {
        int top=0;
        int[] a={2,3,1,4,5,6,7,8,9,0};
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                top=top+a[j];
               // System.out.println(top);
            }
            System.out.println("selam "+top);
            top=0;
        }
    }
}
