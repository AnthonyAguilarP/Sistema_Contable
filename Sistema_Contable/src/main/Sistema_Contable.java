/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import dal.Almacen;
import ui.MenuPrincipal;

/**
 *
 * @author HP
 */
public class Sistema_Contable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Almacen.Almacenes();
        MenuPrincipal a=new MenuPrincipal();
        a.Seleccionar();
    }
    
}
