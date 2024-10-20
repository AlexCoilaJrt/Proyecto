package org.example.msestudiantes.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "estudiantes")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @Column(nullable = false)
    private String tipoGrado;

    @Column(nullable = false, unique = true)
    private String documentoIdentidad;

    @Column(nullable = false)
    private LocalDate fechaRegistro;  // Reemplazamos Date por LocalDate

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;  // Asegúrate de tener esta entidad definida correctamente

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

    public LocalDate getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(LocalDate fechaRegistro) { this.fechaRegistro = fechaRegistro; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
}
