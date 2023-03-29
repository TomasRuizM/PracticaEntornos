package Registro;

public class validarCampos {
<<<<<<< HEAD
    public static String compruebaNombre() {
        String nombre;
        boolean esValido;
        do {
            System.out.print("Introduce tu nombre: ");
            nombre = scanner.nextLine();
            esValido = true;
            if (!nombre.matches("^[A-Z][a-z]+[_-]\\d{3}$") || nombre.length() > 16) {
                System.out.println("El nombre no cumple con los requisitos.");
                esValido = false;
            }
            for (String n : nombres) {
                if (n.equals(nombre)) {
                    System.out.println("El nombre ya está en uso.");
                    esValido = false;
                    break;
                }
            }
        } while (!esValido);
        return nombre;
    }


    public static String compruebaEmail() {
        String email;
        boolean esValido;
        do {
            System.out.print("Introduce tu email: ");
            email = scanner.nextLine();
            esValido = true;
            if (!email.matches("^[a-zA-Z0-9._%+-]+@(paucasesnovescifp|yahoo|gmail|hotmail)\\.(com|es|cat)$")) {
                System.out.println("El email no cumple con los requisitos.");
                esValido = false;
            }
        } while (!esValido);
        return email;
=======

    public static String compruebaPassword() {
        String password;
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
        String codigo = "";
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@#_-";
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
>>>>>>> 5544543dfe9c063739cd5ca19e56961a5d4e77b3
    }
}
