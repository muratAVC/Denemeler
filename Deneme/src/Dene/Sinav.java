package Dene;

import java.util.*;

class Sinav {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //int[] zzz = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
    int[] zzz= {25, 10, 24, 0, 15, 20, 10, 4};
    //TODO. Write you code below this line. 
      boolean control=true;
      int index=0;
       int cot=0;
      do{
        int arr[] =zzz;
        System.out.println("Day "+index+" "+Arrays.toString(arr));
        index++;
        if(zzz[0]==0) {
        	arr[1]=zzz[1]/2;
        }
        if(zzz[zzz.length-1]==0) {
        	arr[arr.length-2]=zzz[zzz.length-2]/2;
        }
        for (int i = 1; i < zzz.length-1; i++) {
          if(zzz[i]==0) {
        	  arr[i-1]=zzz[i-1]/2;
        	  arr[i+1]=zzz[i+1]/2;
          }
        }
             
        zzz=arr;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            count+=arr[i];
        }
        if(count==0) {
          control=false;
          System.out.println("Day "+index+" "+Arrays.toString(arr));
          System.out.println("---- EXTINCT ----");
        }
        cot++;
        if(cot==23) control=false;
      }while(control);
    
    //---------------------
  }
}                     