package paquete;

import java.util.ArrayList;

public class RegistrosProductos {
	ArrayList<Productos> productos;  //declaro un arraylist
	
	public RegistrosProductos() {
		productos=new ArrayList<Productos>(); //construyo
	}
	
	
	public void listar() {
		for(Productos temporalProducto : productos) { //recorre el aareglo lo listo y lo muestro
			System.out.println(temporalProducto.toString());
	}
	
	}
	
	
	
		
	boolean verificarProducto1(int codigo) {  // verifico producto y lo recorro
		boolean existe=false;
		for(Productos temporalProductos : productos) {
			if(temporalProductos.getCodigo()==codigo) {
				existe=true;
				break;
			}
		}
		return existe;
	
		
	}
	
	
	public void agregarProducto(Productos nuevoProducto) {
		if(this.verificarProducto1(nuevoProducto.getCodigo())==false) {
			productos.add(nuevoProducto);
		}else {
			System.out.println("El prodcuto existe :-) ");
		}
			
		}
	
	public void eliminarProdcutos(String nombre) {
		for(int i=0;i< productos.size();i++) {
			if(productos.get(i).getNombre().equals(nombre)) {
				productos.remove(i);
				i=i-1;
			}
		}
	}
	

}
