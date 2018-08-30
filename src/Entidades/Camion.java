package Entidades;

public class Camion extends Coche {

	private double cargaMaxima;
	
	public Camion(double cargaMaxima, String matricula, String combustible, String marca, String modelo) {
		super(matricula, combustible, marca, modelo);
		this.cargaMaxima = cargaMaxima;
	}

	@Override
	public String getDescripcion() {
		return "Cami�n " + this.toString();
	}

	@Override
	public String getDetalles() {
		return "Carga m�xima: " + cargaMaxima + " T";
	}

}
