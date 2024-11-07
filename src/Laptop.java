public class Laptop extends Producto implements Vendible {
    private String procesador;
    private int memoriaRAM;

    public Laptop(int cantidadStock, String marca, String nombre, double precio, int memoriaRAM, String procesador) {
        super(cantidadStock, marca, nombre, precio);
        this.memoriaRAM = memoriaRAM;
        this.procesador = procesador;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Laptop : " + getNombre() + ", Marca: " + getMarca() +
                ", Precio: " + getPrecio() + ", Stock: " + getCantidadStock() +
                ", Procesador: " + getProcesador() + ", RAM: " + getMemoriaRAM() + "GB");
    }

    @Override
    public double calcularPrecioVenta(int cantidad) {
        double precioT = precio * cantidad;
        if (cantidad > 5) {
            precioT *= 0.9;
        }
        return precioT;
    }
}
