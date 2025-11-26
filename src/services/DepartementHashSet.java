package services;

import entity.Departement;
import interfaces.IDepartement;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement> {
    private Set<Departement> departements;
    public DepartementHashSet() {
        this.departements = new HashSet<>();
    }
    @Override
    public void ajouterDepartement(Departement departement) {
        this.departements.add(departement);

    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement departement : this.departements) {
            return (departement.getNomDepartement().equals(nom)) ;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return this.departements.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        this.departements.remove(departement);

    }

    @Override
    public void displayDepartement() {
        System.out.println(this.departements);

    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> departementTreeSet = new TreeSet<>(this.departements);
        return departementTreeSet;
    }
    public TreeSet<Departement> trierDepartementByNomDepartement() {
      Comparator<Departement> comparator = new Comparator<Departement>() {

          @Override
          public int compare(Departement o1, Departement o2) {
              return o1.getNomDepartement().compareTo(o2.getNomDepartement());
          }
      };
      TreeSet<Departement> departementTreeSet = new TreeSet<>(comparator);
      departementTreeSet.addAll(this.departements);
        return departementTreeSet;
    }
}
