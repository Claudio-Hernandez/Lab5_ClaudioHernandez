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
public class personalPlanta {
    /*
    Del personal de planta, se conoce Nombre, número de registro, apellido, cargo, facultad a la que pertenece, carrera a la cual está asignado y clase a la que este asignado.  
    
    */
    private String nombre,apellido,carreraAsignado,cargo,facultadPertenece,claseAsignado;
    private String numeroRegistro;
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
    public personalPlanta(String nombre, String apellido, String carreraAsignado, String cargo, String facultadPertenece, String claseAsignado, String numeroRegistro,String u ,String c) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carreraAsignado = carreraAsignado;
        this.cargo = cargo;
        this.facultadPertenece = facultadPertenece;
        this.claseAsignado = claseAsignado;
        this.numeroRegistro = numeroRegistro;
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

    public String getCarreraAsignado() {
        return carreraAsignado;
    }

    public void setCarreraAsignado(String carreraAsignado) {
        this.carreraAsignado = carreraAsignado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFacultadPertenece() {
        return facultadPertenece;
    }

    public void setFacultadPertenece(String facultadPertenece) {
        this.facultadPertenece = facultadPertenece;
    }

    public String getClaseAsignado() {
        return claseAsignado;
    }

    public void setClaseAsignado(String claseAsignado) {
        this.claseAsignado = claseAsignado;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    @Override
    public String toString() {
        return  nombre ;
    }
    
}
