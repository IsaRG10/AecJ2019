package modelo;

public class Intervencion {

	private boolean realizacion;
	private String tipoIntervencion;
	private boolean resultado;

	public boolean isRealizacion() {
		return realizacion;
	}

	public void setRealizacion(boolean realizacion) {
		this.realizacion = realizacion;
	}

	public String getTipoIntervencion() {
		return tipoIntervencion;
	}

	public void setTipoIntervencion(String tipoIntervencion) {
		this.tipoIntervencion = tipoIntervencion;
	}

	public boolean isResultado() {
		return resultado;
	}

	public void setResultado(boolean resultado) {
		this.resultado = resultado;
	}
}
