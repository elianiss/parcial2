import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String correo;
    private List<String> productosComprados;

    public Cliente(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
        this.productosComprados = new ArrayList<>();
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getProductosComprados() {
        return productosComprados;
    }

    public void setProductosComprados(List<String> productosComprados) {
        this.productosComprados = productosComprados;
    }

    public void comprarProducto(Producto producto, int cantidad) {
        if (producto.comprar(cantidad) {
            double total = producto.getPrecio() * cantidad;
            productosComprados.add("su compra es : " + producto.getNombre() + ", la cantidad de produstos : " + cantidad + ", Total: " + total);
        }
    }


    public void mostrarCompra() {
        System.out.println("compra realizada por  " + nombre + ":");
        double totalCompra = 0;

        for (String compra : productosComprados) {
            System.out.println(compra);
            String[] partes = compra.split(", Total: ");
            totalCompra += Double.parseDouble(partes[1]);
        }
        System.out.println("Total: " + totalCompra);
    }
}