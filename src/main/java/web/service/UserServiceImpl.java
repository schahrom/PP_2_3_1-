package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.UserEntity;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    @Transactional
    public List<UserEntity> getAllUser() {
        return userDao.getAllUser();
    }


    @Override
    @Transactional
    public void save(UserEntity userEntity) {
        userDao.save(userEntity);
    }
}
