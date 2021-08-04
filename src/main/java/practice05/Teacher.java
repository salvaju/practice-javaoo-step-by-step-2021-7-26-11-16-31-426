package practice05;

import java.text.MessageFormat;

public class Teacher extends Person{

    private Integer klass;

    public Teacher(String name, int age, Integer klass) {
        super(name, age);
        this.klass = klass;
    }

    public Integer getKlass() {
        return klass;
    }

    @Override
    public String introduce(){
        return MessageFormat.format("My name is {0}. I am {1} years old. I am a Teacher. I teach Class {2}.", getName(), getAge(), klass);
    }
}
