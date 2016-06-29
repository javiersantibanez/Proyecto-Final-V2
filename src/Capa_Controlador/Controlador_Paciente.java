/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Controlador;

import Capa_Modelo.Modelo_Paciente;
import Capa_Vista.Vista_AgregarP;
import Capa_Vista.Vista_EditarP;
import Capa_Vista.Vista_EliminarP;
import Capa_Vista.Vista_Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Santibañez
 */
public class Controlador_Paciente {
    
    private Vista_AgregarP vAddPac;
    private Vista_EditarP vEditPac;
    private Vista_EliminarP vEliPac;
    private Vista_Principal vPrin;
    private Modelo_Paciente mPac;
    
    public Controlador_Paciente(Vista_AgregarP vAddPac, Vista_Principal vPrin, Modelo_Paciente mPac,
                                Vista_EditarP vEditPac, Vista_EliminarP vEliPac){
        this.vAddPac = vAddPac;
        this.vPrin = vPrin;
        this.mPac = mPac;
        this.vEditPac = vEditPac;
        this.vEliPac = vEliPac;
        this.vAddPac.botonAtras(new Atras());
        this.vEditPac.botonAtras(new Atras());
        this.vAddPac.botonAceptar(new Aceptar());
    }
    
    //boton atras para todos
    
    class Atras implements ActionListener{
        @Override
        /**
         * Este método vuelve hacia la vista principal del programa
         */
        public void actionPerformed(ActionEvent a) {
            System.out.println("atrasssaasasas");
              
               try{
                   vAddPac.setVisible(false);
                   vPrin.setVisible(true);
                  
               }catch(NumberFormatException ex){
                   JOptionPane.showMessageDialog(vPrin, "Error al volver a la pagina principal");
               }
            }
    }
    
    //Boton aceptar para ingresar
    class Aceptar implements ActionListener{
        @Override
        /**
         * Este método ...
         */
        public void actionPerformed(ActionEvent a) {
              
               try{
                   //enviar a modelo
                   mPac.Ingresarpaciente(vAddPac.getCalle(),vAddPac.getNumero(),vAddPac.getDepto(),vAddPac.getTorre(),vAddPac.getComuna(),
                   vAddPac.getCiudad(),vAddPac.getRegion(),vAddPac.getRut(),vAddPac.getPrimerNombre(),vAddPac.getSegundoNombre(),vAddPac.getApellidoPaterno(),
                   vAddPac.getApellidoMaterno(),vAddPac.getFNacimiento(),vAddPac.getTelefono(),vAddPac.getCorreoElectronico(),vAddPac.getDiagnostico());
                   //limpiar texto
                   vEditPac.limpiarTextField();
                   
               }catch(NumberFormatException ex){
                   JOptionPane.showMessageDialog(vPrin, "Error al volver a la pagina principal");
               }
            }
    }
    
    //boton actualizar para editar
    class Actualizar implements ActionListener{
        @Override
        /**
         * Este método ...
         */
        public void actionPerformed(ActionEvent a) {
              
               try{
                   //enviar a modelo
                   mPac.Ingresarpaciente(vEditPac.getCalle(),vEditPac.getNumero(),vEditPac.getDepto(),vEditPac.getTorre(),vEditPac.getComuna(),
                   vEditPac.getCiudad(),vEditPac.getRegion(),vEditPac.getRut(),vEditPac.getPrimerNombre(),vEditPac.getSegundoNombre(),vEditPac.getApellidoPaterno(),
                   vEditPac.getApellidoMaterno(),vEditPac.getFNacimiento(),vEditPac.getTelefono(),vEditPac.getCorreoElectronico(),vEditPac.getDiagnostico());
                   //limpiar texto
                   vEditPac.limpiarTextField();
                   
               }catch(NumberFormatException ex){
                   JOptionPane.showMessageDialog(vPrin, "Error al volver a la pagina principal");
               }
            }
    }
    
    //Boton consulta para editar
    class Consulta implements ActionListener{
        @Override
        /**
         * Este método ...
         */
        public void actionPerformed(ActionEvent a) {
              
               try{
                   vEditPac.getRut();
                   
                   
                   
                   
                   //funcion que habilita el contenido a editar:
                   vEditPac.habilitarContenido();
                   
               }catch(NumberFormatException ex){
                   JOptionPane.showMessageDialog(vPrin, "Error al volver a la pagina principal");
               }
            }
    }
    
}
