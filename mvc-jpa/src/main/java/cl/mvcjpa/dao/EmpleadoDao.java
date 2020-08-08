package cl.mvcjpa.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import cl.mvcjpa.modelo.Empleado;

public class EmpleadoDao {

	
		private JdbcTemplate jdbcTemplate;  
		  
		public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
		    this.jdbcTemplate = jdbcTemplate;  
		}  
		  
		public int saveEmployee(Empleado e){  
		    String query="insert into empleado values('"+e.getIdempleado()+"','"+e.getNombre()+"','"+e.getApellido()+"','"+e.getEspecialidad()+"','"+e.getTelefono()+"')";  
		    return jdbcTemplate.update(query);  
		}  
		public int updateEmployee(Empleado e){  
		    String query="update empleado set nombre='"+e.getNombre()+"',apellido='"+e.getApellido()+"','"+e.getEspecialidad()+"','"+e.getTelefono()+"' where id='"+e.getIdempleado()+"' ";  
		    return jdbcTemplate.update(query);  
		}  
		public int deleteEmployee(Empleado e){  
		    String query="delete from empleado where id='"+e.getIdempleado()+"' ";  
		    return jdbcTemplate.update(query);  
		}  
		  
		}  
