public class Dueno {
    private int edad=0;
    private String nombre = "";
    private String cedula = "";

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

