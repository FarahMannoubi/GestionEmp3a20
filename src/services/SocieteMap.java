package services;

import entity.Employe;
import interfaces.IGestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SocieteMap implements IGestion<Employe> {
    Map<String, Employe> employesMap;
    public SocieteMap() {
      employesMap = new HashMap<>();
    }
    @Override
    public void ajouterEmploye(Employe employe) {
        employesMap.put("1",employe);
        //Map.Entry<K,V>
    }

    public Employe setValue(Employe value){
        return employesMap.get("1");

    }

    @Override
    public boolean rechercherEmploye(String nom) {
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return false;
    }

    @Override
    public void supprimerEmploye(Employe employe) {

    }

    @Override
    public void afficherEmploye() {

    }

    @Override
    public void trierEmployeParId() {

    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {

    }
}
