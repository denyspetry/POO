package org.example;

import java.util.ArrayList;

public class Estudiante {

    public static int contadorEstudiantes = 0;

    private String nombre;
    private String curso;
    private int nia;
    private String email;
    private ArrayList<Libro> librosPrestados;

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
        librosPrestados = new ArrayList<>();
    }

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

    public static int obtenerTotalEstudiantes(){
        return contadorEstudiantes;
    }

    @Override
    public String toString(){

        if (!librosPrestados.isEmpty()){
            return "Estudiante : [ nombre = " + getNombre() + " curso = " + getCurso() + " nia = " + getNia();
        } else {
            return "Estudiante : [ nombre = " + getNombre() + " curso = " + getCurso() + " nia = " + getNia();
        }
    }

    public arrayList<Libro> getLibroPrestado() {
        return ;
    }

    public void setLibroPrestado(arrayList<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    public void anyadirLibro(Libro libro){
        librosPrestados.add(libro);
    }

    public void borrarLibro(Libro libro){
        librosPrestados.remove(libro);
    }

}
