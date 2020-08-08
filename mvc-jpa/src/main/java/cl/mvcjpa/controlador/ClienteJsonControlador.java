package cl.mvcjpa.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.mvcjpa.modelo.Cliente;
import cl.mvcjpa.servicio.ClienteServicio;



public class ClienteJsonControlador {

	@Autowired
	ClienteServicio cs;

	@RequestMapping(value = "/clilist", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Cliente> getClientes() {
		List<Cliente> listaclientes = cs.listarClientes();
		return listaclientes;
	}

	@RequestMapping(value = "/clilist", method = RequestMethod.POST, headers = "Accept=application/json")
	public void addCliente(@RequestBody Cliente cliente) {
		cs.agregarCliente(cliente);
	}

	@RequestMapping(value = "/clilist", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void updateCliente(@RequestBody Cliente cliente) {
		cs.editarCliente(cliente);
	}

	@RequestMapping(value = "/clidetalle/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Cliente getClientePorId(@PathVariable int id) {
		return cs.findClienteByid(id);
	}

	@RequestMapping(value = "/clidetalle/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteCliente(@PathVariable("id") int id) {
		cs.eliminarCliente(id);
	}
}

