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
public class estudiante {
    /*
    Del estudiante se conoce que posee Nombre, número de registro, apellido, carrera que estudia,
    si pertenece a un equipo de deporte, facultad a la que pertenece, 
    cantidad de clases por cursar, si posee beca o no y si posee automóvil o no. 
    
    
    
    */
    private String nombre,apellido,carrera,perteneceAequipo,facultadPertenece,beca,automovil;
    private int clasesCursar,numeroRegistro;
    protected String usuario,contraseña;

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
    public estudiante() {
    }

    public estudiante(String nombre, String apellido, String carrera, String perteneceAequipo, String facultadPertenece, String beca, String automovil, int clasesCursar, int numeroRegistro,String u, String c) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.perteneceAequipo = perteneceAequipo;
        this.facultadPertenece = facultadPertenece;
        this.beca = beca;
        this.automovil = automovil;
        this.clasesCursar = clasesCursar;
        this.numeroRegistro = numeroRegistro;
        this.usuario =  u;
        this.contraseña=c;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getPerteneceAequipo() {
        return perteneceAequipo;
    }

    public void setPerteneceAequipo(String perteneceAequipo) {
        this.perteneceAequipo = perteneceAequipo;
    }

    public String getFacultadPertenece() {
        return facultadPertenece;
    }

    public void setFacultadPertenece(String facultadPertenece) {
        this.facultadPertenece = facultadPertenece;
    }

    public String getBeca() {
        return beca;
    }

    public void setBeca(String beca) {
        this.beca = beca;
    }

    public String getAutomovil() {
        return automovil;
    }

    public void setAutomovil(String automovil) {
        this.automovil = automovil;
    }

    public int getClasesCursar() {
        return clasesCursar;
    }

    public void setClasesCursar(int clasesCursar) {
        this.clasesCursar = clasesCursar;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    @Override
    public String toString() {
        return  nombre ;
    }
    
}
