package abstractfactory.product;

import abstractfactory.model.Role;

public class OracleRoleProduct implements IRoleProduct {

    @Override
    public void insert(Role role){
        System.out.println("Oracle数据库操作插入用户");
    }

    @Override
    public void getRole(String id){
        System.out.println("Oracle数据库获取用户id为{id}的数据".replace("{id}", id));
    }
}
