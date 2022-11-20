package Dene;

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
		System.out.println(coverString(in.nextLine(), in.nextLine()));
  }
  
  public static String coverString(String main, String coverMe) {
    // your code here
    int a=coverMe.length();
    boolean control=true;
    String result="";
    int i=0;
    int index=main.indexOf(coverMe, 0);
    if(index!=-1) {
    do {
    	index=main.indexOf(coverMe, i);
    	result=main.substring(i,index);
    	result+="["+coverMe+"]";
    	i=index+a;
    	main=main.substring(i);
    	i=0;
    	if(main.length()<=coverMe.length()) control=false;
    	
    	//sela mlarla
    	//se[la]m[la]r[la]
    }while ( control);
	}else{
      result="["+main+"]";
    }

  return result;
  }
  
}
