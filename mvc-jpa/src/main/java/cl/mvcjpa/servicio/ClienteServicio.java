package cl.mvcjpa.servicio;

import java.util.List;

import cl.mvcjpa.modelo.Cliente;

public interface ClienteServicio {

	Cliente findClienteByid(int id);
	List<Cliente> listarClientes();
	void agregarCliente(Cliente c);
	void eliminarCliente(int clienteid);
	void editarCliente(Cliente t);
	
	
}
