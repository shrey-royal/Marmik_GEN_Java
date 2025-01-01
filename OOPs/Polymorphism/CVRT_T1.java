class Sound {
    private String sound;

    public Sound(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}

class DogSound extends Sound {
    public DogSound() {
        super("Bark");
    }
}

class CatSound extends Sound {
    public CatSound() {
        super("Meow");
    }
}

class Animal {
    public Sound makeSound() {
        return new Sound("Generic Animal Sound");
    }
}

class Dog extends Animal {
    @Override
    public DogSound makeSound() {
        return new DogSound();
    }
}

class Cat extends Animal {
    @Override
    public CatSound makeSound() {
        return new CatSound();
    }
}

public class CVRT_T1 {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        System.out.println("Animal: " + genericAnimal.makeSound().getSound());

        Animal dog = new Dog();
        System.out.println("Dog: " + dog.makeSound().getSound());

        Animal cat = new Cat();
        System.out.println("Cat: " + cat.makeSound().getSound());
    }
}
