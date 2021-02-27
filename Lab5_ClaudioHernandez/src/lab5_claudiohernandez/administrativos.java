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
public class administrativos {
    /*
    De los administrativos se conoce posee Nombre, número de registro,
    apellido, cargo, área a la que este asignado, cantidad de subordinados,
    nombre del asistente y nombre del jefe asignado
    
    
    */
    private String nombre,apellido,cargo,areaAsignado,nombreDeAsistente,jefeAsignado;
    private String numRegistro,cantidadSubordinados;
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
    public administrativos() {
    }

    public administrativos(String nombre, String apellido, String cargo, String areaAsignado, String nombreDeAsistente, String jefeAsignado, String numRegistro, String cantidadSubordinados,String usuario,String contra) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.areaAsignado = areaAsignado;
        this.nombreDeAsistente = nombreDeAsistente;
        this.jefeAsignado = jefeAsignado;
        this.numRegistro = numRegistro;
        this.cantidadSubordinados = cantidadSubordinados;
        this.usuario =  usuario;
        this.contraseña = contra;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getAreaAsignado() {
        return areaAsignado;
    }

    public void setAreaAsignado(String areaAsignado) {
        this.areaAsignado = areaAsignado;
    }

    public String getNombreDeAsistente() {
        return nombreDeAsistente;
    }

    public void setNombreDeAsistente(String nombreDeAsistente) {
        this.nombreDeAsistente = nombreDeAsistente;
    }

    public String getJefeAsignado() {
        return jefeAsignado;
    }

    public void setJefeAsignado(String jefeAsignado) {
        this.jefeAsignado = jefeAsignado;
    }

    public String getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(String numRegistro) {
        this.numRegistro = numRegistro;
    }

    public String getCantidadSubordinados() {
        return cantidadSubordinados;
    }

    public void setCantidadSubordinados(String cantidadSubordinados) {
        this.cantidadSubordinados = cantidadSubordinados;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
}
