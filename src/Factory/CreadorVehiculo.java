package Factory;

import Entidades.*;

public class CreadorVehiculo implements CreadorVehiculoMethod {

	@Override
	public Vehiculo crearVehiculo(int ruedas, int plazas, int cilindrada, double carga, String matricula,
			String combustible, String marca, String modelo) {
		Vehiculo v = null;
		if (ruedas == 2) {
			if (cilindrada <= 50) {
				v = new Ciclomotor(cilindrada, matricula, combustible, marca, modelo);
			} else {
				v = new Motocicleta(cilindrada, matricula, combustible, marca, modelo);
			}
		} else if (ruedas == 4) {
			if (carga > 3.5) {
				v = new Camion(carga, matricula, combustible, marca, modelo);
			} else if (carga > 0.5) {
				v = new Furgoneta(carga, matricula, combustible, marca, modelo);
			} else if (plazas < 5) {
				v = new Microcoche(matricula, combustible, marca, modelo);
			} else if (plazas == 5) {
				v = new Berlina(matricula, combustible, marca, modelo);
			} else if (plazas <= 8) {
				v = new Monovolumen(matricula, combustible, marca, modelo);
			} else if (plazas > 8) {
				v = new Autobus(plazas, matricula, combustible, marca, modelo);
			}
		}
		return v;
	}

}
