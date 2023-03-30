package Registro;

import static Registro.RegistroUsuario.*;

public class ValidarCampos {
    private static String nombreUsuario;
    private static boolean esValido;
    private static String email;
    private static String password;
    private static String codigo = "";
    private static String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@#_-";

    /**
     * @author Metodo para comprobar si el nombre és válido.
     * @return Constructor
     */
    public static String compruebaNombre(String [] usuarios) {
        do {
            System.out.print("Introduce tu nombre: ");
            nombreUsuario = scanner.nextLine();
            esValido = true;
            /**
             * @author Comprobamos que cumple con los requisitos.
             * @return Constructor
             */
            if (!nombreUsuario.matches("^[A-Z][a-z]+[_-]\\d{3}$") || nombreUsuario.length() > 16) {
                System.out.println("El nombre no cumple con los requisitos.");
                esValido = false;
            }
            /**
             * @author Comprobar que no esté en uso.
             * @return Constructor
             */
            for (String n : nombres) {
                if (n.equals(nombreUsuario)) {
                    System.out.println("El nombre ya está en uso.");
                    esValido = false;
                    break;
                }
            }
        } while (!esValido);
        return nombreUsuario;
    }
    /**
     * @author Metodo para comprobar si el email és válido.
     * @return Constructor
     */
    public static String compruebaEmail() {
        boolean esValido;
        do {
            System.out.print("Introduce tu email: ");
            email = scanner.nextLine();
            esValido = true;
            // Comprobamos que cumple con los requisitos.
            if (!email.matches("^[a-zA-Z0-9._%+-]+@(paucasesnovescifp|yahoo|gmail|hotmail)\\.(com|es|cat)$")) {
                System.out.println("El email no cumple con los requisitos.");
                esValido = false;
            }
        } while (!esValido);
        return email;
    }

    public static String compruebaPassword() {
        boolean esValido;
        do {
            System.out.print("Introduce tu password: ");
            password = scanner.nextLine();
            esValido = true;
            if (!password.matches("^[A-Z][a-zA-Z0-9@#_-]{6}[0-9]{2}$")) {
                System.out.println("El password no cumple con los requisitos.");
                esValido = false;
            }
        } while (!esValido);
        return password;
    }

    public static String generaCodigoSeguridad() {
        for (int i = 0; i < 8; i++) {
            codigo += caracteres.charAt(random.nextInt(caracteres.length()));
        }
        System.out.println("El código de seguridad es: " + codigo);
        String codigoUsuario;
        do {
            System.out.print("Introduce el código de seguridad: ");
            codigoUsuario = scanner.nextLine();
            if (!codigoUsuario.equals(codigo)) {
                System.out.println("El código de seguridad no coincide.");
            }
        } while (!codigoUsuario.equals(codigo));
        return codigo;
    }

    /**
     * @author Hernán Sandoval
     * @return Constructor
     */
    public ValidarCampos(String nombreUsuario, String email, String codigo, String password, String caracteres) {
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.codigo = codigo;
        this.password = password;
        this.caracteres = caracteres;
    }
}

