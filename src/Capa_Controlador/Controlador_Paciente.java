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
        this.vEditPac.botonConsultar(new Consulta());
        this.vEditPac.botonActualizar(new Actualizar());
    }
    
    //boton atras para todos
    
    class Atras implements ActionListener{
        @Override
        /**
         * Este método vuelve hacia la vista principal del programa
         */
        public void actionPerformed(ActionEvent a) {
        
              
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
                   JOptionPane.showMessageDialog(vPrin, "Error al ingresar datos del paciente");
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
                   mPac.ActualizarPaciente(vEditPac.getCalle(),vEditPac.getNumero(),vEditPac.getDepto(),vEditPac.getTorre(),vEditPac.getComuna(),
                   vEditPac.getCiudad(),vEditPac.getRegion(),vEditPac.getRut(),vEditPac.getPrimerNombre(),vEditPac.getSegundoNombre(),vEditPac.getApellidoPaterno(),
                   vEditPac.getApellidoMaterno(),vEditPac.getFNacimiento(),vEditPac.getTelefono(),vEditPac.getCorreoElectronico(),vEditPac.getDiagnostico());
                   //limpiar texto
                   vEditPac.limpiarTextField();
                   
               }catch(NumberFormatException ex){
                   JOptionPane.showMessageDialog(vPrin, "Error al actualizar los datos del paciente");
               }
            }
    }
    
    //Boton consulta para editar
    class Consulta implements ActionListener{
        
        /**
         * Este método ...
         */
        public void setDatosPaciente (String [] aux){
            
            vEditPac.setDatos(aux[0],aux[1],aux[2],aux[3],aux[4],aux[5],aux[7],aux[8],
                              aux[9],aux[10],aux[11],aux[12],aux[13],aux[14],aux[15]);
            
            
        }
        
        public void actionPerformed(ActionEvent a) {
            String [] datos = new String[9]; 
            try{
               //realiza la consulta a db y set datos en vista
               setDatosPaciente (mPac.ConsultaPaciente(vEditPac.getRut()));




               //funcion que habilita el contenido a editar:
               vEditPac.habilitarContenido();
            }
            catch(NumberFormatException ex){
               JOptionPane.showMessageDialog(vPrin, "Error al realizar la consulta");
            }
        }
    }
    
}
