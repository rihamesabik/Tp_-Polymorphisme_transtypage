package src;

public class Manager extends Employe {
	int nombreDeSubordonnes;
	 public Manager(String nom, int salaire, int nombreDeSubordonnes) {
	        super(nom, salaire);
	        this.nombreDeSubordonnes = nombreDeSubordonnes;
	    }
	@Override
	public void afficherInfos() {
		super.afficherInfos();
		System.out.println("la nombreDeSubordonnes "+nombreDeSubordonnes);	
	}
	public void gereEquipe() {
		System.out.println("gerer equipe ");	
	}
	
}
