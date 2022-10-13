/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dol;

/**
 *
 * @author HP
 */
public class Cuenta {
    private String ID,Nombre;
    private Double Efectivo;

    public Cuenta(String ID, String Nombre, Double Efectivo) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Efectivo = Efectivo;
    }

    public Cuenta() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Double getEfectivo() {
        return Efectivo;
    }

    public void setEfectivo(Double Efectivo) {
        this.Efectivo = Efectivo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "ID=" + ID + ", Nombre=" + Nombre + ", Efectivo=" + Efectivo + '}';
    }
    
}
