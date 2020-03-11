package abstractfactory.v1.factory;

import abstractfactory.product.IRoleProduct;
import abstractfactory.product.IUserProduct;
import abstractfactory.product.OracleRoleProduct;
import abstractfactory.product.OracleUserProduct;

public class OracleConcreteFactory implements IFactory {
    @Override
    public IUserProduct createUser() {
        return new OracleUserProduct();
    }

    @Override
    public IRoleProduct createRole() {
        return new OracleRoleProduct();
    }
}
