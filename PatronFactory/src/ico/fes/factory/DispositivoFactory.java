/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.factory;

/**
 *
 * @author HERANDI
 */
public class DispositivoFactory {
    public static Dispositivo createDispositivo (int tipo){
        switch (tipo) {
            case Dispositivo.LAP_ASUS:
                return new Computadora("Asus","Intel i5","8 GB","500 GB");
            case Dispositivo.LAP_DELL:
                return new Computadora("Dell","Intel i7","16 GB","500 GB");
            case Dispositivo.LAP_HP:
                return new Computadora("HP","AMD Ryzen 5","8 GB","1 TB");
            case Dispositivo.SMART_HUAWEI:
                return new Smartphone("Huawei", "128 GB", true, true);
            case Dispositivo.SMART_MOTOROLA:
                return new Smartphone("Motorola", "32 GB", false, true);
            case Dispositivo.SMART_XIAOMI:
                return new Smartphone("Xiaomi", "64 GB", true, true);
            case Dispositivo.TABL_IPAD:
                return new Tablet("Apple","256 GB", (float) 10.9, true);
            case Dispositivo.TABL_LENOVO:
                return new Tablet("Lenovo","128 GB", (float) 10.3, false);
            case Dispositivo.TABL_SAMSUNG:
                return new Tablet("Samsung","64 GB", (float) 8.7, true);
            
            default:
                throw new AssertionError();
        }
    }
}
