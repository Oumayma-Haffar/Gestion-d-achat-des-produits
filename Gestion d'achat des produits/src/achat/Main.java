package achat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Utilisateur users[]= new Utilisateur[20];
        Produit produits[]= new Produit[20];	  
        Commande commande= new Commande(null);
        Commande commandes[]= new Commande[20];
        Ligne_de_Commande ligne[]= new Ligne_de_Commande[100];
        Utilisateur user = null;
        Produit p = null;
        int nbUser=0;
        int nbProduit= 0;
      //----------Menu à afficher----------
        Administrateur admin= new Administrateur ((long) 1,"Oumayma","Haffar", "oumayma23@gmail.com", "123456789");
        System.out.println("Bienvenue ! ");
        System.out.println("1: Ajouter produit ");
        System.out.println("2: Ajouter user ");
        System.out.println("3: Quitter ");
        
        
        Scanner sc = new Scanner( System.in );
        int a = sc.nextInt();
             int c=0;
             if(a==1) 
             {
             do
             {System.out.println("donner l'id du produit ");
                Scanner sc1 = new Scanner( System.in );
                int s   = sc1.nextInt();
                System.out.println("donner le Nom du produit ");
                Scanner sc2 = new Scanner( System.in );
                String t   = sc2.nextLine();
                System.out.println("donner le prix du produit ");
                Scanner sc3 = new Scanner( System.in );
                double b   = sc3.nextDouble();
                System.out.println("donner la quantite du produit ");
                Scanner sc4 = new Scanner( System.in );
                int n  = sc4.nextInt();
                p = new Produit(n, t,  b, s);
                p.ajouterProduit(produits,p
      ,nbProduit);
                p.afficherProduit(produits,nbProduit+1);
                System.out.println("voulez vous ajouter un autre produit? ");
                System.out.println("1:Oui ");
                System.out.println("2:Non ");
                Scanner sc5 = new Scanner( System.in );
                 c=sc5.nextInt();
                 nbProduit+=1;
             }
                while (c==1);
                }
             else if (a==2)
             {
             do
             {
             System.out.println("donner l'id ");
             Scanner sc0 = new Scanner( System.in );
             long g = sc0.nextLong();
             System.out.println("donner le prenom");
             Scanner sc1 = new Scanner( System.in );
             String s = sc1.nextLine();
             System.out.println("donner le nom ");
             Scanner sc2 = new Scanner( System.in );
             String t = sc2.nextLine();
             System.out.println("donner l'email ");
             Scanner sc3 = new Scanner( System.in );
             String em = sc3.nextLine();
             System.out.println("donner le mot de passe ");
             Scanner sc4 = new Scanner( System.in );
             String mp = sc4.nextLine();
             user = new Utilisateur(g, t, s ,em,mp);
          
  
             user.ajouter_Utilisateur(users,user,nbUser);
             System.out.println("voulez vous ajouter un autre utilisateur? ");
             System.out.println("1:Oui ");
             System.out.println("2:Non ");
             Scanner sc5 = new Scanner( System.in );
             c=sc4.nextInt();
             nbUser+=1;}
             while (c==1);
             nbProduit+=1;
             }
             
             if (nbUser==0)
             {
                 System.out.println("vous devez ajouter un utilisateur ");
                 do
                    {
                	 System.out.println("donner l'id ");
                     Scanner sc0 = new Scanner( System.in );
                     long g = sc0.nextLong();
                     System.out.println("donner le prenom");
                     Scanner sc1 = new Scanner( System.in );
                     String s = sc1.nextLine();
                     System.out.println("donner le nom ");
                     Scanner sc2 = new Scanner( System.in );
                     String t = sc2.nextLine();
                     System.out.println("donner l'email ");
                     Scanner sc3 = new Scanner( System.in );
                     String em = sc3.nextLine();
                     System.out.println("donner le mot de passe ");
                     Scanner sc4 = new Scanner( System.in );
                     String mp = sc4.nextLine();
                     user = new Utilisateur(g, t, s ,em,mp);
                  
          
                     user.ajouter_Utilisateur(users,user,nbUser);
                     System.out.println("voulez vous ajouter un autre utilisateur? ");
                     System.out.println("1:Oui ");
                     System.out.println("2:Non ");
                     Scanner sc5 = new Scanner( System.in );
                     c=sc4.nextInt();
                     nbUser+=1;}
                     while (c==1);
             }
             user.afficherUtilisateur(users,nbUser);
             System.out.println("Qui etes vous ? ");
             
             
             Scanner sc4 = new Scanner( System.in );
             c=sc4.nextInt();
	        int j=0;
	        int s=1;
	        do {
	        	p.afficherProduit(produits,nbProduit);
	            Scanner scanner = new Scanner( System.in );
	            System.out.println("position= ");
	            int po = scanner.nextInt();
	           
	            System.out.println("Quantite=");
	            int qte= scanner.nextInt();
	            Ligne_de_Commande y=new Ligne_de_Commande(produits[po],qte);
	           
	            commande.ajoutercmd(ligne,y,j);
	            System.out.println("vous voulez ajouter une ligne de cmd au pannier 1:oui // 2:non");
	            Scanner scr = new Scanner( System.in );
	            s = scr.nextInt();
	            j+=1;
	        }while(s==1);
			
			double total=0.0;
			
			 for(int h=0;h<j;h++)
		     {
			System.out.println("Produit :"+ligne[h].getP().getNom() +"  prix unitaire :"+ligne[h].getP().getPrixUnitaire()+"  quantité  : "+ligne[h].getQuantite()+"  Total de ce produit"+ligne[h].calculerTotal(ligne[h].getQuantite(), ligne[h].getP()));
		     total+=ligne[h].calculerTotal(ligne[h].getQuantite(), ligne[h].getP());
		         }
		     System.out.println("le total a payer est : "+total);
		     }
		
		}
