	package achat;
	
	public class Produit {
		private int Id;
		private String Nom;
		private double PrixUnitaire;
		private int QuantiteStock;
		public Produit(int id, String nom, double prixUnitaire, int quantiteStock) {
			super();
			Id = id;
			Nom = nom;
			PrixUnitaire = prixUnitaire;
			QuantiteStock = quantiteStock;
		}
		public int getId() {
			return Id;
		}
		public void setId(int id) {
			Id = id;
		}
		public String getNom() {
			return Nom;
		}
		public void setNom(String nom) {
			Nom = nom;
		}
		public double getPrixUnitaire() {
			return PrixUnitaire;
		}
		public void setPrixUnitaire(double prixUnitaire) {
			PrixUnitaire = prixUnitaire;
		}
		public int getQuantiteStock() {
			return QuantiteStock;
		}
		public void setQuantiteStock(int quantiteStock) {
			QuantiteStock = quantiteStock;
		}
		
		public void ajouterProduit(Produit[] produits,Produit p,int nbProduit )
		{
		if (nbProduit<produits.length)
		{produits[nbProduit]=p;
		nbProduit+=1;
		}
		else
		System.out.println("le tableau est plein");
		}
		
		public void supprimerProduit(Produit[] produits,int x)
		{
		produits[x]=null;
		}
		public void afficherProduit (Produit[] produits,int nbProduit )
		{
			for (int i=0;i< nbProduit;i++)
			{
				System.out.println("L'article n"+i+" son Nom est"+produits[i].Nom+" son Prix est"+produits[i].PrixUnitaire);
	        }
		}
		
	
	}
