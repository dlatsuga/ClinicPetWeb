package lessons.lesson_6;

/**
 * Created by Dima on 21.06.2015.
 */
public class Dog implements Pet {
    private final Animal animal;

    public Dog(Animal animal) {
        this.animal = animal;
    }

    public String getName() {
        return this.animal.getName();
    }
}
