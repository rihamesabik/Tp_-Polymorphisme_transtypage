package src;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employe[] employes = new Employe[2];
       employes[0] = new Devloppeur("Alice", 50000, "Java");
       employes[1] = new Manager("Bob", 70000, 5);
       for (Employe e : employes) {
           e.afficherInfos();
       }
       Employe employe1 = new Devloppeur("Charlie", 60000, "Python");
       employe1.afficherInfos();    
	if (employe1 instanceof Devloppeur) {
		((Devloppeur) employe1).afficherLangage();
       
    }
    if (employes[1] instanceof Manager) {
        Manager manager = (Manager) employes[1];
        manager.gereEquipe();
    }
}
}