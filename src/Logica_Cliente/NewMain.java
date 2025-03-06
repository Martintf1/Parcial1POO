/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Helpers.HelperValidacion;
import Logica_Negocio.Persona;
import Logica_Negocio.Producto;
import java.util.Scanner;

/**
 *
 * @author sanch
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in);
        Producto objProducto;
        Persona objPersona;
        String idProducto,NombreProducto,descripcion;
        String IdPersona, NombrePersona,Apellido;
        int rta, conteo;
        System.out.println("Digite id del producto: ");
        idProducto = scan.nextLine();
        rta = HelperValidacion.ValidarVacio(idProducto);

        while (rta > 0) {
            System.out.println("Digite id del producto: ");
            idProducto = scan.nextLine();
            rta = HelperValidacion.ValidarVacio(idProducto);
        }

        conteo = HelperValidacion.ValidarTodoSerial(idProducto);

        while (conteo != 0) {
            System.out.println("Digite id del producto: ");
            idProducto = scan.nextLine();
            conteo = HelperValidacion.ValidarTodoSerial(idProducto);

        }
        
        System.out.println("Digite el nombre del producto: ");
        NombreProducto = scan.nextLine();
        
        rta = HelperValidacion.ValidarVacio(NombreProducto);

        while (rta > 0) {
            System.out.println("Digite el nombre del producto: ");
            NombreProducto = scan.nextLine();
            rta = HelperValidacion.ValidarVacio(NombreProducto);
        }

        conteo = HelperValidacion.ValidarTodo(NombreProducto);

        while (conteo != 0) {
            System.out.println("Digite el nombre del producto: ");
            NombreProducto = scan.nextLine();
            conteo = HelperValidacion.ValidarTodo(NombreProducto);

        }
        
        System.out.println("Digite descripccion del producto: ");
        descripcion = scan.nextLine();
        rta = HelperValidacion.ValidarVacio(descripcion);

        while (rta > 0) {
            System.out.println("Digite descripccion del producto: ");
            descripcion = scan.nextLine();
            rta = HelperValidacion.ValidarVacio(descripcion);
        }

        conteo = HelperValidacion.ValidarTodo(descripcion);

        while (conteo != 0) {
            System.out.println("Digite descripccion del producto: ");
            descripcion = scan.nextLine();
            conteo = HelperValidacion.ValidarTodo(descripcion);

        }
        
        objProducto = new Producto(idProducto, NombreProducto, descripcion);
        
        System.out.println("Digite el id de la persona: ");
        IdPersona = scan.nextLine();
        
        rta = HelperValidacion.ValidarVacio(IdPersona);

        while (rta > 0) {
            System.out.println("Digite el id de la persona: ");
            IdPersona = scan.nextLine();
            rta = HelperValidacion.ValidarVacio(IdPersona);
        }

        conteo = HelperValidacion.ValidarTodoSerial(IdPersona);

        while (conteo != 0) {
            System.out.println("Digite el id de la persona: ");
            IdPersona = scan.nextLine();
            conteo = HelperValidacion.ValidarTodoSerial(IdPersona);

        }
        
        System.out.println("Digite el Nombre de la persona: ");
        NombrePersona = scan.nextLine();
        
        rta = HelperValidacion.ValidarVacio(NombrePersona);

        while (rta > 0) {
            System.out.println("Digite el Nombre de la persona: ");
            NombrePersona = scan.nextLine();
            rta = HelperValidacion.ValidarVacio(NombrePersona);
        }

        conteo = HelperValidacion.ValidarTodo(NombrePersona);

        while (conteo != 0) {
            System.out.println("Digite el Nombre de la persona: ");
            NombrePersona = scan.nextLine();
            conteo = HelperValidacion.ValidarTodo(NombrePersona);

        }
        
        System.out.println("Digite el apellido de la persona: ");
        Apellido = scan.nextLine();
        
        rta = HelperValidacion.ValidarVacio(Apellido);

        while (rta > 0) {
            System.out.println("Digite el apellido de la persona: ");
            Apellido = scan.nextLine();
            rta = HelperValidacion.ValidarVacio(Apellido);
        }

        conteo = HelperValidacion.ValidarTodo(Apellido);

        while (conteo != 0) {
            System.out.println("Digite el apellido de la persona: ");
            Apellido = scan.nextLine();
            conteo = HelperValidacion.ValidarTodo(Apellido);

        }
        
        objPersona = new Persona(IdPersona, NombrePersona, Apellido, objProducto);
        
    }
    
}
