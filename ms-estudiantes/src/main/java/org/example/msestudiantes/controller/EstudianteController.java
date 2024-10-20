package org.example.msestudiantes.controller;

import org.example.msestudiantes.dto.EstudianteDto;
import org.example.msestudiantes.model.Estudiante;
import org.example.msestudiantes.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping
    public List<Estudiante> getAllEstudiantes() {
        return estudianteService.getAllEstudiantes();
    }

    @PostMapping
    public ResponseEntity<Estudiante> createEstudiante(@RequestBody EstudianteDto estudianteDto) {
        return new ResponseEntity<>(estudianteService.createEstudiante(estudianteDto), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estudiante> getEstudianteById(@PathVariable Long id) {
        return estudianteService.getEstudianteById(id)
                .map(ResponseEntity::ok)
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/documento/{documentoIdentidad}")
    public ResponseEntity<Estudiante> getEstudianteByDocumentoIdentidad(@PathVariable String documentoIdentidad) {
        return estudianteService.getEstudianteByDocumentoIdentidad(documentoIdentidad)
                .map(ResponseEntity::ok)
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
