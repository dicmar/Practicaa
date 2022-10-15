package Automovil;

import javax.swing.*;

public class Microbus  extends  Automovil  implements  Comportamiento{


    // Metodo constructor paramterziado

    public Microbus(String marca, String modelo, String patente){  // lsita de parametros
        super(marca, modelo,patente);
    }

    // Metodo void



    // Comportamiendo de motocicleta
    @Override  // sobre escribe el metodo para utlizarlo en abstract
    public void encender(){
        mostrarDatos();  // Instanciamos el mostrar datos
        JOptionPane.showMessageDialog(null,"Encendiendo Mircrobus");
    }


    @Override
    public void acelerar(){
        JOptionPane.showMessageDialog(null,"Acelearando el Microbus............" );
    }







}
