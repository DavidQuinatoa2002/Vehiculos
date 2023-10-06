public class Motor {
    private double cilindraje=0;
    private String combustible="";

    public Motor(double cilindraje, String combustible) {
        this.cilindraje = cilindraje;
        this.combustible = combustible;
    }

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

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public void imprimirDatosMotor(){
        System.out.println("EL clininfdraje del motor es: "+cilindraje);
        System.out.println("EL gasolina del motor es: "+combustible);
    }
}



//modificadores de accesibilidades, todos los metodos deben ser publicos