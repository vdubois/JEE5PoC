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
    /**
     * Methode de creation d'un utilisateur
     * @param userToCreate l'utilisateur a creer
     */
    void create(User userToCreate);

    /**
     * Methode de lecture d'un utilisateur
     * @param userId l'identifiant de l'utilisateur a lire
     * @return l'utilisateur lu
     */
	User read(Long userId);
	
	/**
	 * Methode de mise a jour d'un utilisateur
	 * @param user l'utilisateur a mettre a jour
	 */
	void update(User user);

    /**
     * Methode de suppression d'un utilisateur
     * @param user l'utilisateur a supprimer
     */		
	void delete(User user);

    /**
     * Methode de lecture de l'ensemble des utilisateurs
     * @return la liste des utilisateurs
     */		
	List<User> list();
}

