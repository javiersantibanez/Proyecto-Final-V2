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
    String calle;
    int numero;
    int depto;
    int torre;
    String comuna;
    String ciudad;
    String region;
    String fechaNacimiento;
    String  Diagnostico;
    String correo;

   
    
    public  Connection con ;
    public  ResultSet resultado;
    

    public Modelo_Paciente(){ 
 
}

      


    
    public void paciente(String calle, int numero, int depto, 
            int torre, String comuna, String ciudad, 
            String region, int rut, String Pnombre, 
            String Snombre, String apellidoP, String apellidoM, 
            String fechaNacimiento, int telefono, String correo, 
            String Diagnostico){


        Statement sentencia;
          int id=2;
          try{

          con = ConexionDB.GetConnection();
          sentencia =con.createStatement();
          sentencia.executeUpdate("INSERT INTO Direccion VALUES ('"+id+"',"+"'"+calle+"',"+"'"+numero+"',"+
                                  "'"+depto+"',"+"'"+torre+"',"+"'"+comuna+"',"+"'"+ciudad+"',"+"'"+region+"')");
          
          sentencia.executeUpdate("INSERT INTO Paciente VALUES('"+rut+"',"+"'"+Pnombre+"',"+"'"+Snombre+"',"+
                               "'"+apellidoP+"',"+"'"+apellidoM+"',"+"'"+fechaNacimiento+"',"+
                               "'"+telefono+"',"+"'"+id+"',"+"'"+correo+"',"+"'"+Diagnostico+"')");

          

           JOptionPane.showMessageDialog(null,"El Paciente  " + Pnombre+ " "+ apellidoP+"   ha sido Ingresado Exitosamente ");                 

        }
        catch(SQLException e){JOptionPane.showMessageDialog(null,"Error al ingresar los datos");}
        
  }

}


