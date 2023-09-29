public class Dueno {
    int edad=0;
    String nombre = "";
    String cedula = "";

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
}

