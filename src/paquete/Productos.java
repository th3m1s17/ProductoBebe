package paquete;

public abstract class Productos implements Calculable{
	protected int codigo;
	protected String nombre;
	protected String descripcion;
	protected int cantidad;
	protected int precio;
	
	public Productos(int codigo,String nombre,String descripcion, int cantidad,int precio ) {
		this.codigo=codigo;
		this.setNombre(nombre);
		this.descripcion=descripcion;
		this.setCantidad(cantidad);
		this.precio=precio;
	}
	
	public Productos() {
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		int largo;
		largo=nombre.length();
		if(largo>0) {
			this.nombre=nombre;
		}else {
			System.out.println("EL NOMBRE NO DEBE VENIR EN BLANCO");
		}
		
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Productos codigo: " + codigo + ", Nombre: " + nombre + ", Descripcion: " + descripcion + ", Cantidad:  "
				+ cantidad + ", Precio: " + precio + "";
	}
	
	
	public abstract double contarProducto();
	
	
	public int calcularTotal(int cantidad,String dia) {
		int total=0;
		int descuento=0;
		
			descuento=calularPrecioFinal(precio);
			total=this.precio*cantidad-descuento;
			
		
		return total;
	}
	
	
	
	

}
