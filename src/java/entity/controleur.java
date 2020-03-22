/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;


import java.util.List;
import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.IdentifierLoadAccess;

import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Asus
 */

public class controleur {
    Session session=null;
 
    public controleur()
    {
   

    }
    public List getallformation()
    {
    this.session=HibernateUtil.getSessionFactory().openSession();
    List<Formation> formationlist=null;
    try{
    org.hibernate.Transaction tr=session.beginTransaction();
    Query q=session.createQuery("select distinct f FROM Formation as f left join fetch f.modules");
    formationlist=(List<Formation>)q.list();
    
    
   
    
    }
   
    catch(Exception e){
        e.printStackTrace();
    };
         session.close();
        return formationlist;
        
    
    }
    public List getformationbydiisp(String disp)
    {
     
       this.session=HibernateUtil.getSessionFactory().openSession();
        org.hibernate.Transaction tr=session.beginTransaction();
        String q = "select e from Formation as e "
          + "where e.discipline = :discipline ";
       
        Query query = session.createQuery(q);
        query.setParameter("discipline", disp);
        
        List res=null;
        res=query.list();

    
        return res;
        
    
    }
    public List getformationbydisp()
    {
       String disp="Informatique";
       this.session=HibernateUtil.getSessionFactory().openSession();
        org.hibernate.Transaction tr=session.beginTransaction();
        String q = "select e from Formation as e "
          + "where e.discipline = :discipline ";
       
        Query query = session.createQuery(q);
        query.setParameter("discipline", disp);
        
        List res=null;
        
        res=query.list();

    
        return res;
        
    
    }
    
    public boolean connecter(String login , String mot_pass)
    {   this.session=HibernateUtil.getSessionFactory().openSession();
        org.hibernate.Transaction tr=session.beginTransaction();
        String q = "select e from Compte as e left join fetch e.formateurs"
          + "where e.login = :login "+"and e.motdepass =:mot_pass";
       
        Query query = session.createQuery(q);
        query.setParameter("login", login);
        query.setParameter("mot_pass",mot_pass);
        List res=query.list();
        session.close();
        
        if (res.isEmpty())
        { 
            return false;
        }
        else return true;
       
        }
     public Compte connecter(String mot_pass)
    {   this.session=HibernateUtil.getSessionFactory().openSession();
        org.hibernate.Transaction tr=session.beginTransaction();
        String q = "select e from Compte as e "
          + "where e.motdepasse =:mot_pass";
       
        Query query = session.createQuery(q);
        query.setParameter("mot_pass",mot_pass);
        List res=query.list();
        return (Compte)res.get(0);
       
        }
    public Formation getformation(int id)
    {
     this.session=HibernateUtil.getSessionFactory().openSession();
     org.hibernate.Transaction tr=session.beginTransaction();
    
       IdentifierLoadAccess identifier = session.byId(Formation.class);
       Formation f = (Formation)identifier.getReference(id);
       f.getDiscipline();
   
       return f;
}
     public Module getmodule(int id)
    {
     this.session=HibernateUtil.getSessionFactory().openSession();
     org.hibernate.Transaction tr=session.beginTransaction();
    
       IdentifierLoadAccess identifier = session.byId(Module.class);
       Module f = (Module)identifier.getReference(id);
      
       return f;
}
      public Formateur getform(int id)
    {
     this.session=HibernateUtil.getSessionFactory().openSession();
     org.hibernate.Transaction tr=session.beginTransaction();
    
       IdentifierLoadAccess identifier = session.byId(Formateur.class);
       Formateur f = (Formateur)identifier.getReference(id);
      
       return f;
}
        public Apprenant getapp(int id)
    {
     this.session=HibernateUtil.getSessionFactory().openSession();
     org.hibernate.Transaction tr=session.beginTransaction();
    
       IdentifierLoadAccess identifier = session.byId(Apprenant.class);
       Apprenant f = (Apprenant)identifier.getReference(id);
       return f;
}
       public Formateur getformateur(String pass)
    {
     this.session=HibernateUtil.getSessionFactory().openSession();
     org.hibernate.Transaction tr=session.beginTransaction();
     String q = "select e from Formateur as e "
          + "where e.compte.motdepasse = :pass";
       
        Query query = session.createQuery(q);
        query.setParameter("pass", pass);
        List res=null;
        res=query.list();
        session.close();
        
        if (res.size()==0)
        { 
            return null;
        }
        {
        return null ;
                }
  
      
}
    public Apprenant getapprenant(String pass)
    {
     this.session=HibernateUtil.getSessionFactory().openSession();
     org.hibernate.Transaction tr=session.beginTransaction();
     String q = "select e from Apprenant as e "
          + "where e.compte.motdepasse = :pass";
       
        Query query = session.createQuery(q);
        query.setParameter("pass", pass);
        List res=null;
        res=query.list();
        session.close();
        
        if (res.size()==0)
        { 
            return null;
        }
        {
        return (Apprenant)res.get(0) 
                ;}
  
      
}
       
       public boolean existe (String login , String mot_pass)
        {
        this.session=HibernateUtil.getSessionFactory().openSession();
        org.hibernate.Transaction tr=session.beginTransaction();
        String q = "select e from Compte as e "
          + "where e.login = :login "+"and e.motdepasse = :mot_pass";
       
        Query query = session.createQuery(q);
        query.setParameter("login", login);
        query.setParameter("mot_pass",mot_pass);
        List res=null;
        res=query.list();

        session.close();
        
        if (res.size()==0)
        { 
            return false;
        }
        {
        return true ;}
        
        }
         
    
    public void ajoutformateur(Formateur f)
    {  this.session=HibernateUtil.getSessionFactory().openSession();
        org.hibernate.Transaction tr=session.beginTransaction();
        session.save(f);
        tr.commit();
        session.close();
        
    }
     public void ajoutcompte(Compte f)
    {   this.session=HibernateUtil.getSessionFactory().openSession();
        org.hibernate.Transaction tr=session.beginTransaction();
        session.save(f);
        tr.commit();
        session.close();
       
    }
    public void ajoutapprenant(Apprenant p)
    {
        this.session=HibernateUtil.getSessionFactory().openSession();
        org.hibernate.Transaction tr=session.beginTransaction();
        session.save(p);
        tr.commit();
        session.close();
     
        
    
    }
}
