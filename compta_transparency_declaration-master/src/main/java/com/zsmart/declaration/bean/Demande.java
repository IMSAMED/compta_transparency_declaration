package com.zsmart.declaration.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Demande implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long id;
	private String demandeur;
	private String nomDemande;
	private double fraisTotal;
	@OneToMany(mappedBy = "demande")
	private List<Piece> pieceExiges;
	@OneToMany(mappedBy = "demande")
	private List<PieceFournie> pieceFournie;
	@OneToOne
	private DetailFrais detailFrais;
	private String remarques;

}
