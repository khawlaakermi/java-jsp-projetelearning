package entity;
// Generated 14 avr. 2019 16:29:45 by Hibernate Tools 4.3.1



/**
 * Ressource generated by hbm2java
 */

public class Ressource  implements java.io.Serializable {


     private int id;
     private Formateur formateur;
     private Module module;
     private String nom;
     private String type;

    public Ressource() {
    }

    public Ressource(int id, Formateur formateur, Module module, String nom, String type) {
       this.id = id;
       this.formateur = formateur;
       this.module = module;
       this.nom = nom;
       this.type = type;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Formateur getFormateur() {
        return this.formateur;
    }
    
    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }
    public Module getModule() {
        return this.module;
    }
    
    public void setModule(Module module) {
        this.module = module;
    }
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }




}

