package lessons.lesson_6;

/**
 * Created by Dima on 21.06.2015.
 */
public class Animal implements Pet {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
