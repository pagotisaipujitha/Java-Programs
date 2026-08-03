package typesofinheritence;

//Grandparent class
class Person {

 void displayName() {
     System.out.println("Name: Pavan");
 }
}

//Parent class
class Student extends Person {

 void displayRollNo() {
     System.out.println("Roll No: 37");
 }
}

//Child class
class CollegeStudent extends Student {

 void displayBranch() {
     System.out.println("Branch: CSM");
 }
}

//Main class
public class Multilevel {

 public static void main(String[] args) {

     CollegeStudent obj = new CollegeStudent();

     obj.displayName();      // Method from Person class
     obj.displayRollNo();    // Method from Student class
     obj.displayBranch();    // Method from CollegeStudent class
 }
}
    

