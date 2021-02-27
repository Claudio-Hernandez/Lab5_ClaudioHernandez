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
public class docente {
    /*
    Del docente se conoce que posee Nombre, número de registro, apellido, clase a la cual este asignado, 
    facultad a la que este asignado, si trabaja o no en distintas facultades, 
    área de conocimiento a la cual pertenece y si su clase posee laboratorio o no.
    
    
    
    */
    private String nombre,apellido,claseAsignado,factuldadAsignado,trabajaONoOtrasFacultades,areaConocimiento,labenSuClase;
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
    public docente() {
    }

    public docente(String nombre, String apellido, String claseAsignado, String factuldadAsignado, String trabajaONoOtrasFacultades, String areaConocimiento, String labenSuClase, String numeroRegistro,String u, String c) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.claseAsignado = claseAsignado;
        this.factuldadAsignado = factuldadAsignado;
        this.trabajaONoOtrasFacultades = trabajaONoOtrasFacultades;
        this.areaConocimiento = areaConocimiento;
        this.labenSuClase = labenSuClase;
        this.numeroRegistro = numeroRegistro;
        this.usuario= u;
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

    public String getClaseAsignado() {
        return claseAsignado;
    }

    public void setClaseAsignado(String claseAsignado) {
        this.claseAsignado = claseAsignado;
    }

    public String getFactuldadAsignado() {
        return factuldadAsignado;
    }

    public void setFactuldadAsignado(String factuldadAsignado) {
        this.factuldadAsignado = factuldadAsignado;
    }

    public String getTrabajaONoOtrasFacultades() {
        return trabajaONoOtrasFacultades;
    }

    public void setTrabajaONoOtrasFacultades(String trabajaONoOtrasFacultades) {
        this.trabajaONoOtrasFacultades = trabajaONoOtrasFacultades;
    }

    public String getAreaConocimiento() {
        return areaConocimiento;
    }

    public void setAreaConocimiento(String areaConocimiento) {
        this.areaConocimiento = areaConocimiento;
    }

    public String getLabenSuClase() {
        return labenSuClase;
    }

    public void setLabenSuClase(String labenSuClase) {
        this.labenSuClase = labenSuClase;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    @Override
    public String toString() {
        return   nombre ;
    }
    
}
