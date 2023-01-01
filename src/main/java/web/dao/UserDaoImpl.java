package web.dao;


import org.springframework.stereotype.Repository;
import web.model.UserEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<UserEntity> getAllUser() {
        return entityManager.createQuery("select u from UserEntity u", UserEntity.class)
                .getResultList();
    }

    @Override
    public void save(UserEntity userEntity) {
        entityManager.persist(userEntity);
    }
}
