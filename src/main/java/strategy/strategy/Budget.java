package strategy.strategy;

import lombok.Data;

@Data
public abstract class Budget {

    private String msg;

    public Budget(String msg) {
        this.msg = msg;
    }

    abstract double budget(double budget);
}
