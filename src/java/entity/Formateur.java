package entity;
// Generated 14 avr. 2019 16:29:45 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Formateur generated by hbm2java
 */
public class Formateur  implements java.io.Serializable {


     private int id;
     private Compte compte;
     private String nom;
     private String email;
     private int anciennete;
     private String domaineExpertise;
     private Set formations = new HashSet(0);
     private Set ressources = new HashSet(0);
     private Set modules = new HashSet(0);

    public Formateur() {
    }

	
    public Formateur(int id, Compte compte, String nom,String email, int anciennete, String domaineExpertise) {
        this.id = id;
        this.compte = compte;
        this.nom = nom;
        this.anciennete = anciennete;
        this.domaineExpertise = domaineExpertise;
        this.email = email;
    }
    public Formateur(int id, Compte compte, String nom, String email, int anciennete, String domaineExpertise, Set formations, Set ressources, Set modules) {
       this.id = id;
       this.compte = compte;
       this.nom = nom;
       this.email = email;
       this.anciennete = anciennete;
       this.domaineExpertise = domaineExpertise;
       this.formations = formations;
       this.ressources = ressources;
       this.modules = modules;
    }
      public Formateur(int id, Compte compte, String nom, String email, int anciennete, String domaineExpertise, Set formations,  Set modules) {
       this.id = id;
       this.compte = compte;
       this.nom = nom;
       this.email = email;
       this.anciennete = anciennete;
       this.domaineExpertise = domaineExpertise;
       this.formations = formations;
       this.modules = modules;
    }
   public Formateur(int id, Compte compte, String nom, String email, int anciennete, String domaineExpertise, Set formations) {
       this.id = id;
       this.compte = compte;
       this.nom = nom;
       this.email = email;
       this.anciennete = anciennete;
       this.domaineExpertise = domaineExpertise;
       this.formations = formations;
     
    }
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Compte getCompte() {
        return this.compte;
    }
    
    public void setCompte(Compte compte) {
        this.compte = compte;
    }
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public int getAnciennete() {
        return this.anciennete;
    }
    
    public void setAnciennete(int anciennete) {
        this.anciennete = anciennete;
    }
    public String getDomaineExpertise() {
        return this.domaineExpertise;
    }
    
    public void setDomaineExpertise(String domaineExpertise) {
        this.domaineExpertise = domaineExpertise;
    }
    public Set getFormations() {
        return this.formations;
    }
    
    public void setFormations(Set formations) {
        this.formations = formations;
    }
    public Set getRessources() {
        return this.ressources;
    }
    
    public void setRessources(Set ressources) {
        this.ressources = ressources;
    }
    public Set getModules() {
        return this.modules;
    }
    
    public void setModules(Set modules) {
        this.modules = modules;
    }




}

