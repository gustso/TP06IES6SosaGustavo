package ar.edu.ies6.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Alumno {
	private String name;
	private String lastName;
	private String addressStreet;
	private Integer addressNumber;
	private String addressCity;
	//private Date fechaNac;
	//Date es un instante de tiempo, hasta los milisegundos
	private LocalDate fechaNac;
	//LocalDate es año, mes, día
	private String dni;
	private Boolean estado;
	//TODO agregar atributos
	
	
	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddressStreet() {
		return addressStreet;
	}

	public void setAddressStreet(String addressStreet) {
		this.addressStreet = addressStreet;
	}

	public Integer getAddressNumber() {
		return addressNumber;
	}

	public void setAddressNumber(Integer addressNumber) {
		this.addressNumber = addressNumber;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	public Integer getEdad() {
		//TODO calculo edad
		int edad = 0;
		
		//LocalDate fechaN = fechaNac.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); ;
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(fechaNac, fechaActual);
		edad = periodo.getYears();
		//edadMeses = periodo.getMonths();
		//edadDias = periodo.getDays();
		
		return edad;		
	}
	
	

}
