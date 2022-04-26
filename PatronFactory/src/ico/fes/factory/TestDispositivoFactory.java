/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.factory;

import java.util.Scanner;

/**
 *
 * @author HERANDI
 */
public class TestDispositivoFactory {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int eleccion = 0;
        
        System.out.println("¿Que deseas comprar?:");
        System.out.println(Dispositivo.LAP_ASUS +") Laptop marca ASUS");
        System.out.println(Dispositivo.LAP_DELL +") Laptop marca DELL");
        System.out.println(Dispositivo.LAP_HP+") Laptop marca HP");
        System.out.println(Dispositivo.SMART_XIAOMI +") Smartphone XIAOMI");
        System.out.println(Dispositivo.SMART_HUAWEI +") Smartphone HUAWEI");
        System.out.println(Dispositivo.SMART_MOTOROLA +") Smartphone MOTOROLA");
        System.out.println(Dispositivo.TABL_SAMSUNG+") Tablet SAMSUNG");
        System.out.println(Dispositivo.TABL_LENOVO+") Tablet LENOVO");
        System.out.println(Dispositivo.TABL_IPAD +") IPAD PRO");

        try{
            System.out.print("Elige el numero:");
            eleccion = teclado.nextInt();
        } catch (Exception e){
            System.out.println("No capturaste un numero");
        }
        
        Dispositivo dispo = DispositivoFactory.createDispositivo(eleccion);
        System.out.println(dispo.toString()); 
    }
}
