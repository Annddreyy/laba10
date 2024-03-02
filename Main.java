class Animal{
    String food;
    String location;

    Animal(String food, String location){
        this.food = food;
        this.location = location;
    }

    void makeNoise(){
        System.out.println("Животное говорит");
    }

    void eat(){
        System.out.println("Животное ест");
    }

    void sleep(){
        System.out.println("Животное спит");
    }
}

class Dog extends Animal{
    Dog(String food, String location){
        super(food, location);
    }

    @Override
    void makeNoise(){
        System.out.println("Собака говорит");
    }

    @Override
    void eat(){
        System.out.println("Собака ест");
    }

    @Override
    void sleep(){
        System.out.println("Собака спит");
    }
}

class Cat extends Animal{
    Cat(String food, String location){
        super(food, location);
    }

    @Override
    void makeNoise(){
        System.out.println("Кошка говорит");
    }

    @Override
    void eat(){
        System.out.println("Кошка ест");
    }

    @Override
    void sleep(){
        System.out.println("кошка спит");
    }
}

class Horse extends Animal{
    Horse(String food, String location){
        super(food, location);
    }

    @Override
    void makeNoise(){
        System.out.println("Лошадь говорит");
    }

    @Override
    void eat(){
        System.out.println("Лошадь ест");
    }

    @Override
    void sleep(){
        System.out.println("Лошадь спит");
    }
}

class Veterinar{
    public void display(Animal animal){
        System.out.println(animal.food);
        System.out.println(animal.location);
    }
}

public class Main {
    public static void main(String[] args){
        Cat cat = new Cat("Food 1", "Location 1");
        Dog dog = new Dog("Food 2", "Location 2");
        Horse horse = new Horse("Food 3", "Location 3");

        Veterinar veterinar = new Veterinar();

        veterinar.display(cat);
        veterinar.display(dog);
        veterinar.display(horse);
    }
}