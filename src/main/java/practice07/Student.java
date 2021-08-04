package practice07;


import java.text.MessageFormat;

public class Student extends Person{

    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {

        if (this.equals(klass.getLeader())) {
            return MessageFormat.format("{0} I am a Student. I am Leader of Class {1}.", super.introduce(), klass.getNumber());
        } else {
            return MessageFormat.format("{0} I am a Student. I am at Class {1}.", super.introduce(), klass.getNumber());
        }

    }
}
