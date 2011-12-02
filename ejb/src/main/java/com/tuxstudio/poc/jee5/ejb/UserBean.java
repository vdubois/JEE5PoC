package com.tuxstudio.poc.jee5.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.tuxstudio.poc.jee5.ejb.entity.User;

/**
 * EJB Stateless pour l'accès aux utilisateurs
 * @author Vincent Dubois <dubois.vct@free.fr>
 */
@Stateless
public class UserBean implements UserLocal
{
		@PersistenceContext(unitName="JPAPersistenceUnit")
		private EntityManager entityManager;

		@Override
		public boolean create(User userToCreate) {
				entityManager.persist(userToCreate);
				return true;
		}

		@Override
		public User read(Long userId) {
				return entityManager.find(User.class, userId);
		}
		
		@Override
		public void update(User user) {
				user = entityManager.merge(user);
		}
		
		@Override
		public void delete(User user) {
				user = entityManager.merge(user); // utile uniquement si l'entity manager est géré par le développeur, non par le conteneur
				entityManager.remove(user);
		}
		
		@SuppressWarnings("unchecked")
    @Override
		public List<User> list() {
				return entityManager.createQuery("select u from User u").getResultList();
		}
}
