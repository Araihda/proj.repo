public class MainAni {
   public static void main (String[] args){
    Animal animal = new Animal("Lion", 5);
    System.out.println("Animal name: " + animal.getName()+ "\n Animal age: " + animal.getAge());

    Animal animal1 = new Animal("Tiger", 6);
    System.out.println("Animal age: " + animal1.getAge() + "\n Animal name: " + animal1.getName());

    Dog dog = new Dog("Dog", 7, "Bulldog");
    System.out.println("Dog breed: " + dog.getBreed() + "\n Dog name: " + dog.getName() + "\n Dog age: " + dog.getAge());

    Dog dog1 = new Dog("Dog", 8, "Pitbull");
    System.out.println("Dog name: " + dog1.getName() + "\n Dog age: " + dog1.getAge() + "\n Dog breed: " + dog1.getBreed());

   }
}
