package logica;


public class metodos {
     public double Promedio(double[] Calif) {
        double aux = 0;
        for (int i = 0; i < Calif.length; i++) {
            aux = aux + Calif[i];
        }
        aux = aux / Calif.length;
        return aux;
    }

    public void Primero(String[] Nombre, int[] NoControl, double[] Calif) {
        double aux = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + Nombre[i] + "-----" + NoControl[i] + "   Calificacion final : " + Calif[i]);
            aux = aux + Calif[i];
            System.out.println("");
        }
        aux = aux / 5;
        System.out.println("Promedio de los primeros 5: " + aux);
    }

    public void Ultimos(String[] Nombre, int[] NoControl, double[] Calif) {
        double aux = 0;
        for (int i = Calif.length - 1; i > 10; i--) {
            System.out.print((i + 1) + Nombre[i] + "----" +NoControl[i] + "   Calificacion final: " + Calif[i]);
            aux = aux + Calif[i];
            System.out.println("");
        }
        aux = aux / 5;
        System.out.println("Promedio de los ultimos 5: " + aux);
    }
}
    

