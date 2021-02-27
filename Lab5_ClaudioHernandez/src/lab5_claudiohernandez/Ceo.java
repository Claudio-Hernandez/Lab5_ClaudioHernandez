/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_claudiohernandez;

/**
 *
 * @author Claudio Hernandez
 */
public class Ceo {
    /*
     El CEO siendo la persona con mayor 
     * autoridad posee Nombre, número de registro,
     * apellido, nacionalidad, título universitario, 
     * edad, años de experiencia, y cantidad de años que lleva laborando
     
     
     
     */
    private String nombre;
    private int noRegistro;
    private String apellido;
    private String nacionalidad;
    private String titulo;
    private int edad;
    private int aniosExperiencia;
    private int anioslaborado;
    private String usuario,contraseña;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    

    public Ceo() {
    }

    public Ceo(String nombre, int noRegistro, String apellido, String nacionalidad, String titulo, int edad, int aniosExperiencia, int anioslaborado,String usuario,String contra) {
        this.nombre = nombre;
        this.noRegistro = noRegistro;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.titulo = titulo;
        this.edad = edad;
        this.aniosExperiencia = aniosExperiencia;
        this.anioslaborado = anioslaborado;
        this.usuario =  usuario;
        this.contraseña =  contra;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNoRegistro() {
        return noRegistro;
    }

    public void setNoRegistro(int noRegistro) {
        this.noRegistro = noRegistro;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public int getAnioslaborado() {
        return anioslaborado;
    }

    public void setAnioslaborado(int anioslaborado) {
        this.anioslaborado = anioslaborado;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
    
}
