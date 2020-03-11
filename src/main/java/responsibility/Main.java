package responsibility;

import responsibility.concrete.DeanHandler;
import responsibility.concrete.DirectorHandler;
import responsibility.concrete.TeacherHandler;
import responsibility.handler.Handler;
import responsibility.model.Student;

public class Main {
    public static void main(String[] args) {
        Handler teacher = new TeacherHandler("导员");
        Handler director = new DirectorHandler("系主任");
        Handler dean = new DeanHandler("院长");
        teacher.setNextHandler(director);
        director.setNextHandler(dean);

        for (int i = 0; i < 10; i ++) {
            Student student = new Student();
            student.setName("学生" + i);
            student.setDay(i + 1);
            teacher.process(student);
            System.out.println("-------------------------");
        }
    }
}
