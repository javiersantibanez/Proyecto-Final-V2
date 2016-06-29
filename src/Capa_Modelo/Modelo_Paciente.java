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
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Santibañez
 */
public class Modelo_Paciente {
    
    String Pnombre;
    String Snombre;
    String apellidoP;
    String apellidoM;
    String rut;
    int telefono;
    String direccion;
    Date fechaNacimiento;
    String  Diagnostico;
    
    public  Connection con ;
    public  ResultSet resultado;
    
    
    public Modelo_Paciente( String p_nombre, String s_nombre ,String apellido_p, String apellido_m,
                            String _rut, int _telefono, String _direccion, Date _fechaNacimiento,
                            String  _Diagnostico ){
    
        this.Pnombre = p_nombre;
        this.Snombre = s_nombre;
        this.apellidoP = apellido_p;
        this.apellidoM = apellido_m;
        this.rut = _rut;
        this.telefono = _telefono;
        this.direccion = _direccion;
        this.fechaNacimiento = _fechaNacimiento;
        this.Diagnostico = _Diagnostico;

}


  
    
    public void paciente(String _rut, String p_nombre, String s_nombre ,String apellido_p, String apellido_m,
                         String _fechaNacimiento, int _telefono, String _calle, int _num, int _dep, int _torre,
                         String _comuna, String _ciudad, String _region, String _correo,
                         String  _Diagnostico){

        Statement sentencia;
          int id=4;
          try{

          con = ConexionDB.GetConnection();
          sentencia =con.createStatement();
          sentencia.executeUpdate("INSERT INTO Direccion VALUES ('"+id+"',"+"'"+_calle+"',"+"'"+_num+"',"+
                                  "'"+_dep+"',"+"'"+_torre+"',"+"'"+_comuna+"',"+"'"+_ciudad+"',"+"'"+_region+"')");
          
          sentencia.executeUpdate("INSERT INTO Paciente VALUES('"+_rut+"',"+"'"+p_nombre+"',"+"'"+s_nombre+"',"+
                               "'"+apellido_p+"',"+"'"+apellido_m+"',"+"'"+_rut+"',"+"'"+_fechaNacimiento+"',"+
                               "'"+_telefono+"',"+"'"+id+"',"+"'"+_correo+"',"+"'"+_Diagnostico+"')");

          

           JOptionPane.showMessageDialog(null,"El Paciente  " + p_nombre+ " "+ apellido_p+"   ha sido Ingresado Exitosamente ");                 

        }
        catch(SQLException e){JOptionPane.showMessageDialog(null,"Error al ingresar los datos");}
        
  }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}




