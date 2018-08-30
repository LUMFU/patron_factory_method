package Entidades;

public class Microcoche extends Coche {

	public Microcoche(String matricula, String combustible, String marca, String modelo) {
		super(matricula, combustible, marca, modelo);
	}

	@Override
	public String getDescripcion() {
		return "Microcoche " + this.toString();
	}

}
