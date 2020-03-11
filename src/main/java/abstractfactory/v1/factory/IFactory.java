package abstractfactory.v1.factory;

import abstractfactory.product.IRoleProduct;
import abstractfactory.product.IUserProduct;

public interface IFactory {
    public IUserProduct createUser();

    public IRoleProduct createRole();
}
