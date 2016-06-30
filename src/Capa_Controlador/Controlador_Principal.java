/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Controlador;

import Capa_Modelo.Modelo_Paciente;
import Capa_Vista.Vista_AgregarDU;
import Capa_Vista.Vista_AgregarM;
import Capa_Vista.Vista_AgregarP;
import Capa_Vista.Vista_EditarDU;
import Capa_Vista.Vista_EditarM;
import Capa_Vista.Vista_EditarP;
import Capa_Vista.Vista_EliminarDU;
import Capa_Vista.Vista_EliminarM;
import Capa_Vista.Vista_EliminarP;
import Capa_Vista.Vista_Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Santibañez
 */
public class Controlador_Principal {
    
 
    
    private Vista_Principal vPrin;
    private Vista_EliminarP vDelPac;
    private Vista_EditarP vEditPac;
    private Vista_AgregarP vAddPac;
    private Vista_AgregarDU vAddDU;
    private Vista_EliminarDU vDelDU;
    private Vista_EditarDU vEditDU;
    private Vista_AgregarM vAddM;
    private Vista_EliminarM vDelM;
    private Vista_EditarM vEditM;
    
    public Controlador_Principal(Vista_Principal vPrin, Vista_AgregarP vAddPac, Vista_EditarP vEditPac, Vista_EliminarP vDelPac){
        this.vAddPac = vAddPac;
        this.vDelPac = vDelPac;
        this.vEditPac = vEditPac;
        this.vPrin = vPrin;
        this.vPrin.botonIngresarPaciente(new AgregarPac());
        this.vPrin.botonEliminarPaciente(new EliminarPac());
        this.vPrin.botonEditarPaciente(new EditarPac());
    }
   
    
    class AgregarPac implements ActionListener{
        @Override
        /**
         * Este método vuelve hacia la vista principal del programa
         */
        public void actionPerformed(ActionEvent a) {              
               try{
                   vAddPac.setVisible(true);                  
               }catch(NumberFormatException ex){
                  // JOptionPane.showMessageDialog(vPrin, "Error al volver a la pagina principal");
               }
            }
    }
    
    class EditarPac implements ActionListener{
        @Override
        /**
         * Este método vuelve hacia la vista principal del programa
         */
        public void actionPerformed(ActionEvent a) {              
               try{
                   vEditPac.setVisible(true);
                   //vPrin.setVisible(true);
                  
               }catch(NumberFormatException ex){
                  // JOptionPane.showMessageDialog(vPrin, "Error al volver a la pagina principal");
               }
            }
    }
    
    class EliminarPac implements ActionListener{
        @Override
        /**
         * Este método vuelve hacia la vista principal del programa
         */
        public void actionPerformed(ActionEvent a) {             
               try{
                   vDelPac.setVisible(true);
                   //vPrin.setVisible(true);
                  
               }catch(NumberFormatException ex){
                  // JOptionPane.showMessageDialog(vPrin, "Error al volver a la pagina principal");
               }
            }
    }
    
}
