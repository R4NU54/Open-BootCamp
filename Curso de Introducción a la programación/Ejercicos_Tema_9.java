/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author R4NU54
 */
public class Ejercicos_Tema_9 {

    public static void main(String[] args) {

        // Se crea una nueva instancia de la clase Persona, se le dan valores y se imprimen por consola.
        Cliente miCliente = new Cliente();

        miCliente.setNombre("Raúl");
        miCliente.setEdad(45);
        miCliente.setTelefono(654000111);
        miCliente.setCredito(1000);

        System.out.println("Mi nombre es " + miCliente.getNombre() + " y tengo " + miCliente.getEdad() + " años. Este es mi telefono: " + miCliente.getTelefono());
        System.out.println("El credito asciende a: " + miCliente.getCredito() + " €");

        Trabajador miTrabajador = new Trabajador();

        miTrabajador.setNombre("Pablo Hernandez");
        miTrabajador.setEdad(38);
        miTrabajador.setTelefono(615007854);
        miTrabajador.setSalario(1500);

        System.out.println("Trabajador: " + miTrabajador.getNombre());
        System.out.println("Edad: " + miTrabajador.getEdad() + " años.");
        System.out.println("Telefono de contacto: " + miTrabajador.getTelefono());
        System.out.println("Salario: " + miTrabajador.getSalario() + " €");

    }
}

class Persona {

    private int edad;
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

class Cliente extends Persona {

    private int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

}

class Trabajador extends Persona {

    int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

}
