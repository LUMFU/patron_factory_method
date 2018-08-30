package Entidades;

public abstract class Vehiculo {

	String matricula;
	String combustible;
	String marca;
	String modelo;
	
	public Vehiculo(String matricula, String combustible, String marca, String modelo) {
		this.matricula = matricula;
		this.combustible = combustible;
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String toString() {
		return marca + " " + modelo;
	}
	
	public abstract String getDescripcion();
	
	public abstract String getDetalles();
}
