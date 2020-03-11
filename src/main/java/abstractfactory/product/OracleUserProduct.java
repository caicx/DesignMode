package abstractfactory.product;

import abstractfactory.model.User;

public class OracleUserProduct implements IUserProduct {

    @Override
    public void insert(User user){
        System.out.println("Oracle数据库操作插入角色");
    }

    @Override
    public void getUser(String id){
        System.out.println("Oracle数据库获取角色id为{id}的数据".replace("{id}", id));
    }
}
