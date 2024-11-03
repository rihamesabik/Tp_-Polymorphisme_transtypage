package src;

public class Devloppeur extends Employe {
String langage;
public Devloppeur(String nom, int salaire, String langage) {
    super(nom, salaire);
    this.langage = langage;
}
@Override
public void afficherInfos() {
	super.afficherInfos();
	
}
public void afficherLangage() {
	System.out.println("la langage"+langage);
}

}
