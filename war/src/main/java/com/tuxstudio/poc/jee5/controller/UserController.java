package com.tuxstudio.poc.jee5.controller;

//import java.util.List;

import javax.ejb.EJB;

import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import com.tuxstudio.poc.jee5.ejb.entity.User;
import com.tuxstudio.poc.jee5.ejb.UserLocal;

/**
 * Controleur des utilisateur
 * @author Vincent Dubois <dubois.vct@free.fr> 
 */
public class UserController {

    /**
     * Composant metier pour les utilisateurs
     */
	@EJB
	private UserLocal userService;
		
	/**
	 * Contenant JSF pour la liste des utilisateurs
	 */
	private DataModel users = null;

	/**
	 * Utilisateur pour l'ajout
	 */
	private User userAdd = null;
				
	/**
	 * Utilisateur pour la modification
	 */	
	private User userEdit = null;

    /**
     * Acces a la liste des utilisateurs
     * @return le chemin JSF de navigation
     */
	public String index() {
		return "index";
	}

    /**
     * Acces a la fiche de presentation d'un utilisateur
     * @return le chemin JSF de navigation
     */		
	public String show() {
		return "show";
	}

    /**
     * Acces a la page d'ajout d'un utilisateur
     * @return le chemin JSF de navigation
     */
	public String add() {
		userAdd = new User();
		return "add";
	}

    /**
     * Validation de l'ajout d'un utilisateur
     * @return le chemin JSF de navigation
     */
	public String create() {
		userService.create(userAdd);
		users.setWrappedData(userService.list());
		return "create";
	}

    /**
     * Acces a la page de modification d'un utilisateur
     * @return le chemin JSF de navigation
     */
	public String edit() {
		userEdit = (User) users.getRowData();
		return "edit";
	}

    /**
     * Validation de la modification d'un utilisateur
     * @return le chemin JSF de navigation
     */		
	public String update() {
		userService.update(userEdit);
		users.setWrappedData(userService.list());
		return "update";
	}

    /**
     * Suppression d'un utilisateur
     * @return le chemin JSF de navigation
     */
	public String delete() {
		User user = (User) users.getRowData();
		userService.delete(user);
		users.setWrappedData(userService.list());
		return null;
	}
	
	/**
	 * @return les utilisateurs
	 */	
   	public DataModel getUsers() {
		if (users == null) {
			users = new ListDataModel();
			users.setWrappedData(userService.list());
		}
		return users;
	}
		
	/**
	 * @return l'utilisateur en cours d'ajout
	 */
	public User getUserAdd() {
		return userAdd;
	}
		
	/**
	 * Positionnement de l'utilisateur à ajouter
	 * @param userAdd l'utilisateur
	 */
	public void setUserAdd(User userAdd) {
    	this.userAdd = userAdd;
	}

    /**
     * @return l'utilisateur en cours de modification
     */
	public User getUserEdit() {
		return userEdit;
	}
		
	/**
	 * Positionnement de l'utilisateur à modifier
	 * @param userEdit l'utilisateur
	 */
	public void setUserEdit(User userEdit) {
		this.userEdit = userEdit;
	}
}

