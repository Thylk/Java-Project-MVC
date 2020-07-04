package fr.doranco.eboutique.entity;

public enum Categorie {

	ELECTRONIQUE ("Electronique"),
	TELEPHONIE ("T�l�phonie"),
	DECORATIONS ("D�corations");
	
	private String categorie;

	Categorie(String categorie) {
		this.categorie = categorie;
	}
	
	public String getCategorie() {
		return categorie;
	}
	
}
