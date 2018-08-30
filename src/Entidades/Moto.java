package Entidades;

public abstract class Moto extends Vehiculo {

	private int cilindrada;
	
	public Moto(int cilindrada, String matricula, String combustible, String marca, String modelo) {
		super(matricula, combustible, marca, modelo);
		this.cilindrada = cilindrada;		
	}
	
	@Override
	public String getDetalles() {
		return "Cilindrada: " + cilindrada;
	}
}
