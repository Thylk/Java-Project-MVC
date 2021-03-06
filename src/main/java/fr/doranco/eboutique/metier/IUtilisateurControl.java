package fr.doranco.eboutique.metier;

import fr.doranco.eboutique.entity.Adresse;
import fr.doranco.eboutique.entity.Utilisateur;

public interface IUtilisateurControl {

	Utilisateur getUtilisateurById(Integer id);
	Utilisateur getUtilisateurByLogin(String login);
	Utilisateur getUtilisateurByEmail(String email);
	Utilisateur addUtilisateur(Utilisateur utilisateur);
	Utilisateur updateUtilisateur(Utilisateur utilisateur);
	void seConnecter(String login, String password);
	void seDeconnecter(Integer id);
	void seDesinscrire(Utilisateur utilisateur);

	
}
