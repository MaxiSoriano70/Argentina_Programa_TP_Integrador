package Modelo;

public class Persona {
	private int idPersona;
	private String nombreCompleto;
	private String dni;
	
	public Persona(int idPersona, String nombreCompleto, String dni) {
		super();
		this.idPersona = idPersona;
		this.nombreCompleto = nombreCompleto;
		this.dni = dni;
	}

	public int getIdPersona() {
		return idPersona;
	}
	
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
}
