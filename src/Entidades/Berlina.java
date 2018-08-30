package Entidades;

public class Berlina extends Coche {

	public Berlina(String matricula, String combustible, String marca, String modelo) {
		super(matricula, combustible, marca, modelo);
	}

	@Override
	public String getDescripcion() {
		return "Berlina " + this.toString();
	}

}
