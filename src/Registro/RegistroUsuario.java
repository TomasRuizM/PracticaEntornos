package Registro;



import java.util.Scanner;
import java.util.Random;

import static Registro.ValidarCampos.*;


/**
 * @author tomas
 * Clase que declara el scanner y el random.
 * @version 1.0
 */
public class RegistroUsuario {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    private static String nombreUsuario;

    /**
     * Main donde se llama a los atributos de la clase ValidarCampos.
     * @author tomas
     */
    public static void main(String[] args) {
        String nombreUsuario = compruebaNombre(getNombreDeUsuario());
        String email = compruebaEmail();
        String password = compruebaPassword();
        String codigo = generaCodigoSeguridad();

        //Llamada al metodo donde estan los prints
        extracted(nombreUsuario, email, password, codigo);
    }

    private static void extracted(String nombreUsuario, String email, String password, String codigo) {
        init(nombreUsuario, email, password, codigo);
    }

    /**
     * Metodo con las sentencias que operan con los objetos de la clase ValidarCampos.
     * Devuelve los datos introducidos por el usuario
     *
     */
    private static void init(String nombreUsuario, String email, String password, String codigo) {
        System.out.println("El registro se ha realizado con éxito.");
        System.out.println("Nombre: " + nombreUsuario);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Código de seguridad: " + codigo);
    }
}
