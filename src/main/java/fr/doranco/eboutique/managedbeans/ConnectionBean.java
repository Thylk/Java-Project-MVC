package fr.doranco.eboutique.managedbeans;

public abstract class ConnectionBean {

	public static void seConnecter(String login, String password) {
		
		System.out.println("Action se connecter a �t� activ�e.");
		System.out.println("Login : " + login);
		System.out.println("Mot de Passe : " + password);
		
	}
	
}
