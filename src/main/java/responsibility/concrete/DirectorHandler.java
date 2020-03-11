package responsibility.concrete;

import responsibility.handler.Handler;
import responsibility.model.Student;

import java.text.MessageFormat;
import java.util.Random;

public class DirectorHandler extends Handler {
    public DirectorHandler(String name) {
        super(name);
    }
    @Override
    public boolean process(Student student) {
        boolean result = true;
        String msg = "学生{0},请假{1}天，{2}审批结果为:{3}";
        int day = student.getDay();
        if(day < 7 && result) {
            System.out.println(MessageFormat.format(msg, student.getName(), day, this.name, result));
            return true;
        } else if (!result) {
            System.out.println(MessageFormat.format(msg, student.getName(), day, this.name, result));
            return false;
        } else {
            System.out.println(MessageFormat.format(msg, student.getName(), day, this.name, "下一级审批"));
            return nextHandler.process(student);
        }
    }
}
