public class Motor {
    double cilindraje=0;
    String combustible="";


   public double caballosFuerza(){
        double cf=0;
        if(combustible.equals("Diesel")){
            //equals sirve para comparar siempre con un string
            cf=10.5;
        }else{
            cf=5.2;
        }
        return cf;
    }
}



//modificadores de accesibilidades, todos los metodos deben ser publicos