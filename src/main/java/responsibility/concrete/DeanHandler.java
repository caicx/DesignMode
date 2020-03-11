package responsibility.concrete;

import responsibility.handler.Handler;
import responsibility.model.Student;

import java.text.MessageFormat;
import java.util.Random;

public class DeanHandler extends Handler {
    public DeanHandler(String name) {
        super(name);
    }
    @Override
    public boolean process(Student student) {
        boolean result = true;
        String msg = "学生{0},请假{1}天，{2}审批结果为:{3}";
        int day = student.getDay();
        if(day < 10 && result) {
            System.out.println(MessageFormat.format(msg, student.getName(), day, this.name, result));
            return true;
        } else if (!result) {
            System.out.println(MessageFormat.format(msg, student.getName(), day, this.name, result));
            return false;
        } else {
            System.out.println(MessageFormat.format(msg, student.getName(), day, this.name, "请假天数过长"));
            return false;
        }
    }
}
