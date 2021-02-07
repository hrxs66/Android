package School1.School;

import java.util.ArrayList;
import java.util.List;

public abstract class Course {
    protected String Courtname , teacher , place ;

    List<Student> students = new ArrayList<Student>();

    public void Print() {
        Student student1 = new Student();
        Student student2 = new Student();
        student1.number = 20213;
        student1.name = "xiaohong1";
        student1.college = "数计";
        students.add(student1);
        student2.number = 20214;
        student2.name = "xiaoli";
        student2.college = "数计";
        students.add(student2);
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }

    public abstract  String toString();
    //{
       // return "课程：" + Courtname + ",  上课老师：" + teacher + ",  上课教室：" + place;
    //};


    public Course(String courtname, String teacher, String place, List<Student> students) {
        Courtname = courtname;
        this.teacher = teacher;
        this.place = place;
        this.students = students;
    }

    public Course() {
    }

    public String getCourtname() {
        return Courtname;
    }

    public void setCourtname(String courtname) {
        Courtname = courtname;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
