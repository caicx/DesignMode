package abstractfactory.v1;

import abstractfactory.v1.factory.IFactory;
import abstractfactory.v1.factory.MysqlConcreteFactory;
import abstractfactory.v1.factory.OracleConcreteFactory;
import abstractfactory.model.Role;
import abstractfactory.model.User;
import abstractfactory.product.IRoleProduct;
import abstractfactory.product.IUserProduct;

public class Main {
    public static void main(String[] args) {
        // 更改数据源修改这里
        IFactory factory = new MysqlConcreteFactory();
        print(factory);
        factory = new OracleConcreteFactory();
        print(factory);
    }

    private static void print(IFactory factory) {
        IUserProduct user = factory.createUser();
        IRoleProduct role = factory.createRole();
        user.insert(new User());
        user.getUser("1");
        role.insert(new Role());
        role.getRole("1");
    }
}
