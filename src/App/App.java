package App;
import Entidades.*;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Crear una sucursal
        Sucursal sucursal1 = new Sucursal("Sucursal A", "Calle Principal 123", "+1234567890");

        // Crear algunos productos
        Producto producto1 = new Producto(1, "Producto 1", "Descripción del Producto 1", 10.99, 10);
        Producto producto2 = new Producto(2, "Producto 2", "Descripción del Producto 2", 5.49, 5);
        Producto producto3 = new Producto(3, "Producto 3", "Descripción del Producto 3", 8.99, 8);

        // Agregar productos a la sucursal
        sucursal1.agregarProducto(producto1);
        sucursal1.agregarProducto(producto2);
        sucursal1.agregarProducto(producto3);

        // Listar los productos de la sucursal
        sucursal1.listarProductos();
    }
}
