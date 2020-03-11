package abstractfactory.product;

import abstractfactory.model.User;

public interface IUserProduct {
        void insert(User user);
        void getUser(String id);
}
