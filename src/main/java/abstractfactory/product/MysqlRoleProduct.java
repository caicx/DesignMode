package abstractfactory.product;

import abstractfactory.model.Role;

public class MysqlRoleProduct implements IRoleProduct {

    @Override
    public void insert(Role role){
        System.out.println("Mysql数据库操作插入角色");
    }

    @Override
    public void getRole(String id){
        System.out.println("Mysql数据库获取角色id为{id}的数据".replace("{id}", id));
    }
}
