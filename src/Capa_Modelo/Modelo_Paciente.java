/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Modelo;

import java.sql.Date;

/**
 *
 * @author Javier Santibañez
 */
public class Modelo_Paciente {
    
    String Pnombre;
    String Snombre;
    String Papellido;
    String Sapellido;
    String rut;
    int telefono;
    String direccion;
    Date fechaNacimiento;
    String  Diagnostico;
    
public Modelo_Paciente( String p_nombre, String s_nombre ,String p_apellido, String s_apellido,
                        String _rut, int _telefono, String _direccion, Date _fechaNacimiento,
                        String  _Diagnostico ){
    
    this.Pnombre = p_nombre;
    this.Snombre = s_nombre;
    this.Papellido = p_apellido;
    this.Sapellido = s_apellido;
    this.rut = _rut;
    this.telefono = _telefono;
    this.direccion = _direccion;
    this.fechaNacimiento = _fechaNacimiento;
    this.Diagnostico = _Diagnostico;

}


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}




