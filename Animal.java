/*Create a class called Animal with attributes name (String) and age (int). 
Implement proper encapsulation (private attributes, public getters). 
Then, create a subclass called Dog that inherits from Animal and adds a breed (String) attribute.
 Create objects of both classes and demonstrate how to access their attributes. */

 public class Animal{
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
 }