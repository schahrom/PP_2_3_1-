package web.dao;


import org.springframework.stereotype.Repository;
import web.model.UserEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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

    @Override
    public UserEntity show(int id) {
        Query query = entityManager.createQuery("from UserEntity where id = : number");
        query.setParameter("number", id);
        return (UserEntity) query.getResultList().get(0);
    }

    @Override
    public void update(int id, UserEntity userEntity) {
        UserEntity userToUpdate = show(id);
        userToUpdate.setId(userEntity.getId());
        userToUpdate.setName(userEntity.getName());
        userToUpdate.setSurname(userEntity.getSurname());
        userToUpdate.setAge(userEntity.getAge());
        save(userToUpdate);
    }

    @Override
    public void delete(int id) {
        entityManager.remove(show(id));
    }
}
