package Automovil;

import javax.swing.*;

public class Motocicleta  extends Automovil implements  Comportamiento {

    // Metodo constructor paramterziado

    public Motocicleta(String marca, String modelo, String patente){  // lsita de parametros
        super(marca, modelo,patente);
    }

    // Metodo void



    // Comportamiendo de motocicleta
    @Override
    public void encender(){
        mostrarDatos();
        JOptionPane.showMessageDialog(null,"Encendiendo Motocicleta");

    }

    @Override
    public void acelerar(){
        JOptionPane.showMessageDialog(null,"Acelearando la Motocicleta............" );
    }




}
