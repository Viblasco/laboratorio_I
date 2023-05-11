package entidades;

public class Registro {

    public Registro() {
    }

    public void procesarDatos(Persona p) {
        
        if(p instanceof Trabajador){
            Trabajador t1 =(Trabajador)p;
            System.out.println("Nombre: "+ t1.getNombre()+ " Edad: "+ t1.calcularEdad(t1.getFechaNac()));
            t1.cobrar();
            t1.hacerAporte();
           
    }else{
          Jubilado j1 =(Jubilado)p;
           System.out.println("Nombre: "+ j1.getNombre()+ " Dias Vividos: "+ j1.diasVividos(j1.getFechaNac()));
            j1.cobrar();
        }
       
    }
}
