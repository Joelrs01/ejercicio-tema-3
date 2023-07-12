// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Inicio practica 3.1
        int resultado;
        resultado = suma(10, 20, 30);

        System.out.println(resultado);
        // Fin practica 3.1

        // Inicio practica 3.2
        coche miCoche = new coche();
        miCoche.ponerpuerta();
        miCoche.ponerpuerta();
        System.out.println(miCoche.puertas);
        //Fin practica 3.2
    }
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

}
class coche {
    public int puertas = 2;
    public void ponerpuerta() {
        this.puertas++;
    }
}






