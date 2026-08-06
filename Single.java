package typesofinheritence;

//Parent class
class Animal {
String name = "Dog";

void sound() {
   System.out.println("Animal makes a sound");
}
}

//Child class
class Puppy extends Animal {

void display() {
   System.out.println("Animal Name: " + name);
}
}

//Main class
public class Single {
public static void main(String[] args) {

   Puppy p = new Puppy();

   p.display();   // Child class method
   p.sound();     // Parent class method
}
}


