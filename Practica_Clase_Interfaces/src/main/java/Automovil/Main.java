package Automovil;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        String marca = JOptionPane.showInputDialog("Ingrese una marca para el automovil : ");

        String modelo = JOptionPane.showInputDialog("Ingrese un modelo para el automovil : ");

        String patente = JOptionPane.showInputDialog("Ingrese una patente para el automovil : ");

        Automovil automovil = new Motocicleta(marca, modelo,patente);
        automovil.agregarAutomovil(automovil);
        automovil.encender();
        automovil.acelerar();

        /* Para  agreagar un microbus descomentamos es parrafo
        Automovil automovil = new Microbus(marca, modelo,patente);
        automovil.agregarAutomovil(automovil);
        automovil.encender();
        automovil.acelerar();
        */


    }

}
