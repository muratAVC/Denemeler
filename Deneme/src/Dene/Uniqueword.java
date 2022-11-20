package Dene;

import java.util.Arrays;
import java.util.Scanner;

public class Uniqueword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
    //DO NOT TOUCH BELOW:
    Scanner input = new Scanner(System.in);
    int[] nums = {2,3,4,2,3,5,6,1,4};
    
    //WRITE YOUR CODE BELOW:
    boolean control=false;
    String asd[]=new String[nums.length];
    for(int i=0;i<nums.length;i++){
      for(int j=0;j<nums.length;j++){
        if (i!=j && nums[i]==nums[j]){
          control=true;
        }
      }
      if (control) {
        asd[i]="--";
      }else{
        asd[i]=nums[i]+"";
      }
      control=false;
    }
  
    
    for(int i=0;i<asd.length;i++){
      if(!asd[i].equals("--")){
        System.out.println(asd[i]);
        break;
      }
    }



 
		 
	}

}
