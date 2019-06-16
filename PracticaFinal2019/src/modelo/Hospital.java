package modelo;

import java.util.ArrayList;

import Fachada.Datos;

public class Hospital {

	public ArrayList<Medico> medicos;
	public ArrayList<Paciente> pacientes;
	private Datos datos;

	public Hospital(ArrayList<Medico> medicos, ArrayList<Paciente> pacientes, Datos fachada) {
		super();
		this.medicos = medicos;
		this.pacientes = pacientes;
		this.datos = fachada;
	}
	
	public Paciente getPaciente(String id) {
		//Busca el paciente en el arraylist con el id que pasas
		
		return null;
	}
	
	public Medico getMedico(String id) {
		//Busca el medico en el arraylist con el id que pasas
		return null;
	}

	public ArrayList<Medico> getMedicos() {
		return medicos;
	}

	public void setMedicos(ArrayList<Medico> medicos) {
		this.medicos = medicos;
	}

	public ArrayList<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(ArrayList<Paciente> pacientes) {
		this.pacientes = pacientes;
	}

	public Datos getFachada() {
		return datos;
	}

	public void setDatos(Datos datos) {
		this.datos = datos;
	}

}
