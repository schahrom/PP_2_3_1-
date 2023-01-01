package web.service;

import web.model.UserEntity;

import java.util.List;

public interface UserService {

    List<UserEntity> getAllUser();

    void save(UserEntity userEntity);
}
