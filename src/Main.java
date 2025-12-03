import entity.Departement;
import entity.Employe;
import services.AffectationHashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        AffectationHashMap affectationHashMap = new AffectationHashMap();
        affectationHashMap.ajouterEmployeDepartement(new Employe(1,"Ali"),new Departement(1,"RH"));
  Employe employe = new Employe(2,"Mehdi");
  Departement departement = new Departement(2,"Dev");
  affectationHashMap.ajouterEmployeDepartement(employe,departement);
  affectationHashMap.ajouterEmployeDepartement(new Employe(2,"Mehdi"),departement);
  affectationHashMap.afficherEmployesEtDepartements();
    }
}