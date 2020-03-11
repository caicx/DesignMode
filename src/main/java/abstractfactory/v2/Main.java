package abstractfactory.v2;

import abstractfactory.model.Role;
import abstractfactory.model.User;
import abstractfactory.product.IRoleProduct;
import abstractfactory.product.IUserProduct;
import abstractfactory.v2.factory.DataAccess;

public class Main {
    public static void main(String[] args) {
        IUserProduct user = DataAccess.createUser();
        IRoleProduct role = DataAccess.createRole();
        user.insert(new User());
        user.getUser("1");
        role.insert(new Role());
        role.getRole("1");
    }

}
