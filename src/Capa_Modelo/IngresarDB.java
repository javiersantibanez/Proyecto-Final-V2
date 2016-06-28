/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Santibañez
 */
public class IngresarDB {
    
   
    public Connection con ;
    public  ResultSet resultado;
    
    public void paciente(String _rut1, String p_nombre, String s_nombre ,String p_apellido, String s_apellido,
                         String _rut,String _fechaNacimiento, int _telefono, int _direccion, String _correo,
                         String  _Diagnostico){

        Statement sentencia;

          try{

          con = ConexionDB.GetConnection();
          sentencia =con.createStatement();
          sentencia.executeUpdate("INSERT INTO Paciente VALUES('"+_rut +"','"+p_nombre+"',"+
                               "'"+s_nombre+"',"+"'"+p_apellido+"',"+
                               "'"+s_apellido+"',"+"'"+_rut+"',"+"'"+_fechaNacimiento+"',"+"'"+_telefono+"',"+
                               "'"+_direccion+"',"+ "'"+_correo+"'"+_Diagnostico+"')");

          

           JOptionPane.showMessageDialog(null,"El Paciente  " + p_nombre+ ""+ s_apellido+"   ha sido Ingresado Exitosamente ");                 

        }
        catch(SQLException e){JOptionPane.showMessageDialog(null,"Error al ingresar los datos");}
        
  }
    
   
    
    
}
