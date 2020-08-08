package cl.mvcjpa.servicio;

import java.util.List;


import cl.mvcjpa.modelo.Empleado;

public interface EmpleadoServicioI {


	Empleado findEmpleadoByid(int id);
	List<Empleado> listarEmpleados();
	void agregarEmpleado(Empleado e);
	void eliminarEmpleado(int empleadoid);
	void editarEmpleado(Empleado r);
	
}
