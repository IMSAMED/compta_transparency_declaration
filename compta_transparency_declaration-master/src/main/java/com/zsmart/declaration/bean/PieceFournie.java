package com.zsmart.declaration.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class PieceFournie implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long id;
	private String nomPiece;
	private int nbrePieceFournie ;
	@ManyToMany
	private Demande demande;
}
