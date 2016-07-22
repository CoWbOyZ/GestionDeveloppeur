
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
	public static ArrayList<Developpeur> listDeveloppeurs = new ArrayList<Developpeur>();
	public Developpeur developpeur;

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
		
		developpeur = new Developpeur();
		developpeur.setIdentifiant(identifiant);
		developpeur.setPseudo(pseudo);
		developpeur.setMail(mail);
		developpeur.setCodePostal(codePostal);
		developpeur.setDateInscription(dateInscription);
		
		if(this.pseudo.equals("")) {
			System.out.println("le champ identifiant ne doit pas être vide...");
			return "input";
		}		
		
		listDeveloppeurs.add(developpeur);
		System.out.println( developpeur );
		System.out.println("Success.........");
		return "success";
	}

	public String lister(){
		System.out.println("dans la méthode lister().....");
		System.out.println( developpeur );
		System.out.println( listDeveloppeurs );
		//developpeur.setIdentifiant( 50 );
		
		return "success";
	}

	public String supprimer(){
		System.out.println("dans la méthode supprimer().....");
		//listDeveloppeurs.removeAll(getListDeveloppeurs());
		return "success";
	}
	public ArrayList<Developpeur> getListDeveloppeurs() {
		return listDeveloppeurs;
	}
	public void setListDeveloppeurs(ArrayList<Developpeur> listDeveloppeurs) {
		DeveloppeurAction.listDeveloppeurs = listDeveloppeurs;
	}

	public Developpeur getDeveloppeur() {
		return developpeur;
	}
	public void setDeveloppeur(Developpeur developpeur) {
		this.developpeur = developpeur;
	}

}