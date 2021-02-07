package School;
import java.util.ArrayList;
import java.util.List;

public class Course {
    public String Courtname = "Java", teacher = "zhang", place = "B111";

    List<Student> students = new ArrayList<Student>();

    public void Print() {
        Student student1 = new Student();
        Student student2 = new Student();
        student1.number = 20213;
        student1.name = "xiaohong1";
        student1.college = "数计";
        students.add(student1);
        student2.number = 20214;
        student2.name = "xiaohong2";
        student2.college = "数计";
        students.add(student2);
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }

    public String toString() {
        return "课程：" + Courtname + ",  上课老师：" + teacher + ",  上课教室：" + place;
    }
}
