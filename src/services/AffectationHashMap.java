package services;

import entity.Departement;
import entity.Employe;

import java.util.*;

public class AffectationHashMap {
    private Map<Employe, Departement> affectations;

    public AffectationHashMap() {
        affectations = new HashMap<Employe, Departement>();
    }
    public void ajouterEmployeDepartement(Employe e, Departement d){
        affectations.put(e, d);
    }
    public void afficherEmployesEtDepartements(){
        for(Map.Entry<Employe,Departement> entry : affectations.entrySet()){
            System.out.println(entry.getKey()+" affecter à "+entry.getValue()+"\n");
        }
    }

    public void supprimerEmploye(Employe e){
        affectations.remove(e);
    }
    public void supprimerEmployeEtDepartement (Employe e, Departement d){
        for(Map.Entry<Employe,Departement> entry : affectations.entrySet()){
            if(entry.getKey().equals(e) && entry.getValue().equals(d)){
                affectations.remove(e);
            }
        }
    }
    public boolean supprimerEmployeEtDepartementt (Employe e, Departement d){
      return affectations.remove(e,d);
    }
    public void afficherEmployes(){
        Set<Employe>employes = affectations.keySet();
        System.out.println(employes);
    }
    public void afficherDepartements(){
        Collection<Departement> departements = affectations.values();
        System.out.println(departements);
    }
    public boolean rechercherEmploye (Employe e){
        return affectations.containsKey(e);
    }
    public boolean rechercherDepartement (Departement d){
        return affectations.containsValue(d);
    }
    public TreeMap<Employe, Departement> trierMapById(){
        TreeMap<Employe,Departement> map = new TreeMap<>(affectations);
        return map;
    }
    public TreeMap<Employe, Departement> trierMapByname(){
        Comparator<Employe> comparator =new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getNom().compareTo(o2.getNom());
            }
        };
        TreeMap<Employe,Departement> map = new TreeMap<>(comparator);
        map.putAll(affectations);
        return map;
    }
}
