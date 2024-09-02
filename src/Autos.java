
public class Autos {
	private long serie;
	private String marca;
	private String modelo;
	private float precio;
	
	public Autos() {
	}


	public Autos(long serie, String marca, String modelo, float precio) {
		this.serie = serie;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Autos [serie=" + serie + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + "]";
	}


	public long getSerie() {
		return serie;
	}


	public void setSerie(long serie) {
		this.serie = serie;
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


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
}


	
	