package ar.edu.ies6.controller;

import ar.edu.ies6.model.Alumno;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class AlumnoController {
	
		@GetMapping({ "/index", "/", "/home", "/alumno" })
		public ModelAndView cargarAlumno() {
			
			Alumno alu = new Alumno();
			
			//alu.setFechaNac(LocalDate.of(1998, 4, 27));
			//LocalDate.parse("2020-01-08");
			alu.setFechaNac(LocalDate.parse("1990-10-27"));
			System.out.println("Edad: "+alu.getEdad());

			// mandar el objeto a la vista
			ModelAndView modelView = new ModelAndView("index");

			modelView.addObject("alumno", alu);

			return modelView;
		}
		
		@PostMapping("/cargarAlumno")
		public ModelAndView cargarAlumno(@ModelAttribute("alumno") Alumno alumno) {
			
			//primero
			//tengo que cargar el alumno, en donde ESTRUCTURA DE DATOS (BD tablas) LIST ArrayList MAP SET 
			//TODO guardar el alumno en una list
			List listado = new ArrayList();
			//cargar el alumno al array list
			
			ModelAndView modelView = new ModelAndView("listadoAlumnos");
			
			//TODO enviar el listado a la tabla
			modelView.addObject("listado", listado);		
			return modelView;
		}
}
