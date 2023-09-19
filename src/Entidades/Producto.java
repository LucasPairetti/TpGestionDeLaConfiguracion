package Entidades;

public class Producto {
	private int id;
	private String nombre;
	private String descripcion;
	private double precio;
	private int stock;
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Producto(int id, String name, String descripcion,double precio, int stock) {
		super();
		this.id = id;
		this.nombre = name;
		this.descripcion = descripcion;
		this.stock = stock;
		this.precio = precio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String name) {
		this.nombre= name;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

}