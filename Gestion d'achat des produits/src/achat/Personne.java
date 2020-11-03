		package achat;
		
		public class Personne {
		private Long Id ;
		private String Prenom ;
		private String Nom ;
		private String Email;
		private String Mot_de_passe;
		public Personne(Long id, String prenom, String nom, String email, String mot_de_passe) {
			super();
			Id = id;
			Prenom = prenom;
			Nom = nom;
			Email = email;
			Mot_de_passe = mot_de_passe;
		}
		public Long getId() {
			return Id;
		}
		public void setId(Long id) {
			Id = id;
		}
		public String getPrenom() {
			return Prenom;
		}
		public void setPrenom(String prenom) {
			Prenom = prenom;
		}
		public String getNom() {
			return Nom;
		}
		public void setNom(String nom) {
			Nom = nom;
		}
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		public String getMot_de_passe() {
			return Mot_de_passe;
		}
		public void setMot_de_passe(String mot_de_passe) {
			Mot_de_passe = mot_de_passe;
		}
		
		}
