package src;

public class Employe {
String nom;
int salaire;
public Employe(String nom, int salaire) {
    this.nom = nom;
    this.salaire = salaire;
}

public void afficherInfos() {
	System.out.println("nom:"+nom+",salaire:"+salaire);
}

}
