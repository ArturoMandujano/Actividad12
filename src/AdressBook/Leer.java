package AdressBook;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Clase para gestionar entrada de datos y validaciones
 *
 * @author DiscoDurodeRoer
 */
public class Leer {

    //Scanner para pedir datos
    private Scanner sc;

    /**
     * Por defecto
     */
    public Leer() {
        sc = new Scanner(System.in);
        sc.useDelimiter("\n"); //Usado para nextLine()
        sc.useLocale(Locale.US); // Para double
    }

    /**
     * Nos pide un valor númerico, valida si es un valor numerico
     *
     * @return numero entero byte introducido por el usuario
     */
    public byte pedirByte() {

        byte num = 0;
        boolean correcto;
        do {
            correcto = true;
            try {
                System.out.println("Introduce un numero entero byte");
                num = sc.nextByte();
            } catch (InputMismatchException ex) {
                // En caso de error, se marca como incorrecto
                correcto = false;
                sc.next();
            }

            //En caso de error, muestro el error
            if (!correcto) {
                System.out.println("Error, introducce un numero entero byte");
            }

        } while (!correcto);

        return num;
    }

    /**
     * Nos pide un valor númerico, valida si es un valor numerico
     *
     * @param mensaje
     * @return numero entero byte introducido por el usuario
     */
    public byte pedirByte(String mensaje) {

        byte num = 0;
        boolean correcto;
        do {
            correcto = true;
            try {
                System.out.println(mensaje);
                num = sc.nextByte();
            } catch (InputMismatchException ex) {
                // En caso de error, se marca como incorrecto
                correcto = false;
                sc.next();
            }

            //En caso de error, muestro el error
            if (!correcto) {
                System.out.println("Error, introducce un numero entero byte");
            }

        } while (!correcto);

        return num;
    }
