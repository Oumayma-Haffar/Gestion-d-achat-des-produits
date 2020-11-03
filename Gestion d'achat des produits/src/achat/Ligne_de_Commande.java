	package achat;
	
	public class Ligne_de_Commande {
	private double Quantite;
	private Produit p;
	public Ligne_de_Commande(Produit p, double quantite) {
		super();
		Quantite = quantite;
		this.p = p;
		
	}
	public double getQuantite() {
		return Quantite;
	}
	public void setQuantite(double quantite) {
		Quantite = quantite;
	}
	public Produit getP() {
		return p;
	}
	public void setP(Produit p) {
		this.p = p;
	}
	
	public double calculerTotal(double Quantite,Produit p) {
		// TODO Auto-generated method stub
		double s ;
		s=Quantite*p.getPrixUnitaire();
		return s;
	}

	
	
	}
