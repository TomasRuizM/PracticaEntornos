package Registro;

import static Registro.RegistroUsuario.*;
/**
 * Esta clase consta de 4 metodos que pediran a partir de scaners informacion como el nombre
 * y tendra que comprobar que el nombre no existe en la base de datos y a la vez que toda la informacion
 * introducida por teclado cumpla con el patron establecido.
 * Tambien tiene los atributos encapsulados con su respectivos constructores
 *
 * @author Ruben Y Hernan
 * @version 1.0
 */
public class ValidarCampos {

    private static String nombreDeUsuario;
    private static boolean esValido;
    private static String email;
    private static String password;
    private static String codigo = "";
    private static String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@#_-";

    private static String[] nombres = {"Juan", "María", "Pedro", "Lucía", "Luis", "Ana", "Diego", "Laura", "Carlos", "Elena"};

    /**
     *  Metodo para comprobar el nombre.
     *
     */

    public static String compruebaNombre(String nombreDeUsuario) {
        do {
            System.out.print("Introduce tu nombre: ");
            setNombreDeUsuario(scanner.nextLine());
            setEsValido(true);
            /**
             *  El nombre debe cumplir los requisitos y no debe existir.
             *
             */

            if (!getNombreDeUsuario().matches("^[A-Z][a-z]+[_-]\\d{3}$") || getNombreDeUsuario().length() > 16) {
                System.out.println("El nombre no cumple con los requisitos.");
                setEsValido(false);
            }
            for (String n : nombres) {
                if (n.equals(getNombreDeUsuario())) {
                    System.out.println("El nombre ya está en uso.");
                    setEsValido(false);
                    break;
                }
            }
        } while (!isEsValido());
        return getNombreDeUsuario();
    }

    /**
     *  Metodo para comprobar el email.
     *
     */

    public static String compruebaEmail() {
        do {
            System.out.print("Introduce tu email: ");
            setEmail(scanner.nextLine());
            setEsValido(true);
            /**
             *  El email debe cumplir los requisitos.
             *
             */

            if (!getEmail().matches("^[a-zA-Z0-9._%+-]+@(paucasesnovescifp|yahoo|gmail|hotmail)\\.(com|es|cat)$")) {
                System.out.println("El email no cumple con los requisitos.");
                setEsValido(false);
            }
        } while (!isEsValido());
        return getEmail();
    }

    /**
     *
     *  Este metodo recoge la password y comprueba que sigue el patron recojido
     */
    public static String compruebaPassword() {
        do {
            System.out.print("Introduce tu password: ");
            setPassword(scanner.nextLine());
            setEsValido(true);
            if (!getPassword().matches("^[A-Z][a-zA-Z0-9@#_-]{6}[0-9]{2}$")) {
                System.out.println("El password no cumple con los requisitos.");
                setEsValido(false);
            }
        } while (!isEsValido());
        return getPassword();
    }


    /**
     *
     *
     *  Metodo que genera el codigo de seguridad y comprueba que el codigo es correcto
     */
    public static String generaCodigoSeguridad() {
        for (int i = 0; i < 8; i++) {
            setCodigo(getCodigo() + getCaracteres().charAt(random.nextInt(getCaracteres().length())));
        }
        System.out.println("El código de seguridad es: " + getCodigo());
        String codigoUsuario;
        do {
            System.out.print("Introduce el código de seguridad: ");
            codigoUsuario = scanner.nextLine();
            if (!codigoUsuario.equals(getCodigo())) {
                System.out.println("El código de seguridad no coincide.");
            }
        } while (!codigoUsuario.equals(getCodigo()));
        return getCodigo();
    }

    /**
     *
     *
     *  El constructor de todos los atributos
     *
     * @param nombre
     * @param email
     * @param password
     * @param codigo
     */
    public ValidarCampos(String nombre, String email, String password, String codigo) {
        ValidarCampos.nombreDeUsuario = nombre;
        ValidarCampos.email = email;
        ValidarCampos.password = password;
        ValidarCampos.codigo = codigo;
    }

    /**
     *  Getter para el nombre
     */
    public static String getNombreDeUsuario() {
        return nombreDeUsuario;
    }
    /**
     *  Setter para el nombre
     */
    public static void setNombreDeUsuario(String nombreDeUsuario) {
        ValidarCampos.nombreDeUsuario = nombreDeUsuario;
    }

    public static boolean isEsValido() {
        return esValido;
    }
    /**
     *  Setter del atributo "EsValido"
     */
    public static void setEsValido(boolean esValido) {
        ValidarCampos.esValido = esValido;
    }
    /**
     *  Getter para el email
     */
    public static String getEmail() {
        return email;
    }
    /**
     *  Setter para el email
     */
    public static void setEmail(String email) {
        ValidarCampos.email = email;
    }
    /**
     *  Getter para la password
     */
    public static String getPassword() {
        return password;
    }
    /**
     *  Setter para la password
     *
     */
    public static void setPassword(String password) {
        ValidarCampos.password = password;
    }
    /**
     *  Getter para el codigo
     */
    public static String getCodigo() {
        return codigo;
    }
    /**
     *  Setter para el codigo
     *
     */
    public static void setCodigo(String codigo) {
        ValidarCampos.codigo = codigo;
    }
    /**
     *  Getter para los caracteres
     */
    public static String getCaracteres() {
        return caracteres;
    }
    /**
     *  Setter para los caracteres
     *
     */
    public static void setCaracteres(String caracteres) {
        ValidarCampos.caracteres = caracteres;
    }
}

