 abstract  class Producto {
     protected String nombre;
     protected String marca;
     protected double precio;
     protected int cantidadStock;

     public Producto(int cantidadStock, String marca, String nombre, double precio) {
         this.cantidadStock = cantidadStock;
         this.marca = marca;
         this.nombre = nombre;
         this.precio = precio;
     }

     public int getCantidadStock() {
         return cantidadStock;
     }

     public void setCantidadStock(int cantidadStock) {
         this.cantidadStock = cantidadStock;
     }

     public String getMarca() {
         return marca;
     }

     public void setMarca(String marca) {
         this.marca = marca;
     }

     public String getNombre() {
         return nombre;
     }

     public void setNombre(String nombre) {
         this.nombre = nombre;
     }

     public double getPrecio() {
         return precio;
     }

     public void setPrecio(double precio) {
         this.precio = precio;
     }



     public abstract void mostrarDetalles();

     public void actualizarStock(int cantidadVendida) {
         this.cantidadStock -= cantidadVendida;
     }


     public void comprar(int cantidad){
             if ( cantidad <= cantidadStock){
                 actualizarStock(cantidad);
                 return;

             }else {
                 System.out.println("no hay productos para realizar la compra ");
                 return;
             }

         }
     }


