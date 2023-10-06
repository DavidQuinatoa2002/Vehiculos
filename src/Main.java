// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //instanciar clases para pasar a objeto
        Auto auto1 = new Auto();
        //auto1.puertas=10;//accedo a una varible fuera del, no es encasullar
        //encapsulamineto
        auto1.setPuertas(10);
        //auto1.color="Blanco";
        auto1.setColor("Blanco");
        auto1.imprimirColorPuertas();

        Auto auto2 = new Auto(4, "Rojo", 3);
        auto2.imprimirColorPuertas();

        Dueno dueno1=new Dueno(30,"luis","0122255225");
        dueno1.imprimirDatosDuenio();

        Motor motor1 = new Motor(2.0,"gasolina");
        motor1.imprimirDatosMotor();


        auto1.setMotor(motor1);
        auto1.getMotor().imprimirDatosMotor();
        auto1.setDueno(dueno1);
        //auto1.getDueno().imprimirDatosDueno();




    }
}