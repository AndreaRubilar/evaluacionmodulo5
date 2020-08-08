package cl.mvcjpa.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cl.mvcjpa.modelo.Cliente;
import cl.mvcjpa.modelo.ClienteRepositorio;

public class ClienteServicioImpl  implements ClienteServicio {

	@Autowired
	ClienteRepositorio cr;
	
	@Override
	public Cliente findClienteByid(int id) {
		return cr.findOne(id);
	}

	@Override
	public List<Cliente> listarClientes() {
		return (List<Cliente>) cr.findAll();
	}

	@Override
	public void agregarCliente(Cliente c) {
		cr.save(c);
	}

	@Override
	public void eliminarCliente(int clienteid) {
		cr.delete(clienteid);
	}

	@Override
	public void editarCliente(Cliente t) {
		cr.save(t);
	}

}
