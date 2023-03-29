package Registro;

public class validarCampos {
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
    }
}
