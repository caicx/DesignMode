package abstractfactory.v3.factory;

import abstractfactory.product.*;

public class DataAccess {
    private static String db = "Oracle";
    private static String packagename = "abstractfactory.product";

    public static IUserProduct createUser() throws Exception {
        String className = packagename + "." + db + "UserProduct";
        return (IUserProduct) Class.forName(className).newInstance();
    }

    public static IRoleProduct createRole() throws Exception {
        String className = packagename + "." + db + "RoleProduct";
        return (IRoleProduct) Class.forName(className).newInstance();
    }
}
