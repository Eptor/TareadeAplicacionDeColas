package mx.uabc;

public class SimulacionRecepcionOrdenes {
    public static void main(String[] args) {
        RecepcionOrdenes recepcion = new RecepcionOrdenes();

        // Simulación de recepción de órdenes
        recepcion.recibirOrden(new OrdenDeCompra("Hector Espinoza", 5));
        recepcion.recibirOrden(new OrdenDeCompra("Andrés Talamantes", 10));
        recepcion.recibirOrden(new OrdenDeCompra("Benjamín Bolaños", 8));

        // Imprimir cantidad de órdenes pendientes
        System.out.println("Órdenes pendientes: " + recepcion.cantidadOrdenesPendientes());

        // Procesar las órdenes
        recepcion.procesarOrdenes();

        // Imprimir cantidad de órdenes pendientes después de procesarlas (debe ser 0)
        System.out.println("Órdenes pendientes después de procesarlas: " + recepcion.cantidadOrdenesPendientes());
    }
}
