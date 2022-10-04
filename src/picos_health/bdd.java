/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package picos_health;

/*import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;*/
import java.net.Socket;
import java.sql.*;

/**
 *
 * @author iamwinner
 */
public class bdd {
   Connection connection;
   Statement statement;
   String SQL;
   String url;
   String username;
   String password;
   Socket client;
   int Port;
   String Host;

   public bdd(String url,String username, String password, String Host, int Port){
       this.url = url;
       this.username = username;
       this.password = password;
       this.Host = Host;
       this.Port = Port;
   }


   //CONNECION A LA BASE DE DONNEES
   public Connection connexionDatabase(){
       try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
       }catch(Exception e ){
           System.err.println(e.getMessage());

       }
       return connection;
   }
   //FERMERTURE DE LA CONNECTION
   public Connection closeconnexion(){
       try{
           connection.close();
       }catch(Exception e ){
           System.err.println(e.getMessage());
       }
       return connection;
   }
   //EXECUTION DES REQUETES
   public ResultSet executionRequete(String sql){
       connexionDatabase();
       ResultSet resultSet = null;
       try{
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
       }catch(SQLException ex){
           System.err.println(ex.getMessage());
       }
       return resultSet;
   }
   //REQUETE DES MISE A JOUR
   public String requeteUpdate(String sql){
       connexionDatabase();
       String result = "";
       try{
            statement = connection.createStatement();
            statement.executeUpdate(sql);
            result = sql;
        }catch(SQLException ex){
           System.err.println(ex.getMessage());
       }
       return result;
   }
   //FONCTION DE LA REQUETE `SELECT * FROM NOMTABLE` SANS PREDICAT
   public ResultSet requeteSelectAll(String nomTable){
       connexionDatabase();
       SQL = "SELECT * FROM " + nomTable;
       return this.executionRequete(SQL);
   }
   //FONCTION DE LA REQUETE `SELECT * FROM NOMTABLE WHERE PREDICAT`
   public ResultSet requeteSelectAllP(String nomTable, String predicat){
       connexionDatabase();
       SQL = "SELECT * FROM " + nomTable + " WHERE " + predicat;
       return this.executionRequete(SQL);
   }
   //FONCTION DES SELECT AVEC ENUMRATION DES ENUMERATIONS DES COLONNES SANS PREDICAT
   public ResultSet requeteSelect(String[] nomColonne, String nomTable){
       connexionDatabase();
       SQL = "SELECT ";
       for(int i = 0; i <= nomColonne.length - 1; i++ ){
           SQL += nomColonne[i];
           if(i < nomColonne.length - 1){
               SQL += ",";
           }
       }
       SQL += " FROM " + nomTable;
       return this.executionRequete(SQL);
   }
   //FONCTION DES SELECT AVEC ENUMRATION DES ENUMERATIONS DES COLONNES AVEC PREDICAT
   public ResultSet requeteSelectP(String[] nomColonne, String nomTable, String predicat ){
       connexionDatabase();
       SQL = "SELECT ";
       for(int i = 0; i <= nomColonne.length - 1; i++ ){
           SQL += nomColonne[i];
           if(i < nomColonne.length - 1){
               SQL += ",";
           }
       }
       SQL += " FROM " + nomTable + " WHERE " + predicat;
       System.out.println(SQL);
       return this.executionRequete(SQL);
   }
   //FONCTION DE REQUTE INSERTION
   public String requeteInsertion(String nomTable, String[] contenuTableau){
       connexionDatabase();
       SQL = "INSERT INTO " + nomTable + " VALUES(null,";
       for(int i = 0; i <= contenuTableau.length - 1; i++){
           SQL += "'" + contenuTableau[i] + "'";
           if(i < contenuTableau.length - 1){
               SQL += ",";
           }
       }
       SQL += ")";
       return this.requeteUpdate(SQL);
   }

   //FONCTION DE REQUTE INSERTION
   public String requeteInsertion1(String nomTable, String[] contenuTableau){
       connexionDatabase();
       SQL = "INSERT INTO " + nomTable + " VALUES(";
       for(int i = 0; i <= contenuTableau.length - 1; i++){
           SQL += "'" + contenuTableau[i] + "'";
           if(i < contenuTableau.length - 1){
               SQL += ",";
           }
       }
       SQL += ")";
       System.out.println(SQL);
       return this.requeteUpdate(SQL);
   }
   //FONTION DE REQUETE DE SUPPRESSION
   public String requeteDelete(String nomTable, String predicat){
       connexionDatabase();
       SQL = "DELETE FROM " + nomTable + " WHERE " + predicat;
       return this.requeteUpdate(SQL);
   }

   public String requeteUpdte(String nomTable, String[] nomColonne, String[] infos, String predicat){
       connexionDatabase();
       SQL = "UPDATE " + nomTable + " SET ";
       for(int i = 0; i <= nomColonne.length - 1; i++){
           SQL+= nomColonne[i] + "='" + infos[i] + "'";
           if(i < nomColonne.length - 1){
               SQL += ",";
           }else if(i == nomColonne.length - 1){

           }
       }
       SQL += " WHERE " + predicat;
       return this.requeteUpdate(SQL);
   }

}
