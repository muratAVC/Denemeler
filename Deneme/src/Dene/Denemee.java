package Dene;

import java.util.*;

public class Denemee {

public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in = new Scanner(System.in);
		System.out.println(uniqueChars(in.next()));
  }
  
  public static String uniqueChars(String str) {
    //TODO: write your code
    String result="";
    for(int i=0;i<str.length();i++){
      for(int j=i+1;j<str.length();j++){
        if(!(str.charAt(i)==(str.charAt(j))))
		  {
		    result+=str.charAt(i);
		  }
      }
    }



   return result; 


 }

}
