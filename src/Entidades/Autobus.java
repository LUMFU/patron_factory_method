package Entidades;

public class Autobus extends Vehiculo {

	private int plazas;
	
	public Autobus(int plazas, String matricula, String combustible, String marca, String modelo) {
		super(matricula, combustible, marca, modelo);
		this.plazas = plazas;
	}

	@Override
	public String getDetalles() {
		return plazas + " plazas.";
	}

	@Override
	public String getDescripcion() {
		return "Autobús " + this.toString();
	}

}
