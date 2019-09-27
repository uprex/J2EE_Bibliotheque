package fr.cesi.bibliotheque.classe;

public class Livres {
	
	Long id;
	String titre;
	String auteur;
	Boolean etat;
	
	
	
	public Livres(Long _id, String _titre, String _auteur, Boolean _etat) {
		// TODO Auto-generated constructor stub
		
		this.id = _id;
		this.titre = _titre;
		this.auteur = _auteur;
		this.etat = _etat;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getTitre() {
		return titre;
	}



	public void setTitre(String titre) {
		this.titre = titre;
	}



	public String getAuteur() {
		return auteur;
	}



	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}



	public Boolean getEtat() {
		return etat;
	}



	public void setEtat(Boolean etat) {
		this.etat = etat;
	}

	@Override
	public String toString() {
		return "Livres [id=" + id + ", titre=" + titre + ", auteur=" + auteur + ", etat=" + etat + "]";
	}

}
