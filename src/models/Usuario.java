package models;

// Crea el setClave para que valide que clave tenga min6 caracteres max10, contenga 1letra minuscula, 1 letra mayuscula
// 1 numero y 1 caracter que sea(.-+*) al ahora de pintar el usuario la clave no debe de aparecer como texto, debe aparecer
// como asterisco

public class Usuario {

    // Atributos
    String dni;
    String nombre;
    char sexo;
    String email;
    String clave;

    // Metodos

    boolean validaClave(String clave){
        return this.clave.equals(clave);
    }

    public String getNombre() {
        return nombre.toUpperCase();
    }

    public String getSexo() {
        return ((sexo == 'M') ? "Mujer" : "Hombre");
    }

    public String getEmail() {
        return email;
    }

    public boolean setClave(String clave) {
        if (clave.length() < 6 && clave.length() >10) return false; // validamos la longitud
        else{
            if (clave.equals(clave.toUpperCase()) && clave.equals(clave.toLowerCase())) return false;
            int contasteris = 0, contpunt = 0, contguion = 0, contplus = 0;
            boolean claveValida = false;
            for (int i = 0; i < clave.length(); i++) {
                if (Character.isDigit(clave.charAt(i))) claveValida = true;
            }
            if (!claveValida) return false;
            claveValida = false;
            if (clave.contains('.')  || clave.contains('*') || clave.contains('+') || clave.contains('-')) claveValida = true;
            if (!claveValida) return false;
        }
        this.clave = clave;
        return true;
    }

    public boolean setDni(String dni) {
        if (dni.length() != 9) return false;
        this.dni = dni;
        return true;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
