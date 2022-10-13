/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import dal.Almacen;
import dol.Cuenta;
import java.util.ArrayList;
import java.util.Scanner;
import misc.Control;

/**
 *
 * @author HP
 */
class BalanceGeneral implements IMenu{

    private Scanner sc=new Scanner(System.in);
    
    @Override
    public void Opciones() {
        System.out.println("----------------------------------------------------");
        System.out.println("1.Agregar Activo");
        System.out.println("2.Eliminar Activo");
        System.out.println("3.Ver Activos");
        System.out.println("4.Agregar Pasivo");
        System.out.println("5.Eliminar Pasivo");
        System.out.println("6.Ver Pasivos");
        System.out.println("7.Ver Balance");
        System.out.println("8.Salir");
        System.out.print("Usted Selecciono: ");
    }

    @Override
    public void Seleccionar() {
        ArrayList<Cuenta> Activo=new ArrayList<Cuenta>(); 
        ArrayList<Cuenta> Pasivo=new ArrayList<Cuenta>(); 
        int i=0,idP=0,idA=0;
        while(i!=8){
            Opciones();
            try{
                i=sc.nextInt();
            }catch(Exception e){
                i=0;
            }
            System.out.println("------------------------------------------------");
            switch (i) {
                case 1 -> {
                    idA++;
                    Activo.add(Control.addCuenta(1,idA));
                }
                case 2 -> {
                    System.out.print("Posicion de la cuenta: ");
                    Activo.remove(sc.nextInt()-1);
                }
                case 3 -> System.out.println(Control.Ver(Activo));
                case 4 -> {
                    idP++;
                    Pasivo.add(Control.addCuenta(2, idP));
                }
                case 5 -> {
                    System.out.print("Posicion de la cuenta: ");
                    Pasivo.remove(sc.nextInt()-1);
                }
                case 6 -> System.out.println(Control.Ver(Pasivo));
                case 7 -> System.out.println(Control.Balance(Activo, Pasivo));
                case 8 -> System.out.println("Tenga buen dia");
                default -> System.out.println("Ingrese una opcion valida");
            }
        }
        System.out.print("Nombre del Balance(No usar espacios): ");
            Almacen.add(Control.Balance(Activo, Pasivo), sc.next(), "Balance");
    }
}
