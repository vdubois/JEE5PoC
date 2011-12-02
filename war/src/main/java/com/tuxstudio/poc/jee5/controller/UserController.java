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

		@EJB
		private UserLocal userService;
		
		private DataModel users = null;

		private User userAdd = null;
				
		private User userEdit = null;

		public String index() {
				return "index";
		}
		
		public String show() {
				return "show";
		}

		public String add() {
				userAdd = new User();
				return "add";
		}

		public String create() {
				userService.create(userAdd);
				users.setWrappedData(userService.list());
				return "create";
		}

		public String edit() {
				userEdit = (User) users.getRowData();
				return "edit";
		}
		
		public String update() {
				userService.update(userEdit);
				users.setWrappedData(userService.list());
				return "update";
		}

		public String delete() {
				User user = (User) users.getRowData();
				userService.delete(user);
				users.setWrappedData(userService.list());
				return null;
		}
		
		public DataModel getUsers() {
				if (users == null) {
					users = new ListDataModel();
					users.setWrappedData(userService.list());
				}
				return users;
		}
		
		public User getUserAdd() {
			return userAdd;
		}
		
		public void setUserAdd(User userAdd) {
			this.userAdd = userAdd;
		}

		public User getUserEdit() {
			return userEdit;
		}
		
		public void setUserEdit(User userEdit) {
			this.userEdit = userEdit;
		}
}
