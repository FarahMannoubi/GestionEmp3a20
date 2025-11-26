package entity;

import java.util.Objects;

public class Departement implements Comparable<Departement> {
    private int id;
    private String nomDepartement;
    private int nbrEmploye;

    public Departement(){}
    public Departement(int id, String nomDepartement, int nbrEmploye){
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nbrEmploye = nbrEmploye;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomDepartement() {
        return nomDepartement;
    }
    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }
    public int getNbrEmploye() {
        return nbrEmploye;
    }
    public void setNbrEmploye(int nbrEmployee) {
        this.nbrEmploye = nbrEmployee;
    }
    public boolean equals(Object obj){
        if (obj ==null) return false;
        if (obj == this) return true;
        if (obj instanceof Departement departement){
            return departement.getId()==this.getId()&&departement.getNomDepartement().equals(this.getNomDepartement());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomDepartement);
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", nbrEmploye=" + nbrEmploye +
                '}';
    }

    @Override
    public int compareTo(Departement o) {
        return this.id-o.id;
    }
}
