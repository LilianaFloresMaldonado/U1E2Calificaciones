package main;

import java.util.Scanner;
import logica.metodos;

public class principal {
    public static void main(String[] args) {
        
        Scanner reaccion = new Scanner(System.in);
        String Nombres[] = {
            "Tapia Sanchez Marcos Antonio", "Ambrosio Hernandez Vianey Celerina",
            "Tatacoya Julian","Zamora Esparza Yezier Cruz",
            "Campos Casasanero Juan Pablo","Diaz de Jesus Mariana Dazzling",
            "Martinez Rayo Iris Madai","Morales Ruiz Joseline Arel",
            "Peñaloza Arrollo Israel","Villanueva Flores Erick Jared",
            "Riquelme Abarca Esmeralda America","Martinez de los Santos Isabel",
            "Flores Maldonado Liliana","Leyva Silva Rogelio Jesus",
            "Soto Carrion Luis Enrique", "Juarez Ramos Alexis Manuel"
        };
        int NoControl[] = { 18680754,19680092,19680262,19680277,19680113,
            19680133,18680165,18680177,19680224,19680902,19680236,18680163,
            19680144,19680177,17680236,19680958
        };
        double CalificacionesA[] = new double[Nombres.length];
        
        for (int i = 0; i < CalificacionesA.length; i++) {
            do {
                System.out.print("Calificacion final de: " + (i + 1) + Nombres[i] + "----" + NoControl[i] + ": ");
                CalificacionesA[i] = reaccion.nextDouble();
                
            } while (CalificacionesA[i] < 0 || CalificacionesA[i] > 100);
        }
        metodos metodo = new metodos();
       
        int opc, opc2;
        do {
            opc2 = 1;
            System.out.println(
                     "\n********MENÚ*************"
                    + "\n1.-Calificación General"
                    + "\n2.-Calificacion de los primeros 5 datos"
                    + "\n3.-Calificacion de los ultimos 5 datos"
                    + "\n4.-salir");
            opc = reaccion.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Calificacion grupal: " + metodo.Promedio(CalificacionesA));
                    break;
                case 2:
                    metodo.Primero(Nombres, NoControl, CalificacionesA);
                    break;
                case 3:
                    metodo.Ultimos(Nombres, NoControl, CalificacionesA);
                case 4:
                    //System.out.println("Terminando");
                    //break;
            }
            if (opc != 4) {
                System.out.println("Desea continuar 1.-SI 2.-NO");
                opc2 = reaccion.nextInt();
             }
            if(opc==4){
                System.exit(0);
            }
        } while (opc2 != 2);

    }
}
