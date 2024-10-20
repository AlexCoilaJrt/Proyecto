package org.example.msestudiantes.dto;

import java.util.Date;

public class EstudianteDto {

    private Long id;
    private String nombre;
    private String apellido;
    private String tipoGrado;
    private String documentoIdentidad;
    private Date fechaRegistro;
    private Long userId; // Relación con el usuario

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getTipoGrado() { return tipoGrado; }
    public void setTipoGrado(String tipoGrado) { this.tipoGrado = tipoGrado; }

    public String getDocumentoIdentidad() { return documentoIdentidad; }
    public void setDocumentoIdentidad(String documentoIdentidad) { this.documentoIdentidad = documentoIdentidad; }

    public Date getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(Date fechaRegistro) { this.fechaRegistro = fechaRegistro; }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }
}
