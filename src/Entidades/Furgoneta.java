package Entidades;

public class Furgoneta extends Coche {

	private double cargaMaxima;
	
	public Furgoneta(double cargaMaxima, String matricula, String combustible, String marca, String modelo) {
		super(matricula, combustible, marca, modelo);
		this.cargaMaxima = cargaMaxima;
	}

	@Override
	public String getDescripcion() {
		return "Furgoneta " + this.toString();
	}

	@Override
	public String getDetalles() {
		return "Carga máxima: " + cargaMaxima + " T";
	}

}
