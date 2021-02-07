package School2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Student student = new Student();
        Teacher teacher = new Teacher();
        //Course course = new Course();
        Java java = new Java();
        java.setCourtname("Java");java.setPlace("B111");java.setTeacher("zhang");
        C c =new C();
        c.setCourtname("C语言"); c.setTeacher("zhang");c.setPlace("B204");
        Counselor counselor = new Counselor();

        System.out.println(student.toString());//学生
        System.out.println(teacher.toString());//教师
        System.out.println(java.toString());//课程1
        System.out.println(c.toString());//课程2
        System.out.println(counselor.toString());//辅导员

        System.out.println("========================");
        java.Print();//学生名单
//        System.out.println("========================");
//        c.Print();//学生名单
        System.out.println("========================");
        teacher.Print();
        System.out.println("========================");
        teacher.teach();//教师上课
        counselor.manage();//辅导员管理

    //旷课异常-Java课堂点名
    //抛出
        System.out.println("点名：xiaohong!（到课输入1 旷课输入0）");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        if(k==0) throw new Exception("旷课异常");
        //捕获
        try{  //try catch
            System.out.println("点名：xiaoli!（到课输入1 旷课输入0）");
            k = sc.nextInt();
            k=1/k;
        }catch(ArithmeticException e){
            System.out.println("旷课异常");
        }


}
}
