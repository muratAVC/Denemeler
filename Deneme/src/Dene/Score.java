package Dene;

import java.util.Arrays;
import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //DO NOT TOUCH THE FOLLOWING LINES
    Scanner input = new Scanner(System.in);
    float[] score = new float[7];
    //WRITE YOUR CODE HERE
    for(int i=0;i<7;i++){
      System.out.print("Enter score for judge "+(i+1)+":");
      score[i]=input.nextFloat();
    }
    float difRat=input.nextFloat();
    Arrays.sort(score);
    float det=0.0f;
    for(int i=1;i<score.length-1;i++){
      det=det*score[i];
    }
    det*=difRat;
    det*=0.6;
    System.out.print("Final Score: "+det);

 
	}

}
