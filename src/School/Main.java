package School;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();
        Course course = new Course();
        Counselor counselor = new Counselor();

        System.out.println(student.toString());
        System.out.println(teacher.toString());
        System.out.println(course.toString());
        System.out.println(counselor.toString());

        System.out.println("========================");

        course.Print();
        System.out.println("========================");
        teacher.Print();
        System.out.println("========================");
        teacher.teach();
        counselor.manage();
    }


}
