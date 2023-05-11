package entidades;

import java.time.LocalDate;

public class Trabajador extends Persona implements Activo {

    private int sueldo;

    private boolean aporte = true;

    public Trabajador(int sueldo, boolean aporte, String nombre, int dni, String fechaNac, String domicilio) {
        super(nombre, dni, fechaNac, domicilio);
        this.sueldo = sueldo;
        this.aporte = aporte;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isAporte() {
        return aporte;
    }

    public void setAporte(boolean aporte) {
        this.aporte = aporte;
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
        System.out.println("El monto a cobrar es: "+sueldo);
    }

    @Override
    public void hacerAporte() {
        System.out.println("El trabajador aporto");
    }
}
