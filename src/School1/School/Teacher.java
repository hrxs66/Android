package School1.School;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    public int number = 20212;
    public String name = "zhang";

    public String toString() {
        return "我是" + name + "  我的工号是" + number;
    }

    List<Course> courses = new ArrayList<>();
    public void Print() {
//        Course course1 = new Course();
//        Course course2 = new Course();
        Java java =new Java();
        C c = new C();
        java.Courtname="Java";
        java.teacher="zhang";
        java.place="B111";
        c.Courtname="C语言";
        c.teacher="zhang";
        c.place="B204";
        courses.add(java);
        courses.add(c);
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i));
        }
    }
    public void teach() {
        System.out.println("上课");
    }
}

