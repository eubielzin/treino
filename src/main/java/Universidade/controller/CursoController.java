package Universidade.controller;

import Universidade.respository.AlunoRepository;
import Universidade.respository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {
    @Autowired
    private CursoRepository cursoRepository;
}
