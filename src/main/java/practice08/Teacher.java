package practice08;


import java.text.MessageFormat;

public class Teacher extends Person{

    private Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
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

}
