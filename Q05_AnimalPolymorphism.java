// Q5: Class hierarchy for animals demonstrating polymorphism (explicitly requested domain for this question)
public class Q05_AnimalPolymorphism {
    public static void main(String[] args) {
        Animal[] animals = { new Dog("Rex"), new Cat("Whiskers"), new Bird("Tweety") };
        for (Animal a : animals) {
            a.introduce(); // same call site, different sound per actual runtime type
        }
    }
}

abstract class Animal {
    protected String name;

    Animal(String name) {
        this.name = name;
    }

    abstract String makeSound();

    void introduce() {
        System.out.println(name + " says " + makeSound());
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    String makeSound() {
        return "Woof";
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    String makeSound() {
        return "Meow";
    }
}

class Bird extends Animal {
    Bird(String name) {
        super(name);
    }

    String makeSound() {
        return "Tweet";
    }
}
