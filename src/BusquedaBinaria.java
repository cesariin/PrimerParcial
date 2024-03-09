public class BusquedaBinaria {

    public static void main(String[] args) {
        int[] array = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int valorABuscar = 23;
        int resultado = busquedaBinaria(array, valorABuscar);

        if (resultado == -1) {
            System.out.println("El valor " + valorABuscar + " no se encontró en el array.");
        } else {
            System.out.println("El valor " + valorABuscar + " se encontró en la posición " + resultado + " del array.");
        }
    }

    public static int busquedaBinaria(int[] array, int valor) {
        int inicio = 0;
        int fin = array.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (array[medio] == valor) {
                return medio; // Elemento encontrado
            } else if (array[medio] < valor) {
                inicio = medio + 1; // El valor está en la mitad derecha del array
            } else {
                fin = medio - 1; // El valor está en la mitad izquierda del array
            }
        }

        return-1;
}
}
