package Dene;

import java.util.*;

public class CharFrekans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println(countLetters(in.nextLine()));
	}
	
	public static String countLetters(String str) {
		String result="";
		String firstChar;
		boolean control=true;
		
		do {
			
			
		}while(control);
		
		
		return result;
	}
	
	
	
	
	
	
	
	 public static String countLetters1(String str){
		    String result="",firstChar;
		    boolean control=true;
		    
		    int index=0,count=0;
		    do{
		    	
		      firstChar=str.substring(index,index+1);
		      for(int i=0;i<str.length();i++){
		         if(firstChar.equals(str.substring(i,i+1))){
		           count++;
		           str=str.replaceFirst(str.substring(i,i+1) , "-");
		           index=i+1;
		         } 
		      }
		      System.err.println(index+firstChar+"-----");
		      
		     if(index==str.length()){
		        control=false;
		      }
		      result+=count+firstChar;
		      count=0;
		    }while(control);
		    return result;
		  }


}
