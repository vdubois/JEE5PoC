package com.tuxstudio.poc.jee5.ejb;

import java.util.List;

import javax.ejb.Local;

import com.tuxstudio.poc.jee5.ejb.entity.User;

/**
 * Interface locale de l'EJB
 * @author Vincent Dubois <dubois.vct@free.fr>
 */
@Local
public interface UserLocal
{
    boolean create(User userToCreate);

		User read(Long userId);
		
		void update(User user);
		
		void delete(User user);
		
		List<User> list();
}
