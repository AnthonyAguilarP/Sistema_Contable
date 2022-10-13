/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import misc.Control;

/**
 *
 * @author HP
 */
public class Almacen {
    public static void Almacenes(){
        File a=new File("Almacen");
        a.mkdir();
        File b=new File(Control.Direccion(),"Balance");
        b.mkdir();
        File c=new File(Control.Direccion(),"Estado");
        c.mkdir();
        File d=new File(Control.Direccion(),"Flujo");
        d.mkdir();
    }
    public static void add(String str,String Balance,String Archivo){
        File b=new File(Control.Direccion()+"\\"+Archivo,Balance+".txt");
        try{
            BufferedWriter c=new BufferedWriter(new FileWriter(b));
            c.write(Balance+"\n"+str);
            c.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void see(String Balance,String Archivo){
        File a=new File(Control.Direccion()+"\\"+Archivo,Balance+".txt");
        try{
            BufferedReader b=new BufferedReader(new FileReader(a));
            String igual,Almacen="";
            while((igual=b.readLine())!=null){
                Almacen=Almacen+igual+"\n";
            }
            System.out.println(Almacen);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
