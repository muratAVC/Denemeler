package Dene;
import java.util.*;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> std=new ArrayList<Student>();
		
		boolean cont=true;
		Scanner in=new Scanner(System.in);
		do {
			Student input=new Student();
			System.out.print("Enter A New Sudent information");
			System.out.print("\nEnter the Student Name: ");
			input.name=in.nextLine();
			System.out.print("\nEnter the Student Gender (M or F): ");
			input.gender=in.nextLine();
			System.out.print("\nEnter the Student Date Of Bird(M/D/Y): ");
			input.dateOfBird=in.nextLine();
			System.out.print("\nEnter the Student Age: ");
			input.age=in.nextInt();
			System.out.print("\nEnter the Student ID: ");
			input.studentID=in.nextInt();
			System.out.print("\nEnter the Student Grade: ");
			input.grade=in.nextInt();
			std.add(input);
			in.nextLine();
			System.out.println("do yuo want to continue (Y or N)");
			String answer=in.nextLine();
			if(answer.equals("N")) {
				cont=false;
			}
		}while(cont);
		System.out.println("---------------");
		for(int i=0;i<std.size();i++) {
			System.out.println(std.get(i));
		}
	
		System.out.println("---------------");
		System.out.println("---------------");
		
		ArrayList<Student> ar1=new ArrayList<>();
		ar1=list(std, "A");
		for(int i=0;i<ar1.size();i++) {
			
		 System.out.println(ar1.get(i));
		}
		System.out.println("---------------");
	}

	public static ArrayList<Student> list(ArrayList<Student> lst,String a){
		ArrayList<Student> result=new ArrayList<Student>();
		for(int i=0;i<lst.size();i++) {
			if(lst.get(i).name.charAt(0)==a.charAt(0)) {
				result.add(lst.get(i));
			}
		}
		
		return result;
	}
	
}
