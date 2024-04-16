import java.util.Scanner;
public class Teclado {

    public static  void main  (String [] args ){
        //declarando el objeto scanner
        Scanner obj = new Scanner(System.in);
        byte numero, operacion;
        System.out.println("Ingresa Un numero: ");
        numero = obj.nextByte();

        //Realizacion de una operación
        operacion = (byte)(numero * 2);

        System.out.println("El numero ingresado multiplicado por dos es : "+ operacion);
    }
    
}
