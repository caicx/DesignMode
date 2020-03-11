package abstractfactory.product;

import abstractfactory.model.Role;

public interface IRoleProduct {
    public void insert(Role role);

    public void getRole(String id);
}
