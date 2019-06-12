package pe.edu.tecsup.models;

public class Solicitud {
	private Integer id;
	private String email;
	private String tipo;
	private String motico;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMotico() {
		return motico;
	}

	public void setMotico(String motico) {
		this.motico = motico;
	}

	@Override
	public String toString() {
		return "Solicitud [email=" + email + ", tipo=" + tipo + ", motico=" + motico + "]";
	}

}
