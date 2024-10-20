package org.example.msestudiantes.service;

import org.example.msestudiantes.dto.EstudianteDto;
import org.example.msestudiantes.model.Estudiante;
import org.example.msestudiantes.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Date;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    public List<Estudiante> getAllEstudiantes() {
        return estudianteRepository.findAll();
    }

    public Estudiante createEstudiante(EstudianteDto estudianteDto) {
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre(estudianteDto.getNombre());
        estudiante.setApellido(estudianteDto.getApellido());
        estudiante.setTipoGrado(estudianteDto.getTipoGrado());
        estudiante.setDocumentoIdentidad(estudianteDto.getDocumentoIdentidad());
        estudiante.setFechaRegistro(new Date());

        // Aquí puedes agregar la lógica para obtener el usuario desde ms-auth-service

        return estudianteRepository.save(estudiante);
    }

    public Optional<Estudiante> getEstudianteById(Long id) {
        return estudianteRepository.findById(id);
    }

    public Optional<Estudiante> getEstudianteByDocumentoIdentidad(String documentoIdentidad) {
        return estudianteRepository.findByDocumentoIdentidad(documentoIdentidad);
    }
}
