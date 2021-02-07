package School1.School;

public class Counselor extends Teacher implements Manage {

    @Override
    public void manage() {
        System.out.println("管理学生");
    }
}
