package Registro;

import java.util.Scanner;
import java.util.Random;

import static Registro.ValidarCampos.*;

/**
 * @author Tomas
 */

public class RegistroUsuario {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static String[] nombres = {"Juan", "María", "Pedro", "Lucía", "Luis", "Ana", "Diego", "Laura", "Carlos", "Elena"};

    public static void main(String[] args) {
        String nombre = compruebaNombre();
        String email = compruebaEmail();
        String password = compruebaPassword();
        String codigo = generaCodigoSeguridad();

        System.out.println("El registro se ha realizado con éxito.");
        System.out.println("Nombre: " + nombre);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Código de seguridad: " + codigo);
    }
}
