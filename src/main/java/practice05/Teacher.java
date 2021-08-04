package practice05;

import java.text.MessageFormat;

public class Teacher extends Person{

    private Integer klass;

    public Teacher(String name, int age, Integer klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
        this.klass = klass;
    }

    public Integer getKlass() {
        return klass;
    }

    @Override
    public String introduce(){

        if (klass != null) {
            return MessageFormat.format("{0} I am a Teacher. I teach Class {1}.", super.introduce(), klass);
        } else {
            return MessageFormat.format("{0} I am a Teacher. I teach No Class.", super.introduce());
        }

    }
}
