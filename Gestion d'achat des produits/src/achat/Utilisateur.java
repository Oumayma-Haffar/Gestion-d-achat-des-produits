		package achat;
		
		public class Utilisateur extends Personne {
		
		
		
		public Utilisateur( Long Id,String Prenom,String Nom ,String Email, String Mot_de_passe) {
			super(Id, Prenom, Nom, Email, Mot_de_passe);
			
		}
		
		
		
		
		
		public void ajouter_Utilisateur(Utilisateur[] utilisateurs,Utilisateur user,int nbUtilisateurs )
		{
		if (nbUtilisateurs<utilisateurs.length)
		{utilisateurs[nbUtilisateurs]=user;
		nbUtilisateurs+=1;
		}
		else
		System.out.println("le tableau utilisateur est plein");
		}
		
		
		
		public void supprimer_Utilisateur(Utilisateur[] utilisateurs,int n)
		{
		utilisateurs[n]=null;
		}

		public void afficherUtilisateur (Utilisateur[] utilisateurs,int user )
		{
			for (int i=0;i< user;i++)
			{
				System.out.println("L'utilisateur n"+i+" son Nom est"+utilisateurs[i].getNom() +" son Prénom est"+ utilisateurs[i].getPrenom());
	        }
		}
		
		
		
		}
