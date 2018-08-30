package Principal;

import Factory.*;
import Entidades.*;

public class Main {

	public static void main(String[] args) {
		//Fábrica de vehículos
		CreadorVehiculoMethod fabrica = new CreadorVehiculo();
		
		//Creación de vehículos
		int ruedas;
		int plazas;
		int cilindrada;
		double carga;
		String matricula;
		String combustible;
		String marca;
		String modelo;
		// 1-Ciclomotor
		System.out.println("Creación de un ciclomotor:");
		ruedas = 2;
		plazas = 0; //solo aplicable a coches
		cilindrada = 40;
		carga = 0; //solo aplicable a camiones
		matricula = "AAA000";
		combustible = "gasolina";
		marca = "Honda";
		modelo = "2018";
		Vehiculo v1 = fabrica.crearVehiculo(ruedas, plazas, cilindrada, carga, matricula, combustible, marca, modelo);
		System.out.println(v1.getDescripcion());
		System.out.println(v1.getDetalles());
		//2-Monovolumen
		System.out.println("Creación de un monovolumen:");
		ruedas = 4;
		plazas = 8;
		cilindrada = 0; //solo aplicable a motos
		carga = 0; //solo aplicable a camiones
		matricula = "AAA111";
		combustible = "gasolina";
		marca = "Hyundai";
		modelo = "i800";
		Vehiculo v2 = fabrica.crearVehiculo(ruedas, plazas, cilindrada, carga, matricula, combustible, marca, modelo);
		System.out.println(v2.getDescripcion());
		System.out.println(v2.getDetalles());
		//3-Berlina
		System.out.println("Creación de una berlina:");
		ruedas = 4;
		plazas = 5;
		cilindrada = 0; //solo aplicable a motos
		carga = 0; //solo aplicable a camiones
		matricula = "BBB111";
		combustible = "diésel";
		marca = "Audi";
		modelo = "A4";
		Vehiculo v3 = fabrica.crearVehiculo(ruedas, plazas, cilindrada, carga, matricula, combustible, marca, modelo);
		System.out.println(v3.getDescripcion());
		System.out.println(v3.getDetalles());
		//4-Furgoneta
		System.out.println("Creación de una furgoneta:");
		ruedas = 4;
		plazas = 0; //solo aplicable a coches
		cilindrada = 0; //solo aplicable a motos
		carga = 1.5; 
		matricula = "BBB222";
		combustible = "diésel";
		marca = "Ford";
		modelo = "Transit";
		Vehiculo v4 = fabrica.crearVehiculo(ruedas, plazas, cilindrada, carga, matricula, combustible, marca, modelo);
		System.out.println(v4.getDescripcion());
		System.out.println(v4.getDetalles());
	}

}
