package mx.uabc;

import java.util.LinkedList;
import java.util.Queue;

public class RecepcionOrdenes {
    private Queue<OrdenDeCompra> colaOrdenes = new LinkedList<>();

    public void recibirOrden(OrdenDeCompra orden) {
        colaOrdenes.offer(orden);
        System.out.println("Orden recibida de " + orden.getCliente() + ": " + orden.getCantidadProductos() + " productos.");
    }

    public int cantidadOrdenesPendientes() {
        return colaOrdenes.size();
    }

    public void procesarOrdenes() {
        while (!colaOrdenes.isEmpty()) {
            OrdenDeCompra orden = colaOrdenes.poll();
            System.out.println("Procesando orden de " + orden.getCliente() + ": " + orden.getCantidadProductos() + " productos.");
        }
    }
}
