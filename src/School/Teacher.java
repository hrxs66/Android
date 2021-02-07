package School;
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
        Course course1 = new Course();
        Course course2 = new Course();
        course1.Courtname="Java";
        course1.teacher="zhang";
        course1.place="B111";
        course2.Courtname="Android";
        course2.teacher="zhang";
        course2.place="B204";
        courses.add(course1);
        courses.add(course2);
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i));
        }
    }
    public void teach() {
        System.out.println("上课");
    }
}

