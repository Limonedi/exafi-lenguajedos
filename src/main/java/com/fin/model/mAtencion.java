package com.fin.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Atencion")
public class mAtencion {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String tratamiento;
    private String diagnostico;
    private String fecha;
    private String medico;


    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private mPaciente paciente;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public String getMedico() {
		return medico;
	}

	public void setMedico(String medico) {
		this.medico = medico;
	}

	public mPaciente getPaciente() {
		return paciente;
	}

	public void setPaciente(mPaciente paciente) {
		this.paciente = paciente;
	}

	@Override
	public String toString() {
		return "mAtencion [id=" + id + ", tratamiento=" + tratamiento + ", diagnostico=" + diagnostico + ", fecha="
				+ fecha + ", medico=" + medico + ", paciente=" + paciente + "]";
	}  
    
    
}
