/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author sanch
 */
public class Persona {
    public String Id, Nombre,Apellido;
    public Producto objproducto;

    public Persona() {
    }

    public Persona(String Id, String Nombre, String Apellido, Producto objproducto) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.objproducto = objproducto;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public Producto getObjproducto() {
        return objproducto;
    }

    public void setObjproducto(Producto objproducto) {
        this.objproducto = objproducto;
    }
    
    
}
