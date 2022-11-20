package Dene;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Denene {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    int[] inh = {13,12,12,0,8,9,6,8};
     
        //TODO. Write you code below this line. 
       int count=0, index=1;
        boolean control=true;
        System.out.println("Day 0"+Arrays.toString(inh));
        

        while(control){
        if(inh[0]==0){
          inh[1]=inh[1]/2;
        }
        if(inh[inh.length-1]==0){
          inh[inh.length-2]=inh[inh.length]/2;
        }
         
        for(int i=1;i<inh.length-1;i++){
         if(inh[i]==0){
           inh[i-1]=inh[i-1]/2;
           inh[i+1]=inh[i+1]/2;  
           
         }
         
        }
        for(int i = 0;i<inh.length;i++){
          count=count+inh[i];
         
        }
        System.out.println("Day "+ index + Arrays.toString(inh));
        
        if(count==0) {
        	control=false;
        }
        }
        
        System.out.print("---- EXTINCT ----");
        
        //---------------------
  }
}                                        	

