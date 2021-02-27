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
public class personalConsejocademico {
    /*
    Del personal del consejo académico, se conoce que posee Nombre, número de registro, apellido, cargo, puesto dentro del consejo asesor, cantidad de becados que posee
    , número de personas a su cargo, lugar de su segundo trabajo, cargo de su segundo trabajo y nombre del acuerdo que tiene con la universidad.
    
    
    */
    private String nombre,apellido,cargo,puestodelConsejo,cantidadBecados,personasCargo,lugarSegundoTrabajo,cargoSegundoTrabajo,nombreAcuerdo;
    private int numeroRegistro;

    public personalConsejocademico() {
    }

    public personalConsejocademico(String nombre, String apellido, String cargo, String puestodelConsejo, String cantidadBecados, String personasCargo, String lugarSegundoTrabajo, String cargoSegundoTrabajo, String nombreAcuerdo, int numeroRegistro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.puestodelConsejo = puestodelConsejo;
        this.cantidadBecados = cantidadBecados;
        this.personasCargo = personasCargo;
        this.lugarSegundoTrabajo = lugarSegundoTrabajo;
        this.cargoSegundoTrabajo = cargoSegundoTrabajo;
        this.nombreAcuerdo = nombreAcuerdo;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getPuestodelConsejo() {
        return puestodelConsejo;
    }

    public void setPuestodelConsejo(String puestodelConsejo) {
        this.puestodelConsejo = puestodelConsejo;
    }

    public String getCantidadBecados() {
        return cantidadBecados;
    }

    public void setCantidadBecados(String cantidadBecados) {
        this.cantidadBecados = cantidadBecados;
    }

    public String getPersonasCargo() {
        return personasCargo;
    }

    public void setPersonasCargo(String personasCargo) {
        this.personasCargo = personasCargo;
    }

    public String getLugarSegundoTrabajo() {
        return lugarSegundoTrabajo;
    }

    public void setLugarSegundoTrabajo(String lugarSegundoTrabajo) {
        this.lugarSegundoTrabajo = lugarSegundoTrabajo;
    }

    public String getCargoSegundoTrabajo() {
        return cargoSegundoTrabajo;
    }

    public void setCargoSegundoTrabajo(String cargoSegundoTrabajo) {
        this.cargoSegundoTrabajo = cargoSegundoTrabajo;
    }

    public String getNombreAcuerdo() {
        return nombreAcuerdo;
    }

    public void setNombreAcuerdo(String nombreAcuerdo) {
        this.nombreAcuerdo = nombreAcuerdo;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
