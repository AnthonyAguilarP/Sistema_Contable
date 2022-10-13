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
class FlujoEfectivo implements IMenu{

    @Override
    public void Opciones() {
        System.out.println("1.Actividades de operacion");
        System.out.println("2.Ver actividades de operacion");
        System.out.println("3.Eliminar actividades de operacion");
        System.out.println("4.Actividades de inversion");
        System.out.println("5.Ver actividades de inversion");
        System.out.println("6.Eliminar actividades de inversion");
        System.out.println("7.Actividades de financiamiento");
        System.out.println("8.Ver actividades de financiamiento");
        System.out.println("9.Eliminar actividades de financiamiento");
        System.out.println("10.Flujo de efectivo");
        System.out.println("11.Salir");
        System.out.print("Usted selecciono: ");
    }

    @Override
    public void Seleccionar() {
        ArrayList<Cuenta>ao=new ArrayList<Cuenta>();
        ArrayList<Cuenta>ai=new ArrayList<Cuenta>();
        ArrayList<Cuenta>af=new ArrayList<Cuenta>();
        Scanner sc=new Scanner(System.in);
        int i=0,iao=0,iai=0,iaf=0;
        Cuenta a;
        System.out.print("Equivalente de efectivo al inicio del periodo: ");
        a=new Cuenta("4.1","Equivalente de fectivo al inicio del periodo",sc.nextDouble());
        while(i!=11){
            Opciones();
            try{
                i=sc.nextInt();
            }catch(Exception e){
                i=0;
            }
            switch (i) {
                case 1 -> {
                    iao++;
                    ao.add(Control.addCuenta(1, iao));
                }
                case 2 -> Control.Ver(ao);
                case 3 -> {
                    System.out.print("Posicion del elemento: ");
                    ao.remove(sc.nextInt()-1);
                }
                case 4 -> {
                    iai++;
                    ai.add(Control.addCuenta(2, iai));
                }
                case 5 -> Control.Ver(ai);
                case 6 -> {
                    System.out.print("Posicion de elemento: ");
                    ai.remove(sc.nextInt()-1);
                }
                case 7 -> {
                    iaf++;
                    af.add(Control.addCuenta(3, iaf));
                }
                case 8 -> Control.Ver(af);
                case 9 -> {
                    System.out.print("Posicion del elemento: ");
                    af.remove(sc.nextInt()-1);
                }
                case 10 -> Control.FE(ao, ai, af, a);
                case 11 -> System.out.println("Tenga buen dia");
                default -> System.out.println("Ingrese una opcion valida");
            }
        }
        System.out.print("Nombre del flujo de efectivo(non usar espacios): ");
        Almacen.add(Control.FE(ao, ai, af, a), sc.next(), "Flujo");
    }
    
}
