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
class EstadoResultado implements IMenu{

    private Scanner sc=new Scanner(System.in);
    
    @Override
    public void Opciones() {
        System.out.println("----------------------------------------------------");
        System.out.println("1.Gasto financieros");
        System.out.println("2.Ver gastos financieros");
        System.out.println("3.Eliminar gastos financieros");
        System.out.println("4.Gasto administrativos");
        System.out.println("5.Ver gastos administrativos");
        System.out.println("6.Eliminar gastos administrativos");
        System.out.println("7.Gasto venta");
        System.out.println("8.Ver gastos venta");
        System.out.println("9.Eliminar gastos venta");
        System.out.println("10.Otros gastos");
        System.out.println("11.Ver otros gastos");
        System.out.println("12.Eliminar otros gastos");
        System.out.println("13.Ver ER");
        System.out.println("14.Salir");
        System.out.print("Usted selecciono");
    }

    @Override
    public void Seleccionar() {
        ArrayList<Cuenta>fin=new ArrayList<Cuenta>();
        ArrayList<Cuenta>ad=new ArrayList<Cuenta>();
        ArrayList<Cuenta>ve=new ArrayList<Cuenta>();
        ArrayList<Cuenta>o=new ArrayList<Cuenta>();
        String Venta,Compras,II,IF,merca,Costov,u;
        Cuenta aa,aaa,aaaa,aaaaa;
        Double ut;
        System.out.print("Ventas netas: ");
        aa=new Cuenta("0.1","Ventas neta",sc.nextDouble());
        Venta=aa.toString();
        System.out.print("Compras netas: ");
        aaa=new Cuenta("0.2","Compras netas",sc.nextDouble());
        Compras=aaa.toString();
        System.out.print("Inventario Inicial: ");
        aaaa=new Cuenta("0.3","Inventario inicial",sc.nextDouble());
        II=aaaa.toString();
        System.out.print("Inventario Final: ");
        aaaaa=new Cuenta("0.4","Inventario final",sc.nextDouble());
        merca=II+Compras;
        ut=((aa.getEfectivo())-((aaaa.getEfectivo()+aaa.getEfectivo())-aaaaa.getEfectivo()));
        u=aa+"\n"+aaa+"\n"+aaaa+"\n"+aaaaa+"\n"+"Utilidad/perdidad bruta: "+ut;
        int i=0,ifi=0,ia=0,iv=0,io=0;
        while(i!=14){
            Opciones();
            try{
                i=sc.nextInt();
            }catch(Exception e){
                i=0;
            }
            System.out.println("------------------------------------------------");
            switch (i) {
                case 1 -> {
                    ifi++;
                    fin.add(Control.addCuenta(2, i));
                }
                case 2 -> System.out.println(Control.Ver(fin));
                case 3 -> {
                    System.out.print("Posicion del elemento: ");
                    fin.remove(sc.nextInt()-1);
                }
                case 4 -> {
                    ia++;
                    ad.add(Control.addCuenta(2, ia));
                }
                case 5 -> System.out.println(Control.Ver(ad));
                case 6 -> {
                    System.out.print("Posicion del elemento: ");
                    ad.remove(sc.nextInt()-1);
                }
                case 7 -> {
                    iv++;
                    ve.add(Control.addCuenta(3, iv));
                }
                case 8 -> System.out.println(Control.Ver(ve));
                case 9 -> {
                    System.out.print("Posicion del elemento: ");
                    ve.remove(sc.nextInt()-1);
                }
                case 10 -> {
                    io++;
                    o.add(Control.addCuenta(4, io));
                }
                case 11 -> System.out.println(Control.Ver(o));
                case 12 -> {
                    System.out.print("Posicion del elemento: ");
                    o.remove(sc.nextInt()-1);
                }
                case 13 -> System.out.println(Control.ER(u, fin, ad, ve, o,ut));
                case 14 -> System.out.println("Tenga buen dia");
                default -> System.out.println("Ingrese una opcion valida");
            }
        }
        System.out.print("Ingrese el nombre del ER(no usar espacios): ");
        Almacen.add(Control.ER(u, fin, ad, ve, o,ut), sc.next(), "Estado");
    }
    }
    
