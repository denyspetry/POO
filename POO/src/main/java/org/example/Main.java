package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Paco","Ruiz","79834562W",'H',45);

        //System.out.println(persona1.nombre +" "+ persona1.apellido +" "+ persona1.dni +" "+ persona1.sexo +" "+ persona1.edad);
        //System.out.println(persona2.nombre +" "+ persona2.apellido +" "+ persona2.dni +" "+ persona2.sexo +" "+ persona2.edad);

        System.out.println(persona2.concatenar());

        persona1.mostrarInfo();
        persona2.mostrarInfo();

        System.out.println("La edad de " + persona2.getNombre() + " es " + persona2.getEdad());
        persona1.setApellido("Sin nombre");
        System.out.println(persona1.getApellido());
        persona1.setNombre("Messi");
        System.out.println(persona1.getNombre());
         */
        /*
        Paciente paciente1 = new Paciente("Luis",45,'H',90, 1.90);

        paciente1.imprimirInfo();
        Paciente paciente2 = new Paciente();
        paciente2.imprimirInfo();
         */

        //Estudiante estudiante1 = new Estudiante("Paco");

        Persona persona1 = new Persona("Marta","Poveda","12345678W",'M',23);
        Equipo equipo1 = new Equipo("Barstra");
        System.out.println(persona1);
        System.out.println(equipo1);


    }
}