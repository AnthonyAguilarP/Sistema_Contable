/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import dal.Almacen;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class MenuPrincipal implements IMenu{

    @Override
    public void Opciones() {
        System.out.println("1.Balance General");
        System.out.println("2.Ver Balance");
        System.out.println("3.Estado de Resultado");
        System.out.println("4.Ver estado de resultado");
        System.out.println("5.Flujo de efectivo");
        System.out.println("6.Ver flujo de efectivo");
        System.out.println("7.Salir");
        System.out.print("Usted selecciono: ");
    }

    @Override
    public void Seleccionar() {
        int i=0;
        Scanner sc=new Scanner(System.in);
        while(i!=7){
            Opciones();
            try{
                i=sc.nextInt();
            }catch(Exception e){
                i=0;
            }
            switch (i) {
                case 1 -> {
                    BalanceGeneral a=new BalanceGeneral();
                    a.Seleccionar();
                }
                case 2 -> {
                    System.out.print("Nombre del Balance: ");
                    Almacen.see(sc.next(), "Balance");
                }
                case 3 -> {
                    EstadoResultado b=new EstadoResultado();
                    b.Seleccionar();
                }
                case 4 -> {
                    System.out.print("Nombre del ER: ");
                    Almacen.see(sc.next(), "Estado");
                }
                case 5 -> {
                    FlujoEfectivo c=new FlujoEfectivo();
                    c.Seleccionar();
                }
                case 6 -> {
                    System.out.print("Nombre del flujo de efectivo: ");
                    Almacen.see(sc.next(), "Flujo");
                }
                case 7 -> System.out.println("Tenga buen dia");
                default -> System.out.println("Ingrese una opcion validad");
            }
        }
    }
    
}
