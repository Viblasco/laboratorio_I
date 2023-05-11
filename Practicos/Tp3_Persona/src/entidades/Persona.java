package entidades;



import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Persona {

    protected String nombre;

    protected int dni;

    protected String fechaNac;

    protected String domicilio;

    public Persona(String nombre, int dni, String fechaNac, String domicilio) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNac = fechaNac;
        this.domicilio = domicilio;
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

    
    
    public long calcularEdad(String fechaNac) {
        LocalDate hoy = LocalDate.now();   
        LocalDate nac =LocalDate.parse(fechaNac);
         long edad = ChronoUnit.YEARS.between(nac, hoy);
        return edad;
      }

    public long diasVividos(String fechaNac) {
        LocalDate hoy = LocalDate.now();   
        LocalDate nac =LocalDate.parse(fechaNac);
         long edad = ChronoUnit.DAYS.between(nac, hoy);
        return edad;
    }

    public abstract void cobrar();
}
