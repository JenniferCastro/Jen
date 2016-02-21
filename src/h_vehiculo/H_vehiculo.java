/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package h_vehiculo;

/**
 *
 * @author FrankMontilla
 */
public class H_vehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo miVehiculo = new Vehiculo();
        miVehiculo.nombreVehiculo = "El Gran Transportador";
        System.out.println("usando miVehiculo, nombreVehiculo : " + miVehiculo.nombreVehiculo);
        System.out.println("usando miVehiculo llama a: " + miVehiculo.transportar());
        System.out.println("--------------------------------------------------------------------");
        System.out.println();

        System.out.println("----------<< SubClase hija Acuatico Extiende de Vehiculo >>---------");
        V_acuatico miAcuatico = new V_acuatico();
        miAcuatico.nombreVehiculo = "El Navegante";
        System.out.println("usando miAcuatico, nombreVehiculo : " + miAcuatico.nombreVehiculo);
        System.out.println("usando miAcuatico llama a : " + miAcuatico.transportar());
        System.out.println("usando miAcuatico llama a : " + miAcuatico.navegar());
        System.out.println("---------------------------------------------------------------------");
        System.out.println();
    }

}
