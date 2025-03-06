/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import Logica_Negocio.Persona;

/**
 *
 * @author sanch
 */
public class HelperImpresion {
   public static void ImprimirPersona(Persona objPersona)
    {
         System.out.println("El Id de la  persona es"+"\t"+objPersona.getId());
        System.out.println("El Nombre  de la persona es"+"\t"+objPersona.getNombre());
        System.out.println("El apellido de la persona es"+"\t"+objPersona.getApellido());
        System.out.println("El   Id del producto es: "+"\t"+objPersona.getObjproducto().getId());
        System.out.println("Ell nombre del producto es:"+"\t"+objPersona.getObjproducto().getNombre());
        System.out.println("La descripcion del producto es:"+"\t"+objPersona.getObjproducto().getDescripcion());
   
    }        
}
