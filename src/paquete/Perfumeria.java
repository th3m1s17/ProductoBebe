package paquete;

public class Perfumeria extends Productos {
	private int ml;
	private char aroma;
	
	public Perfumeria() {
		super();
	}
	
	public Perfumeria(int ml,char aroma ,int codigo,String nombre,String descripcion, int cantidad,int precio) {
		super(codigo,nombre,descripcion,cantidad,precio);
		this.ml=ml;
		this.aroma=aroma;
		
	}
	
	
	
	
	
	

	public int getMl() {
		return ml;
	}

	public void setMl(int ml) {
		this.ml = ml;
	}

	public char getAroma() {
		return aroma;
	}

	public void setAroma(char aroma) {
		if(aroma=='V'||aroma=='F'||aroma=='L') {
			this.aroma = aroma;	
		}else {
			System.out.println(" El tipo debe se [V] vainilla o [F] frutilla o [L]Limon");
		}
		
	}
	
	
	public void mostrarDatos() {
		System.out.println(super.toString()+ " Perfumeria: "+"ml: "+ml+" ,aroma: "+aroma);
	}
	

	@Override
	public double contarProducto() {
		int cant=0;
		if(this.getNombre().equalsIgnoreCase("cremas")) {
			System.out.println("cantidad de cremas: "+getCantidad());
		}
		// TODO Auto-generated method stub
		return cant;
	};
	
	
	
	@Override
	public int calularPrecioFinal(int precio) {
		int descuento=0;
		descuento=(int)(precio-(precio*Calculable.descuento));
		
		return descuento;
	}

	

}
