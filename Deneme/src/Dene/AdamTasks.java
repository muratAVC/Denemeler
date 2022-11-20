package Dene;

import java.util.*;
import java.util.stream.Collectors;

public class AdamTasks {

	public static ArrayList<Integer> three(ArrayList<Integer> arr){
		ArrayList <Integer> result=new ArrayList<>();
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i)%3==0) {
				result.add(arr.get(i));
			}
		}
		return result;
	}
	
	public static ArrayList<Integer> contain(ArrayList<Integer> arr1,ArrayList<Integer> arr2){
		ArrayList <Integer> result=new ArrayList<>();
		
		for(int i=0;i<arr1.size();i++) {
			result.add(arr1.get(i));
		}
		
		for(int i=0;i<arr2.size();i++) {
			result.add(arr2.get(i));
		}
		return result;
	}
	
	public static List<Integer> unique (ArrayList<Integer> arr){
	 List<Integer> result = arr.stream().distinct().collect(Collectors.toList());
	 /*List<Integer> result =new ArrayList<Integer>();
	 for(int i=0;i<arr.size();i++) {
		 result.add(arr.get(i));
	 }*/
		
	return result;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<Integer>();
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		int[] sd= {2,3,4,5,6,8,9};
		int[] ar= {2,4,3,5,6,7,5};
		//arr=(ArrayList<Integer>) Arrays.asList(2,3,4,5,6,8,9);
		for(int i=0;i<sd.length;i++) {
			arr.add(sd[i]);
		}
		for(int i=0;i<ar.length;i++) {
			arr1.add(ar[i]);
		}
		System.err.println("birleşik "+contain(arr,arr1));
		System.out.println("3 bölünen "+three(arr));
		System.out.println("eşsiz "+unique(contain(arr,arr1)));

	}

}
