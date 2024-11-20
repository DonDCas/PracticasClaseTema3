package view;

import models.Usuario;

import java.util.Scanner;

public class ejemplo1 {
    public static void main(String[] args) {
        Usuario usario1 = new Usuario();
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce Clave (Tiene que tener numeros, mayusculas, minusculas, y algun caracter especial: ");
        usario1.setClave(sc.nextLine());
        System.out.println(usario1.getClave());

    }
}
