package Registro;

import static Registro.RegistroUsuario.*;

public class ValidarCampos {
    private static String nombre ;
    private static String nombreUsuario;
    private static boolean esValido;
    private static String email;
    private static String password;
    private static String codigo = "";
    private static String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@#_-";



    public static String compruebaNombre() {
        do {
            System.out.print("Introduce tu nombre: ");
            setNombreUsuario(scanner.nextLine());
            setEsValido(true);
            if (!getNombreUsuario().matches("^[A-Z][a-z]+[_-]\\d{3}$") || getNombreUsuario().length() > 16) {
                System.out.println("El nombre no cumple con los requisitos.");
                setEsValido(false);
            }
            for (String n : nombres) {
                if (n.equals(getNombreUsuario())) {
                    System.out.println("El nombre ya está en uso.");
                    setEsValido(false);
                    break;
                }
            }
        } while (!isEsValido());
        return getNombreUsuario();
    }


    public static String compruebaEmail() {
        do {
            System.out.print("Introduce tu email: ");
            setEmail(scanner.nextLine());
            setEsValido(true);
            if (!getEmail().matches("^[a-zA-Z0-9._%+-]+@(paucasesnovescifp|yahoo|gmail|hotmail)\\.(com|es|cat)$")) {
                System.out.println("El email no cumple con los requisitos.");
                setEsValido(false);
            }
        } while (!isEsValido());
        return getEmail();
    }

    /**
     * @author Ruben
     * @return Este metodo recoge la password y comprueba que sigue el patron recojido
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
     * @author Ruben
     *
     * @return Metodo que genera el codigo de seguridad y comprueba que el codigo es correcto
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
     * @author Ruben
     *
     * @return El constructor de todos los atributos
     *
     * @param nombre
     * @param email
     * @param password
     * @param codigo
     */
    public ValidarCampos(String nombre, String email, String password, String codigo) {
        ValidarCampos.nombre = nombre;
        ValidarCampos.email = email;
        ValidarCampos.password = password;
        ValidarCampos.codigo = codigo;
    }

    /**
     *
     * @author Ruben
     *
     * @return Encapsulamiento de todos los atributos
     */
    public static String getNombreUsuario() {
        return nombreUsuario;
    }

    public static void setNombreUsuario(String nombreUsuario) {
        ValidarCampos.nombreUsuario = nombreUsuario;
    }

    public static boolean isEsValido() {
        return esValido;
    }

    public static void setEsValido(boolean esValido) {
        ValidarCampos.esValido = esValido;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        ValidarCampos.email = email;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        ValidarCampos.password = password;
    }

    public static String getCodigo() {
        return codigo;
    }

    public static void setCodigo(String codigo) {
        ValidarCampos.codigo = codigo;
    }

    public static String getCaracteres() {
        return caracteres;
    }

    public static void setCaracteres(String caracteres) {
        ValidarCampos.caracteres = caracteres;
    }
}

