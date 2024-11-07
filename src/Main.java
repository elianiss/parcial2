import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

                /*

  clase abstracta llamada Producto con atributos como nombre, marca, precio y cantidadStock, y un método abstracto mostrarDetalles() que muestre la información completa del producto.
  Define dos subclases concretas, Laptop y Celular, que extiendan de Producto. En Laptop, incluye atributos adicionales como procesador y memoriaRAM, y en Celular, atributos como capacidadBateria y camaraResolucion. Cada subclase debe implementar el método mostrarDetalles() para mostrar la información específica de cada producto.

Define una interfaz Vendible con un método calcularPrecioVenta(int cantidad) que calcule el precio total de la venta de un producto en función de la cantidad comprada. Si la cantidad comprada supera un cierto límite (por ejemplo, 5 unidades), se debe aplicar un descuento automático. Haz que las subclases Laptop y Celular implementen esta interfaz, aplicando las condiciones específicas en calcularPrecioVenta().

Luego, crea una clase Cliente que contenga atributos como nombre, correo y una lista de Producto que representa los productos comprados. Implementa métodos en Cliente como comprarProducto(Producto producto, int cantidad) y mostrarCompra(), para agregar productos a la lista de compras y mostrar los detalles de cada compra junto con el costo total.

Finalmente, en una clase principal, simula el proceso de compra de varios productos por parte de algunos clientes, actualiza el inventario de cada producto tras cada compra, y muestra un resumen con el detalle de las compras de cada cliente, el costo total de cada producto y el inventario actualizado.

         */

        Laptop lp1 = new Laptop(15, "Lenovo", "gamer", 3000, 16, "Intel i7");
        Celular cel1 = new Celular(15, "Samsung", "35g", 4000, 80,  5);


        Producto[] inventario = {lp1, cel1};


        Cliente cl1 = new Cliente("isabella", "juan@example.com");
        Cliente cl2 = new Cliente("pedro", "maria@example.com");

        Scanner entrada = new Scanner(System.in);
        boolean menu = true;

        while (menu) {
            System.out.println("Seleccione un cliente:");
            System.out.println("1. isabella");
            System.out.println("2. pedro");
            System.out.println("3. Salir");

            int op= entrada.nextInt();
            Cliente cliente = null;

            switch (op) {
                case 1:
                    cliente = cl1;
                    break;
                case 2:
                    cliente = cl2;
                    break;
                case 3:
                    menu = false;
                    continue;
                default:
                    System.out.println("opcion no valida");
                    continue;
            }

            System.out.println("coloque un producto :");
            for (int i = 0; i < inventario.length; i++) {
                System.out.print((i + 1) + ". ");
                inventario[i].mostrarDetalles();
            }

            int opPro= entrada.nextInt();
            if (opPro < 1 || opPro > inventario.length) {
                System.out.println("opcion no valida");
                continue;
            }

            Producto proSel = inventario[opPro- 1];

            System.out.print("que cantidad va a comprar : ");
            int cantidad = entrada.nextInt();

            cliente.comprarProducto(proSel, cantidad);
            System.out.println("Inventario actualizado:");
            for (Producto producto : inventario) {
                producto.mostrarDetalles();
            }

            cliente.mostrarCompra();
        }

        entrada.close();

    }

}