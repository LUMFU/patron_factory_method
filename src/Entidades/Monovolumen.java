package Entidades;

public class Monovolumen extends Coche {

	public Monovolumen(String matricula, String combustible, String marca, String modelo) {
		super(matricula, combustible, marca, modelo);
	}

	@Override
	public String getDescripcion() {
		return "Monovolumen " + this.toString();
	}
}
