	package achat;
	
	public class Commande {
	private Long id;
	
	public Commande(Long id) {
		super();
		this.id = id;
	}
	
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public void ajoutercmd(Ligne_de_Commande[] ligne, Ligne_de_Commande y, int j) {
	    if (j < ligne.length)
	    {ligne[j]=y;
	    j+=1;
	    }
	    else
	    System.out.println("stock plein");}
	
	 
	
	}
