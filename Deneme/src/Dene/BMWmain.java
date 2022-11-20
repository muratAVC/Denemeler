package Dene;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class BMWmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		List<BMWclass> BMW=new ArrayList<BMWclass>();
		
		boolean cont=true;
		do {
			BMWclass list=new BMWclass();
			System.out.println("Enter the Brand information");
			list.brand=in.nextLine();
			System.out.println("Enter the model information");
			list.model=in.nextLine();
			System.out.println("Enter the color information");
			list.color=in.nextLine();
			System.out.println("Enter the price information");
			list.price=in.nextDouble();
			System.out.println("Enter the milage information");
			list.milage=in.nextDouble();
			System.out.println("Enter the model year information");
			list.year=in.nextInt();
			System.out.println("Enter the Local Date information");
			list.localDate=in.nextLine();
			BMW.add(list);
			System.out.println("do you want to contunie(Y or N)");
			String answer=in.nextLine();
			if(answer.charAt(0)=='N') {
				cont=false;
			}
			
		}while(cont);
		
		List<BMWclass> resultList=new ArrayList<BMWclass>();
		
		
		
		

	}

	public List<BMWclass> getlist(ArrayList<BMWclass> list,int modelYear){
		List<BMWclass> result=new ArrayList<BMWclass>();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).year<modelYear) {
				result.add(list.get(i));
			}
		}
		return result;
	}
	public List<BMWclass> getlist(ArrayList<BMWclass> list,int modelYear,String model){
		List<BMWclass> result=new ArrayList<BMWclass>();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).year<modelYear && list.get(i).equals(model)) {
				result.add(list.get(i));
			}
		}
		return result;
	}
	
}
