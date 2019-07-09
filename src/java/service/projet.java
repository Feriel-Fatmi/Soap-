/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author oussama
 */
@WebService(serviceName = "projet")
public class projet {

    private Connection con;
    private Statement st;

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        try {
            Class.forName("com.mysql.jdbc.Driver"); /*signifie qu'on utilise Mysql comme BDD*/

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inscription", "root", "");
            st = con.createStatement();
        } catch (Exception e) {
            System.out.println("Echec");
            e.printStackTrace();
        }
        return "it works!";
    }

    @WebMethod(operationName = "CreerTableJava")
    public String CreerTableJava() {
        String r = "CREATE TABLE Etudiant(NumEtudiant INT NOT NULL PRIMARY KEY,Nom VARCHAR(25),Prenom VARCHAR(25),dateNaissance DATE,AnneeBac INT,NumBac INT)";
        try {
            boolean f = true;
            if (f) {
                System.out.println("la table existe déjà");
            } else {
                st.execute(r);
                f = false;
            }
        } catch (Exception e) {
            System.out.println("Erreur" + e);
        }
        return "on est dans la methode creer table";
    }
}
