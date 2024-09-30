package com.ej2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//Contexto : el programa actualizará el conjunto de datos dedicado a almacenar los usuarios del sistema por medio de un bucle: solicitando al cliente dicho dato, cuando la posicion del ArrayList sea multiplo de 6 se agregará un separador para mantener un orden

//Problema : el ususario quiere un sistema que le permita ingresar usuarios de forma comoda hasta que decida detenerse
public class Main {
    public static void main(String[] args) {
        ArrayList <String> user = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        System.out.println(
                "\nSe recorrerán las posiciones de la lista de usuarios; se le especificará en que posicion se está y se le pedira ingresar el nombre del usuario en cuestion \n");
                System.out.println("Cuando desee detener el inserto de usuarios puede  almacenar 'stop'");
                int i = 0;
        while (true) { 
            if (user.size()%2==0 && user.size()%3==0) {
                user.add("-----------------------------------------");
                i++;}
            System.out.println("Posicion Actual ---> " + i);
            System.out.println("Ingrese el usuario a almacenar");
            String usr = teclado.nextLine();
            if (usr.equalsIgnoreCase("Stop")) {break;}
        
            user.add(usr);
            i++;}
            
            System.out.println("Su conjunto de datos contiene los siguientes usuarios -->");
            // System.out.println(user.toString()); //ejemplo sin bucle de organización
            for (int x = 0; x < user.size(); x++) {//Este bucle nos otorga presentacion
                System.out.println("- " + user.get(x));
            }
        
       
    }
}