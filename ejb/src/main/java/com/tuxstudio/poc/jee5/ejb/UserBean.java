package com.tuxstudio.poc.jee5.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.tuxstudio.poc.jee5.ejb.entity.User;

/**
 * EJB Stateless pour l'acces aux utilisateurs
 * @author Vincent Dubois <dubois.vct@free.fr>
 */
@Stateless
public class UserBean implements UserLocal
{
		@PersistenceContext(unitName="JPAPersistenceUnit")
		private EntityManager entityManager;

		@Override
		public void create(User userToCreate) {
			entityManager.persist(userToCreate);
		}

		@Override
		public User read(Long userId) {
			return entityManager.find(User.class, userId);
		}
		
		@Override
		public void update(User user) {
			entityManager.merge(user);
		}
		
		@Override
		public void delete(User user) {
			User userToDelete = entityManager.merge(user); // utile uniquement si l'entity manager est gere par le developpeur, non par le conteneur
			entityManager.remove(userToDelete);
		}
		
		@SuppressWarnings("unchecked")
        @Override
		public List<User> list() {
			return entityManager.createQuery("select u from User u").getResultList();
		}
}
