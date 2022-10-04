/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package picos_health;

import java.sql.*;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author iamwinner
 */
public class ResultSetTableModel extends AbstractTableModel{
    //DECLARATION
    private ResultSet rs;

    public ResultSetTableModel(ResultSet rs){
        this.rs = rs;
        fireTableDataChanged();
    }
    //FONCTION GETCOLUMN
    public int getColumnCount(){
        try{
            if(rs == null){
                return 0;
            }else{
                return rs.getMetaData().getColumnCount();
            }
        }catch(SQLException e){
            System.out.println("getColumncount resultset genarating error while getting column count");
            System.out.println(e.getMessage());
            return 0;
        }
    }
    //FONTION DE COMPTAGE DE COLONNE
    public int getRowCount(){
        try{
           if(rs == null){
               return 0;
           } else{
               rs.last();
               return rs.getRow();
           }
        }catch(SQLException e){
            System.out.println("getrowcount resultset generating error while getting rows count");
            System.out.println(e.getMessage());
            return 0;
        }
    }
    //PERMET D'OBTENIR UNE VALEUR A PARTIR DE LA LIGNE ET DE LA COLONNE
    public Object getValueAt(int rowIndex,int columnIndex){
        if(rowIndex < 0 || rowIndex > getRowCount() || columnIndex < 0 || columnIndex > getColumnCount()){
            return null;

        }
        try{
            if(rs == null){
                return null;
            }else{
                rs.absolute(rowIndex + 1);
                return rs.getObject(columnIndex + 1);
            }
        }catch(SQLException e){
            System.out.println("getvalueat resultset generating error while fetching rows");
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    @Override
    //FONCTION POUR OBTENIR LE NOM D'UNE COLONNE
    public String getColumnName(int columnIndex){
        try{
            return rs.getMetaData().getColumnName(columnIndex + 1);
        }catch(SQLException e){
            System.out.println("getColumnname resultset generating error while fetching column name");
            System.out.println(e.getMessage());
        }
        return super.getColumnName(columnIndex);
    }

}
