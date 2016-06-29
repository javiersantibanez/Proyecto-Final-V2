/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Controlador;

import Capa_Modelo.Modelo_Paciente;
import Capa_Vista.Vista_AgregarP;
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
    private Vista_AgregarP vAddPac;
    
    public Controlador_Principal(Vista_Principal vPrin, Vista_AgregarP vAddPac){
        this.vAddPac = vAddPac;
        this.vPrin = vPrin;
        this.vPrin.botonIngresarPaciente(new AgregarPac());
    }
   
    
    class AgregarPac implements ActionListener{
        @Override
        /**
         * Este método vuelve hacia la vista principal del programa
         */
        public void actionPerformed(ActionEvent a) {
            System.out.println("atrasssaasasas");
              
               try{
                   vAddPac.setVisible(true);
                   //vPrin.setVisible(true);
                  
               }catch(NumberFormatException ex){
                  // JOptionPane.showMessageDialog(vPrin, "Error al volver a la pagina principal");
               }
            }
    }
    
}
