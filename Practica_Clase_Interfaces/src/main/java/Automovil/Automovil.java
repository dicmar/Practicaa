package Automovil;
// Se importa las librerias  para utlizar JOptiopane
import javax.swing.*;
import java.util.ArrayList;

public  abstract  class Automovil  implements  Comportamiento{  // Utlizamos el metodo abstract y Implementamos la infertaces

    /// Declaracion de variables de instancia

    private String marca;
    private String modelo;
    private String patente;


    private ArrayList<Automovil> automoviles;  // Utilizamos arrayList y dentro de los picos parentesis instanciamos la clase y agregamos un tipo de datos

    // Metodo constructor paramterizado

    public Automovil(String marca, String modelo, String patente){
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.automoviles = new ArrayList<>();

    }

    //Metodo void para agregar
    public void agregarAutomovil(Automovil automovil){ // agregamos una dependencia
        this.automoviles.add(automovil);   //
        for (Automovil display: automoviles) {
            if (automovil instanceof  Microbus){  // utlizamos el instance of para verifiar el tipo de objeto que ingresamos
                JOptionPane.showMessageDialog(null,"Agregando un Microbus");
            }
            else{
                JOptionPane.showMessageDialog(null,"Agregando un Motocicleta ");
            }
        }
    }

    // Metodos getter para retornar el valor
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPatente() {
        return patente;
    }


    // Metodo para mostrarDatos
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null,"Marca : " + getMarca() + ", Modelo : " + getModelo() + " Patente : " + getPatente());
    }


}
