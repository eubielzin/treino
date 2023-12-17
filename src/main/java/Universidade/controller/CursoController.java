package Universidade.controller;

import Universidade.Model.Cursos;
import Universidade.respository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {
    @Autowired
    private CursoRepository cursoRepository;
    @GetMapping
    public Iterable <Cursos> listaCursos(){
        return cursoRepository.findAll();
    }
    @GetMapping(path = "/{id}")
    public Optional<Cursos> listaCursos(@PathVariable Integer id){
        return cursoRepository.findById(id);
    }

}
