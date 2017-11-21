package employe;

public class Salary {
    
    public static void main (String[] args) {
        
        Personnel p = new Personnel();
        p.ajouterEmploye(new Vendeur("Jean", "Claude", 35, " 2003 ", 30000));
        p.ajouterEmploye(new Representant("Saidou", "Keumake", 29, "2008", 20000));
        p.ajouterEmploye(new Technicien("Leo", "Messi", 28, "2007", 1500));
        p.ajouterEmploye(new Manutentionnaire("Todou", "Felix", 26, "2004", 40));
        p.ajouterEmploye(new TechnicienARisque("ahmed",  "Dine", 25, "2005", 1500));
        p.ajouterEmploye(new ManutentionnaireARisque("Arafat", "Dj", 35, "2002", 40));
        
        
        p.afficherSalaire();
        System.out.println(" Le salaire moyen dans l'entreprise est de " + p.salaireMoyen() + " FCFA. ");
        
        
    }
            
            
}

