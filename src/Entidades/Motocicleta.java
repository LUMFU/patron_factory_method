package Entidades;

public class Motocicleta extends Moto {

	public Motocicleta(int cilindrada, String matricula, String combustible, String marca, String modelo) {
		super(cilindrada, matricula, combustible, marca, modelo);		
	}

	@Override
	public String getDescripcion() {
		return "Motocicleta " + this.toString();
	}

}
