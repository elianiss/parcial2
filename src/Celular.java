public class Celular extends Producto implements Vendible  {
    private int capacidadBateria;
    private int camaraResolucion;

    public Celular(int cantidadStock, String marca, String nombre, double precio, int camaraResolucion, int capacidadBateria) {
        super(cantidadStock, marca, nombre, precio);
        this.camaraResolucion = camaraResolucion;
        this.capacidadBateria = capacidadBateria;
    }

    public int getCamaraResolucion() {
        return camaraResolucion;
    }

    public void setCamaraResolucion(int camaraResolucion) {
        this.camaraResolucion = camaraResolucion;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Celular : " + getNombre() + ", Marca: " + getMarca()+ ", Precio: $" + getPrecio() +
                ", Stock: " + getCantidadStock() + ", Batería del celular: " + getCapacidadBateria() + "camara: " + getCamaraResolucion());
    }

    @Override
    public double calcularPrecioVenta(int cantidad) {
        double total = precio * cantidad;
        if (cantidad > 5) {
            total *= 0.85;
        }
        return total;
    }
}
