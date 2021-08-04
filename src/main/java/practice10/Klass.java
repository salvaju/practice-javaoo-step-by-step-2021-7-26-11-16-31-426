package practice10;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class Klass {

    private int number;
    private Student leader;
    private List<Student> members = new ArrayList<>();

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return MessageFormat.format("Class {0}", number);
    }


    public void assignLeader(Student leader) {

        if (members.contains(leader)) {
            this.leader = leader;
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        members.add(student);
    }

}
