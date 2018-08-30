package Factory;

import Entidades.*;

public interface CreadorVehiculoMethod {
	
	Vehiculo crearVehiculo(int ruedas, int plazas, int cilindrada, double carga, String matricula, 
			String combustible, String marca, String modelo);
}
