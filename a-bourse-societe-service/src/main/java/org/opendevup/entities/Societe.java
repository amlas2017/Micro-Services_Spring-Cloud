package org.opendevup.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;


@Entity
public class Societe implements Serializable {
	@Id
	@GeneratedValue
	private Long Id;
	private String nomSociete;
	
	public Societe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Societe(String nomSociete) {
		super();
		this.nomSociete = nomSociete;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getNomSociete() {
		return nomSociete;
	}
	public void setNomSociete(String nomSociete) {
		this.nomSociete = nomSociete;
	}
	

}
