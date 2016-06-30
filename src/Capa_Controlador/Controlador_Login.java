/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Controlador;

import Capa_Modelo.Modelo_Paciente;
import Capa_Vista.*;

/**
 *
 * @author Javier Santibañez
 */
public class Controlador_Login {
    public static void main(String[] args) {
        Vista_Principal farmAD = new Vista_Principal();
        Vista_AgregarP addPac = new Vista_AgregarP();
        Vista_EditarP editPac = new Vista_EditarP();
        Vista_EliminarP delPac = new Vista_EliminarP();
        Modelo_Paciente mPac = new Modelo_Paciente();        
        Controlador_Paciente cPac = new Controlador_Paciente(addPac,farmAD,mPac,editPac,delPac);    
        Controlador_Principal cPrin = new Controlador_Principal(farmAD, addPac, editPac, delPac);
        farmAD.setVisible(true);
    }
}
