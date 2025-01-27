package practice06;

import java.text.MessageFormat;

public class Teacher extends Person{

    private Klass klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce(){

        if (klass != null) {
            return MessageFormat.format("{0} I am a Teacher. I teach {1}.", super.introduce(), klass.getDisplayName());
        } else {
            return MessageFormat.format("{0} I am a Teacher. I teach No Class.", super.introduce());
        }

    }

    public String introduceWith(Student student) {

        if (klass.getNumber() == student.getKlass().getNumber()) {
            return MessageFormat.format("{0} I am a Teacher. I teach {1}.", super.introduce(), student.getName());
        } else {
            return super.introduce()+ " I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }
}
