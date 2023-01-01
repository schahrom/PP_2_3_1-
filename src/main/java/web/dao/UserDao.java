package web.dao;

import web.model.UserEntity;

import java.util.List;

public interface UserDao {

    List<UserEntity> getAllUser();

    void save(UserEntity userEntity);
}
