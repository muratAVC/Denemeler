package Dene;

public class Student {
   String name;
   String gender;
   String dateOfBird;
   int age;
   int studentID;
   int grade;
   
   public String toString() {
	   String result="";
	   result="Student name is: "+this.name+
			   " Gender: "+ this.gender+
			   " Date Of Bird: "+this.dateOfBird+
			   " Age: "+this.age+
			   " ID: "+this.studentID+
			   " Grade: "+this.grade;
	   return result;
   }
   
   	
} 
/*
1. create a class named Student that has the followings features:
            Attributes:
                name, gender, dateOfBirth, age, studentID, grade

            Methods:
                sets all the attributes of the student object
                toString(): returns the full info of student Object

2. create a class which is School with main method                

3. create a list of student in School class

4. create a method in School class which is getting list of students 
as parameter the return the list of students if the name start with "A"
*/