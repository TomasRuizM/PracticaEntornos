package Registro;

public class validarCampos {

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
    }
}
