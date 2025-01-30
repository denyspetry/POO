package org.example;

public class Estudiante {

    public static int contadorEstudiantes = 0;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNia() {
        return nia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String nombre;
    private String curso;
    private int nia;
    private String email;

    public Estudiante(String nombre, String curso, String email){
        this.nombre = nombre;
        this.curso = curso;
        this.email = email;
        contadorEstudiantes++;
        this.nia = contadorEstudiantes; // Se puede quitar el this por que no hay ningún parametro con el que confundirlo
    }

    public Estudiante(String nombre){
        this.nombre = nombre;
        contadorEstudiantes++;
        nia = contadorEstudiantes;
    }

    public static int obtenerTotalEstudiantes(){
        return contadorEstudiantes;
    }

    @Override
    public String toString(){
        return "Estudiante : [ nombre = " + getNombre() + " curso = " + getCurso() + " nia = " + getNia();
    }
}
