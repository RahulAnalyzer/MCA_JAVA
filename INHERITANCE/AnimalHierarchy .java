class Animal{
   Sting name;
   int age;

   Animal(String name, int age){
    this.name = name;
    this.age = age;
   }

   void makeSound(){
    System.out.println("Animal Make Sound");
   }
}

class Dog extends Animal{
    Dog(String name , int age){
        super(name, age);
    }

    @Override
    void makeSound(){
        System.out.println(name + "Say Woff Woff");
    }
}



public class AnimalHierarchy {
    
}
