package modelo;

import java.time.LocalDate;

public class Tratamiento {

	private String dosis;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;

	public Tratamiento(String dosis, LocalDate fechaInicio, LocalDate fechaFin) {
		super();
		this.dosis = dosis;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}



	public String getDosis() {
		return dosis;
	}

	public void setDosis(String dosis) {
		this.dosis = dosis;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
}
