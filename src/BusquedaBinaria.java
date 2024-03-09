import java.lang.reflect.Array;
import java.util.Arrays;
public class BusquedaBinaria {
    public static void main(String[] args) {
        int[] array = {2, 5, 12, 16, 34, 48};
        int valorABuscar = 34;
        int resultado =
                busquedaBinaria(array, ValorABuscar);
        if (resultado == -1) {
            System.out.println("el valor" + ValorABuscar + "no se encontró");

        } else {
            System.out.println("El valor" + valorABuscar + "Se encontró" + resultado);
        }
    }

    public static int BusquedaBinaria(int[] array, int valor) {
        int inicio = 0;
        int fin = array.length - 1;
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            if (array[medio] < valor) {
                if (array[medio] == valor) {
                    return medio;
                } else if (array[medio] < valor)
            } inicio = medio + 1;
        } else{
            fin = medio - 1;
        }
    }
return-1;
}
}