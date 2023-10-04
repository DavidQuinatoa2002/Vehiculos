public class Auto {

    private int numerollantas=0;
    String color="";
    private int puertas=0;

    //Motor = objeto
    // motor = atributo
    //poner a clase dueno en clase auto como atributo
    private Motor motor;

    public int getNumerollantas() {
        return numerollantas;
    }

    public void setNumerollantas(int numerollantas) {
        this.numerollantas = numerollantas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Dueno getDueno() {
        return dueno;
    }

    public void setDueno(Dueno dueno) {
        this.dueno = dueno;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    private Dueno dueno;

    public void imprimirColoPuertas(){
        System.out.println("El color del vehiculo es: "+color+"y el numero de puertas es: "+puertas);//imprimir variables concatenadas
    }



}
