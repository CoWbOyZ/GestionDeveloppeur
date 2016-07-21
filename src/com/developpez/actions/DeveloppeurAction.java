
package com.developpez.actions;

import java.util.ArrayList;

import com.developpez.beans.Developpeur;
import com.opensymphony.xwork2.ActionSupport;

public class DeveloppeurAction extends ActionSupport{


	private static final long serialVersionUID = 1L;

	private int identifiant;
	private String pseudo;
	private String mail;
	private String codePostal;
	private java.util.Date dateInscription;
	private ArrayList<Developpeur> listDeveloppeurs = new ArrayList<>(10);

	public int getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}


	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getCodePostal(){
		return codePostal;
	}

	public void setCodePostal(String codePostal){
		this.codePostal=codePostal;
	}
	public java.util.Date getDateInscription() {
		return dateInscription;
	}


	public void setDateInscription(java.util.Date dateInscription) {
		this.dateInscription = dateInscription;
	}

	public String enregistrer() {
		System.out.println("Dans la méthode enregistrer...");

		Developpeur developpeur = new Developpeur ();
		developpeur.setIdentifiant(identifiant);
		developpeur.setPseudo(pseudo);
		developpeur.setMail(mail);
		developpeur.setCodePostal(codePostal);
		developpeur.setDateInscription(dateInscription);
		
		listDeveloppeurs.add(developpeur);
		
		if(this.pseudo.equals("")) {
			System.out.println("le champ identifiant ne doit pas être vide...");
			return "input";
		}
		System.out.println("Success........."); 
		return "success";
	}

	public String lister(){
		System.out.println("dans la méthode lister().....");
		
		return "success";
	}

	public String supprimer(){
		System.out.println("dans la méthode supprimer().....");
		//listDeveloppeurs.removeAll(getListDeveloppeurs());
		return "success";
	}

}