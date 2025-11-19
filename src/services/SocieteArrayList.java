package services;

import entity.Employe;
import entity.TrierEmployeParGrade;
import entity.TrierEmployeParNomDepartement;
import interfaces.IGestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe> {
    private List<Employe> employes;
    public SocieteArrayList() {
        this.employes = new ArrayList<>();
    }
    @Override
    public void ajouterEmploye(Employe employe) {
        this.employes.add(employe);

    }

    @Override
    public boolean rechercherEmploye(String nom)
    {
        for (Employe employe: this.employes)
        {
            if(employe.getNom().equals(nom))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return this.employes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        this.employes.remove(employe);

    }

    @Override
    public void afficherEmploye() {
        System.out.println(this.employes);

    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(this.employes);

    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
   Collections.sort(this.employes,new TrierEmployeParNomDepartement()
           .thenComparing(new TrierEmployeParGrade()));

    }
}
