package org.example;

public class Persona {

    private String nombre;
    private String apellido;
    private String dni;
    private char sexo;
    private int edad;
    private String ciudad;
    private String profesion;

    public Persona(){

    }

    public Persona(String nombre, String apellido, String dni, char sexo, int edad, String ciudad, String profesion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sexo = sexo;
        this.edad = edad;
        this.ciudad = ciudad;
        this.profesion = profesion;
    }
    
    public String getCiudad(){
        return this.ciudad;
    }

    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }

    public String getProfesion(){
        return this.profesion;
    }

    public void setProfesion(String profesion){
        this.profesion = profesion;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        if(!nombre.equalsIgnoreCase("messi")) {
            this.nombre = nombre;
        };
    }

    public String getApellido(){
        return this.apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getDni(){
        return this.dni;
    }

    public void setDni(String dni){
        this.dni = dni;
    }

    public char getSexo(){
        return this.sexo;
    }

    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public String concatenar(){
        return this.nombre +" "+ this.apellido;
    }

    public void mostrarInfo(){
        System.out.println(this.nombre +" "+ this.apellido +" "+ this.dni +" "+ this.sexo +" "+ this.edad);
    }


}
