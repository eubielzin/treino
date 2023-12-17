package Universidade.Service;

import Universidade.Model.Alunos;
import Universidade.Model.Cursos;
import Universidade.dto.request.AlunoRegistro;
import Universidade.respository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {
    @Autowired
    private final AlunoRepository alunoRepository;


    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }
    public AlunoRegistro create(AlunoRegistro alunoRegistro){
        Alunos a = new Alunos();
        a.setCep(alunoRegistro.getCepDTO());
        a.setEmail(alunoRegistro.getEmailDTO());
        a.setCpf(alunoRegistro.getCpfDTO());
        a.setEndereco(alunoRegistro.getEnderecoDTO());
        a.setNome(alunoRegistro.getNomeDTO());
        a.setNumeroDeTelefone(alunoRegistro.getNumeroDeTelefone());
        Cursos curso = new Cursos();
        curso.setId(alunoRegistro.getIdCurso());
        a.setNomeCursos(curso);
        Alunos dto = alunoRepository.save(a);
        alunoRegistro.setIdCurso(dto.getId());
        return alunoRegistro;
    }
    public Alunos update(Alunos alunos,Integer id){
        Alunos a = alunoRepository.getReferenceById(id);
        a.setCep(alunos.getCep());
        a.setEmail(alunos.getEmail());
        a.setCpf(alunos.getCpf());
        a.setEndereco(alunos.getEndereco());
        a.setNome(alunos.getNome());
        a.setNumeroDeTelefone(alunos.getNumeroDeTelefone());
        alunoRepository.save(a);
        return a;
    }

}
