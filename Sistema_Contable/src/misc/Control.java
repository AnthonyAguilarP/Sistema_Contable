/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misc;

import dol.Cuenta;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Control {
    public static String FE(ArrayList<Cuenta>ao,ArrayList<Cuenta>ai,ArrayList<Cuenta>af,Cuenta a){
        String l="---------------------------------------------------------------------";
        String n=l+"\nActividades de operacion\n";
        int i=0;
        for(Cuenta t:ao){
            n=n+ao.get(i).toString()+"\n";
            i++;
        }i=0;
        n=n+"Actividades de inversion\n";
        for(Cuenta y:ai){
            n=n+ai.get(i).toString()+"\n";
            i++;
        }i=0;
        n=n+"Actividades de financiamiento\n";
        for(Cuenta h: af){
            n=n+af.get(i).toString()+"\n";
            i++;
        }Double au=(Suma(ao)+Suma(ai)+Suma(af));
        n=n+"\nAumento/disminucion en el efectivo: "+au+"\n"+a+"\n";
        n=n+"Efectivo equivalente al final del periodo: "+(au+a.getEfectivo())+"\n"+l;
        return n;
    }
    public static String ER(String ut,ArrayList<Cuenta>fin,ArrayList<Cuenta>ad,ArrayList<Cuenta>ve,ArrayList<Cuenta>o,Double uti){
        String l="--------------------------------------------------------------";
        String a=l+"\n"+ut+"\nGastos de venta\n";
        int i=0;
        for(Cuenta h:ve){
            a=a+ve.get(i).toString()+"\n";
            i++;
        }i=0;
        a=a+"Gastos administrativos\n";
        for(Cuenta k:ad){
            a=a+ad.get(i).toString()+"\n";
            i++;
        }i=0;
        a=a+"Gastos financieros\n";
        for(Cuenta j:fin){
            a=a+fin.get(i).toString()+"\n";
            i++;
        }i=0;
        a=a+"Otros gastos\n";
        for(Cuenta y: o){
            a=a+o.get(i).toString()+"\n";
            i++;
        }a=a+"Utilidad/perdida neta: "+(uti-(Suma(fin)+Suma(ad)+Suma(ve)+Suma(o)))+"\n"+l;
        return a;
    }
    public static String Direccion(){
        File a=new File("Almacen");
        return a.getAbsolutePath();
    }
    public static String Balance(ArrayList<Cuenta> Activo,ArrayList<Cuenta> Pasivo){
        int i=0;
        String l="--------------------------------------------------------------";
        String a=l+"\n"+"Activo\n";
        for(Cuenta b: Activo){
            a=a+Activo.get(i).toString()+"\n";
            i++;
        }
        a=a+"Pasivo\n";
        i=0;
        for(Cuenta m: Pasivo){
            a=a+Pasivo.get(i).toString()+"\n";
            i++;
        }
        a=a+"Capital: "+(Suma(Activo)-Suma(Pasivo))+"\n"+l;
        return a;
    }
    private static Scanner sc=new Scanner(System.in);
    public static String Ver(ArrayList<Cuenta> a){
        int i=0;
        String c="";
        for(Cuenta b: a){
            c=c+a.get(i).toString()+"\n";
            i++;
        }
        return c;
    }
    public static Cuenta addCuenta(int v,int i){
        Cuenta a=new Cuenta();
        System.out.print("Cuenta: ");
        a.setNombre(sc.next());
        System.out.print("Efectivo: ");
        a.setEfectivo(sc.nextDouble());
        a.setID(v+"."+i);
        return a;
    }
    public static Double Suma(ArrayList<Cuenta> a){
        Double c=0.0;
        int i=0;
        for(Cuenta f: a){
            c=c+a.get(i).getEfectivo();
            i++;
        }
        return c;
    }
}
