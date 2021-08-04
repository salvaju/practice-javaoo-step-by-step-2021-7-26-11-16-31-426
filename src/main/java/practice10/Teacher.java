package practice10;

import java.text.MessageFormat;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Teacher extends Person{

    private LinkedList<Klass> classes;

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    @Override
    public String introduce(){

        if (classes != null) {
            String joinedClasses = classes.stream()
                    .map(Klass::getNumber)
                    .map(Object::toString)
                    .collect(Collectors.joining(", "));

            return MessageFormat.format("{0} I am a Teacher. I teach Class {1}.", super.introduce(), joinedClasses);
        } else {
            return MessageFormat.format("{0} I am a Teacher. I teach No Class.", super.introduce());
        }

    }


}
