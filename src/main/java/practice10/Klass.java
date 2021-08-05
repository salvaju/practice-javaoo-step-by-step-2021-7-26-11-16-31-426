package practice10;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class Klass {

    private int number;
    private Student leader;
    private List<Student> members = new ArrayList<>();
    private List<Teacher> teachers;

    public Klass(int number) {
        this.number = number;
        teachers = new ArrayList<>();
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
            if (teachers != null) {
                teachers.stream()
                        .forEach(teacher -> teacher.notifyAssignLeader(this, leader));
            }
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        members.add(student);
        teachers.stream().forEach(teacher -> teacher.notifyStudentJoined(this, student));
    }

    public void addTeacher(Teacher teacher) {
        if (!teachers.contains(teacher)) {
            teachers.add(teacher);
        }
    }

    public int isIn(Student student) {
        return student.getKlass().getNumber();
    }
}
