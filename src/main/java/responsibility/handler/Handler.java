package responsibility.handler;

import lombok.Data;
import responsibility.model.Student;

@Data
public abstract class Handler {
    protected String name;
    protected Handler nextHandler;

    public Handler(String name) {
        this.name = name;
    }

    public abstract boolean process(Student student);
}
