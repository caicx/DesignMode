package abstractfactory.v2.factory;

import abstractfactory.product.*;

public class DataAccess {
    private static String db = "mysql";

    public static IUserProduct createUser() {

        IUserProduct result = null;
        if ("mysql".equals(db)) {
            result = new MysqlUserProduct();
        } else if ("oracle".equals(db)) {
            result = new OracleUserProduct();
        }
        return result;
    }

    public static IRoleProduct createRole() {

        IRoleProduct result = null;
        if ("mysql".equals(db)) {
            result = new MysqlRoleProduct();
        } else if ("oracle".equals(db)) {
            result = new OracleRoleProduct();
        }
        return result;
    }
}
