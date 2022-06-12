package oops;

import java.util.*;

class College{
    String name;
    private List<Teacher> teacher;
    public College(String name, List<Teacher> teacher){
        this.name= name;
        this.teacher=teacher;
    }
    public List<Teacher> getTeacher(){
        return teacher;
    }
}

class  Teacher{
    String name;
    String subject;
    public Teacher(String name, String subject){
        this.name=name;
        this.subject=subject;
    }

    @Override
    public String toString(){
        return "[Teacher: "+name+", Subject: "+subject+"]";
    }
}

public class AggegationDemo {
    public static void main(String[] args) {
        List<Teacher> teachers = new ArrayList<Teacher>();
        teachers.add(new Teacher("Rohn", "Java"));
        teachers.add(new Teacher("Ron", "C"));

        College college = new College("MyCollege", teachers);
    }
}
