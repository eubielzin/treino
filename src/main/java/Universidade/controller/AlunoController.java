package Universidade.controller;

import Universidade.Model.Alunos;
import Universidade.Service.AlunoService;
import Universidade.dto.request.AlunoRegistro;
import Universidade.respository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {
    @Autowired
    private AlunoService alunoService;
    @Autowired
    private AlunoRepository alunoRepository;


    @GetMapping
    public Iterable<Alunos> ListaAlunos(){
        return  alunoRepository.findAll();
    }
    @GetMapping(path = "/{id}")
    public Optional<Alunos> ListaAlunosPorId(@PathVariable int id){
        return alunoRepository.findById(id);
    }

    @PutMapping(value = "/{id}")
    public Alunos update(@RequestBody Alunos alunos, @PathVariable Integer id){
      return alunoService.update(alunos, id);
    }
    @PostMapping
    public  AlunoRegistro create(@RequestBody AlunoRegistro alunoRegistro){
        alunoService.create(alunoRegistro);
        return alunoRegistro;
    }
}
