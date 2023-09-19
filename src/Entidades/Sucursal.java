package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Producto> productos;

    public Sucursal(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.productos = new ArrayList<>();
    }

  

	public Sucursal() {
		super();
		// TODO Auto-generated constructor stub
	}



	public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void listarProductos() {
        System.out.println("Productos en la sucursal " + nombre + ":");
        for (Producto producto : productos) {
            System.out.println("Código: " + producto.getId() + ", Nombre: " + producto.getNombre() + ", Precio: $" + producto.getPrecio());
        }
    }
}