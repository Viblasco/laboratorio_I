package entidades;

import java.time.LocalDate;

public class Jubilado extends Persona {

    public Jubilado(String nombre, int dni, String fechaNac, String domicilio) {
        super(nombre, dni, fechaNac, domicilio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    

    @Override
    public void cobrar() {
        System.out.println("Cobrando mi jubilación");
    }
}
