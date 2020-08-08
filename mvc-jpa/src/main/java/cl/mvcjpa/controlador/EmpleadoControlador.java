package cl.mvcjpa.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.mvcjpa.modelo.Cliente;
import cl.mvcjpa.modelo.Empleado;
import cl.mvcjpa.servicio.EmpleadoServicio;

@Controller
public class EmpleadoControlador {
 
	@Autowired
	EmpleadoServicio es;
	
	@RequestMapping("/")
	public String index() {
	return "login";
	}
	
	@RequestMapping("/listarempleados")
	public String verempleados(Model m) {
		List<Empleado> listaempleado = es.listarEmpleados();
		m.addAttribute("lempleados",listaempleado);
		return "listadoempleados";
	}
	
	  @RequestMapping(value="/save",method = RequestMethod.POST)    
	    public String save(@ModelAttribute("e") Empleado e){    
	        es.agregarEmpleado(e);
	        return "redirect:/listarempleados";
	    }

	
	
	  @RequestMapping("/error")
	    public String error(ModelMap model)
	    {
	        model.addAttribute("error", "true");
	        return "login";
	    }

	
	  @RequestMapping("/login")
	    public String login()
	    {
	        System.out.println("Ingreso a login");
	        return "login";
	    }
	    
	    @RequestMapping("/logout")
	    public String logout()
	    {
	        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	        if (auth != null){    
	        	SecurityContextHolder.getContext().setAuthentication(null);
	        }
	        return "redirect:/login?logout"; 
	    }

	    
	}




