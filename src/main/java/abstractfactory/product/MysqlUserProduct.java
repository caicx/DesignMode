package abstractfactory.product;

import abstractfactory.model.User;

public class MysqlUserProduct implements IUserProduct {

    @Override
    public void insert(User user){
        System.out.println("Mysql数据库操作插入用户");
    }

    @Override
    public void getUser(String id){
        System.out.println("Mysql数据库获取用户id为{id}的数据".replace("{id}", id));
    }
}
