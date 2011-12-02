package com.tuxstudio.poc.jee5.ejb.entity;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

/**
 * Entite User
 * @author Vincent Dubois <dubois.vct@free.fr> 
 */
@Entity
public class User {

	@Id @GeneratedValue
	private Long id;

	private String nom;
	
	private String prenom;
	
	@Column(unique=true)
	private String email;
	
	private transient String password;
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String motDePasse) {
		this.password = motDePasse;
	}
	
	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}
}

