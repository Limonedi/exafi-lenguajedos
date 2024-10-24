package com.fin.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "Pacientes")
public class mPaciente {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    
    private String historialOdontologico;
    private String alergias;

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
    private List<mAtencion> atenciones;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHistorialOdontologico() {
		return historialOdontologico;
	}

	public void setHistorialOdontologico(String historialOdontologico) {
		this.historialOdontologico = historialOdontologico;
	}

	public String getAlergias() {
		return alergias;
	}

	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}

	public List<mAtencion> getAtenciones() {
		return atenciones;
	}

	public void setAtenciones(List<mAtencion> atenciones) {
		this.atenciones = atenciones;
	}

	@Override
	public String toString() {
		return "mPaciente [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", email=" + email + ", historialOdontologico=" + historialOdontologico + ", alergias=" + alergias
				+ ", atenciones=" + atenciones + "]";
	}

	
    
}

