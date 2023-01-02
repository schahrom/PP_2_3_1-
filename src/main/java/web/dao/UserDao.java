package web.dao;

import web.model.UserEntity;

import java.util.List;

public interface UserDao {

    List<UserEntity> getAllUser();

    void save(UserEntity userEntity);

    UserEntity show(int id);

    void update(int id, UserEntity userEntity);

    void delete(int id);
}
