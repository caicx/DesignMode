package abstractfactory.v1.factory;

import abstractfactory.product.IRoleProduct;
import abstractfactory.product.IUserProduct;
import abstractfactory.product.MysqlRoleProduct;
import abstractfactory.product.MysqlUserProduct;

public class MysqlConcreteFactory implements IFactory {
    @Override
    public IUserProduct createUser() {
        return new MysqlUserProduct();
    }

    @Override
    public IRoleProduct createRole() {
        return new MysqlRoleProduct();
    }
}
