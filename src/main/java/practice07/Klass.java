package practice07;

import java.text.MessageFormat;

public class Klass {

    private int number;
    private Student student;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return MessageFormat.format("Class {0}", number);
    }

    public void assignLeader(Student student) {
        this.student = student;
    }

    public Student getLeader() {
        return student;
    }
}
