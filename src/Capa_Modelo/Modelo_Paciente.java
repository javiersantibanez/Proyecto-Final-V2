/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
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

   
    
    public  Connection con,conx ;
    public  ResultSet resultado,res;
    

    public Modelo_Paciente(){ 
 
}

      


    
    public void Ingresarpaciente(String calle, int numero, int depto, 
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

    
    public void ConsultaPaciente(int rut){
        Statement sentencia2;
         
        try
            {
                conx=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-2HVLK3K\\JAVIERPC;databaseName=Proyecto;user=sa;password=1234;");
                sentencia2=conx.createStatement();
                res=sentencia2.executeQuery("SELECT Rut_Paciente FROM Paciente WHERE Rut_Paciente = '"+rut+"'");
                
                /*while (res.next()) {
                    Cliente cli = new Cliente();
                    cli.setId_cliente(rs.getInt("ID_CLIENTE"));
                    cli.setNombre(rs.getString("NOMBRE"));
                    cli.setDomicilio(rs.getString("DOMICILIO"));
                    cli.setTelefono(rs.getString("TELEFONO"));
                    cli.setCodpost(rs.getString("CODPOST"));
                    lis_cli.add(cli);
                }*/
                }
        
            
            catch(SQLException e){
                JOptionPane.showMessageDialog(null,e);}
                
       
            }
        
    }
    



