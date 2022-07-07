/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author R4NU54
 */
public class Ejercicios_tema_8 {

    public static void main(String[] args) {

        // Se crea una nueva instancia de la clase Persona, se le dan valores y se imprimen por consola.
        Persona miPersona = new Persona();

        miPersona.setNombre("Raúl");
        miPersona.setEdad(45);
        miPersona.setTelefono(654000111);

        System.out.println("Mi nombre es " + miPersona.getNombre() + " y tengo " + miPersona.getEdad() + " años. Este es mi telefono: " + miPersona.getTelefono());
    }
}

class Persona {

    private int edad = 0;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

}
