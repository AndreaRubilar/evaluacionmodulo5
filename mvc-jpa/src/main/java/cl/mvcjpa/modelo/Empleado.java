package cl.mvcjpa.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Empleado")
public class Empleado {

	
	@Id
	@Column(name="idempleado")	
	@SequenceGenerator(name = "EmpleadoIdGenerator", sequenceName = "EMPLEADO_SEQ1")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EmpleadoIdGenerator")
	private int idempleado;
	private String nombre;
	private String apellido;
	private String especialidad;
	private int telefono;
	
	public Empleado() {
		super();
	}

	public Empleado(int idempleado, String nombre, String apellido, String especialidad, int telefono) {
		super();
		this.idempleado = idempleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.especialidad = especialidad;
		this.telefono = telefono;
	}

	public int getIdempleado() {
		return idempleado;
	}

	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Empleado [idempleado=" + idempleado + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", especialidad=" + especialidad + ", telefono=" + telefono + "]";
	}
	
	
	
	
	
}
