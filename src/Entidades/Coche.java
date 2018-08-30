package Entidades;

public abstract class Coche extends Vehiculo {
	
	public Coche(String matricula, String combustible, String marca, String modelo) {
		super(matricula, combustible, marca, modelo);
	}
	
	@Override
	public String getDetalles() {
		return "";
	}

}
