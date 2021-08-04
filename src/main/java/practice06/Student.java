package practice06;

import java.text.MessageFormat;

public class Student extends Person{

    private Klass klass;

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return MessageFormat.format("{0} I am a Student. I am at Class {1}.", super.introduce(), klass.getNumber());
    }
}
