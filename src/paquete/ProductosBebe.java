package paquete;

import java.util.ArrayList;



public class ProductosBebe {
 public static void main(String[] args) {
	
	 Alimentos alimento; // se declara 
	 Perfumeria perfumeria;
	 ArchivoPlano archivo;
	 ArrayList lista= new ArrayList<>();
	 ArrayList lista1= new ArrayList<>();
	 
	 
	 System.out.println("************** Mostrar Productos  *************************************************** ");
	 alimento=new Alimentos('L',500,1210,"leche","sobrole",2,790);  // se construye
	 alimento.mostrarDatos();
	 System.out.println("Precio final : "+alimento.calularPrecioFinal(alimento.getPrecio()));
     alimento.contarProducto();
         
	 perfumeria=new Perfumeria(100,'F',2121,"Cremas","bebesitos",3,15000);
	 perfumeria.mostrarDatos();
	 System.out.println("Precio final:"+perfumeria.calularPrecioFinal(perfumeria.getPrecio()));
	 perfumeria.contarProducto();
	 
	 System.out.println("*************");
	 RegistrosProductos rp=new RegistrosProductos();
	rp.agregarProducto(alimento);
	
	 rp.agregarProducto(perfumeria);
	 System.out.println("Se agregaron los productos ");
	 System.out.println("Se creo Productos txt ");
	 System.out.println();
	//crear texto plano
	 
   lista.add(perfumeria);
   lista.add("El precio final es: "+perfumeria.calularPrecioFinal(perfumeria.getPrecio()));
   lista.add("la cantidad es "+perfumeria.getCantidad());
   
 
   lista.add(alimento);
   lista.add("el precio final es: "+alimento.calularPrecioFinal(alimento.getPrecio()));
   lista.add("la cantidad es :"+alimento.getCantidad());
   
   ArchivoPlano.crearArchivo(lista);
   
  
	System.out.println(); 
	 
	 
	 
	 if(rp.verificarProducto1(321)==false) {
		 System.out.println("No existe");
	 }else {
		 rp.listar();
	 }
		 
		 
	 
	 
	 
	
	 
	 
 } 
	 
	 
}

