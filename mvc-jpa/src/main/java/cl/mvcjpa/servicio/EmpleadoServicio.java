package cl.mvcjpa.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cl.mvcjpa.modelo.Empleado ;
import cl.mvcjpa.modelo.EmpleaodRepositorio;

public class EmpleadoServicio  implements EmpleadoServicioI {

	@Autowired
	EmpleaodRepositorio er;
	
	@Override
	public List<Empleado> listarEmpleados() {
		// TODO Auto-generated method stub
		return (List<Empleado>) er.findAll();
	}

	@Override
	public Empleado findEmpleadoByid(int idempleado) {
		// TODO Auto-generated method stub
		return er.findOne(idempleado);
	}

	@Override
	public void agregarEmpleado(Empleado e) {
		// TODO Auto-generated method stub
		er.save(e);
		
	}

	@Override
	public void eliminarEmpleado(int empleadoid) {
		// TODO Auto-generated method stub
		er.delete(empleadoid);
	}

	@Override
	public void editarEmpleado(Empleado r) {
		
		// TODO Auto-generated method stub
		er.save(r);
	}


	}

