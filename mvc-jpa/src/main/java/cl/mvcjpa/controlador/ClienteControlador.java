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
import cl.mvcjpa.servicio.ClienteServicio;


@Controller 
public class ClienteControlador {

	@Autowired
	ClienteServicio cs;
	
	@RequestMapping("/")
	public String home() {
		return "login";
	}
	
	@RequestMapping("/listarclientes")
	public String verclientes(Model m) {
		List<Cliente> listacliente = cs.listarClientes();
		m.addAttribute("lclientes",listacliente);
		return "listadoclientes";
	}
	
    @RequestMapping("/cliform")    
    public String showform(Model m){
        m.addAttribute("command", new Cliente());
        return "cliform";
    } 

    @RequestMapping(value="/save",method = RequestMethod.POST)    
    public String save(@ModelAttribute("cli") Cliente cli){    
        cs.agregarCliente(cli);
        return "redirect:/listarclientes";
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



