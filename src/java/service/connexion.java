
package service;

import java.sql.*;

public class connexion {
    private Connection con ;
    private Statement st;
    public connexion(){  
     try{
            Class.forName("com.mysql.jdbc.Driver"); /*signifie qu'on utilise Mysql comme BDD*/ 
            con = DriverManager.getConnection("jdbc:mysql://localhost:8080/inscription","root","");
            st = con.createStatement();
      }catch (Exception e){
          System.out.println("Echec");
          e.printStackTrace();
      }
}
    public Connection getConnexion(){
            return con;
        }
     public void CreerTableJava(){
         String r = "CREATE TABLE Etudiant(NumEtudiant INT NOT NULL PRIMARY KEY,Nom VARCHAR(25),Prenom VARCHAR(25),dateNaissance DATE,AnneeBac INT,NumBac INT)"; 
        try {   
        boolean f = true;
        if (f){
            System.out.println("la table existe déjà");
        }else{
            st.execute(r);
            f=false;
        }
        } catch(Exception e){
                System.out.println("Erreur" + e);
            }
            }
        }

