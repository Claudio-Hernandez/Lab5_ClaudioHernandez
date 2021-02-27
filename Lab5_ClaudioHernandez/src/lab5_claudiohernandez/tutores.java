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
public class tutores extends estudiante {

    private String clase,tutoreLabsoNo;

    public tutores() {
    }

    public tutores(String clase, String tutoreLabsoNo) {
        this.clase = clase;
        this.tutoreLabsoNo = tutoreLabsoNo;
    }

    public tutores(String clase, String tutoreLabsoNo, String nombre, String apellido, String carrera, String perteneceAequipo, String facultadPertenece, String beca, String automovil, int clasesCursar, int numeroRegistro,String usuario, String contraseña) {
        super(nombre, apellido, carrera, perteneceAequipo, facultadPertenece, beca, automovil, clasesCursar, numeroRegistro,usuario,contraseña);
        this.clase = clase;
        this.tutoreLabsoNo = tutoreLabsoNo;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    

   
}
