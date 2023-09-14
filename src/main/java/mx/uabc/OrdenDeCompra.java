package mx.uabc;

public class OrdenDeCompra {
    private String cliente;
    private int cantidadProductos;

    public OrdenDeCompra(String cliente, int cantidadProductos) {
        this.cliente = cliente;
        this.cantidadProductos = cantidadProductos;
    }

    public String getCliente() {
        return cliente;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }
}
