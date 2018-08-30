package Entidades;

public class Ciclomotor extends Moto {

	public Ciclomotor(int cilindrada, String matricula, String combustible, String marca, String modelo) {
		super(cilindrada, matricula, combustible, marca, modelo);		
	}

	@Override
	public String getDescripcion() {
		return "Ciclomotor " + this.toString();
	}

}
