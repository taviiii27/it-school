package session17_18;


abstract class Animal {
    abstract void cats();
    abstract void dogs();
}

class Cat extends Animal {
    @Override
    void cats() {
        System.out.println("Cats meow");
    }

    @Override
    void dogs() {
    }
}

class Dog extends Animal {
    @Override
    void cats() {
    }

    @Override
    void dogs() {
        System.out.println("Dogs bark");
    }
}

class TestAnimal {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        cat.cats();
        dog.dogs();
    }
}

