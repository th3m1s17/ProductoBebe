package paquete;

public class Alimentos extends Productos{
	
	private char tipo;
	private int pesogramos;
	
	public Alimentos(char tipo,int pesogramos,int codigo,String nombre,String descripcion, int cantidad,int precio
			) {
		
	super(codigo,nombre,descripcion,cantidad,precio);
	this.tipo=tipo;
	this.pesogramos=pesogramos;
		
	}
	
	public Alimentos() {
	}
	
	
	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		if(tipo=='L' || tipo=='C') {
			this.tipo = tipo;	
		}else {
			System.out.println("EL TIPO DE SER [L] LECHE O [COLADO]  ");
		}
		
	}

	public int getPesogramos() {
		return pesogramos;
	}

	public void setPesogramos(int pesogramos) {
		this.pesogramos = pesogramos;
	}

	@Override
	public double contarProducto() { // mostrar la cantidad de leches compradas
		// TODO Auto-generated method stub
		int cant=0;
		if(tipo=='L') {
		System.out.println("Cantidad de Leche:  "+this.getCantidad());
		}
		return cantidad;
		
	}

	
	
	
	
	
	public void mostrarDatos() {  //mostrar la informacion del produto
		System.out.println(super.toString()+" Alimentos  "+"tipo:  "+tipo+" pesogramos: "+pesogramos+"");

	}

	@Override
	public int calularPrecioFinal(int precio) {
		// TODO Auto-generated method stub
		int descuento=0;
		descuento=(int)(precio-(precio*Calculable.descuento));
	
		return descuento;
	}


}
