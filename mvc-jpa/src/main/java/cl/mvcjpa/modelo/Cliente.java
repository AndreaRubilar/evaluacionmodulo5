package cl.mvcjpa.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Cliente")
public class Cliente {

	@Id
	@Column(name="idcliente")	
	@SequenceGenerator(name = "ClienteIdGenerator", sequenceName = "CLIENTE_SEQ1")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ClienteIdGenerator")
	private int idcliente;
	private String nombre;
	private int telefono;
	private String correoelectronico;
	private String rubro;
	private String direccion;

	public Cliente() {
		super();
	}

	public Cliente(int id, String nombre, int telefono, String correoelectronico, String rubro, String direccion) {
		super();
		this.idcliente = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.correoelectronico = correoelectronico;
		this.rubro = rubro;
		this.direccion = direccion;
	}

	public int getId() {
		return idcliente;
	}

	public void setId(int id) {
		this.idcliente = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getCorreoelectronico() {
		return correoelectronico;
	}

	public void setCorreoelectronico(String correoelectronico) {
		this.correoelectronico = correoelectronico;
	}

	public String getRubro() {
		return rubro;
	}

	public void setRubro(String rubro) {
		this.rubro = rubro;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + idcliente + ", nombre=" + nombre + ", telefono=" + telefono + ", correoelectronico="
				+ correoelectronico + ", rubro=" + rubro + ", direccion=" + direccion + "]";
	}
	
}