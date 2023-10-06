public class Dueno {
    private int edad=0;
    private String nombre = "";
    private String cedula = "";


    public Dueno(int edad, String nombre, String cedula) {
        this.edad = edad;
        this.nombre = nombre;
        this.cedula = cedula;
    }



    public String esMayorEdad(){
        String my="";
        if(edad>=18){
            my="Es mayor de edad";
            System.out.println(my);

        }else{
            my="Es menor de edad";
            System.out.println(my);
        }
        return my;
    }

    public void imprimirDatosDuenio(){
        System.out.println("El nombre del duenio es:"+nombre);
        System.out.println("El cediula del duenio es:"+cedula);
        System.out.println("El nombre del duenio es:"+edad);
    }
}

