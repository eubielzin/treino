package Universidade.Service;

import Universidade.Model.Alunos;
import Universidade.Model.Cursos;
import Universidade.dto.request.AlunoRegistro;
import Universidade.respository.AlunoRepository;
import Universidade.respository.CursoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Date;
import java.util.Optional;

@Service
public class AlunoService {
    @Autowired
    private final AlunoRepository alunoRepository;
    @Autowired
    private final CursoRepository cursoRepository;

    public AlunoService(AlunoRepository alunoRepository, CursoRepository cursoRepository) {
        this.alunoRepository = alunoRepository;
        this.cursoRepository = cursoRepository;
    }

    @Transactional
    public AlunoRegistro create(AlunoRegistro alunoRegistro) {
        Alunos aluno = new Alunos();

        aluno.setCep(alunoRegistro.getCep());
        aluno.setEmail(alunoRegistro.getEmail());
        aluno.setCpf(alunoRegistro.getCpf());
        aluno.setEndereco(alunoRegistro.getEndereco());
        aluno.setNome(alunoRegistro.getNome());
        aluno.setNumeroDeTelefone(alunoRegistro.getNumeroDeTelefone());
//        aluno.setDataDeCadastroA(Date.from(Instant.now());

        Long idCurso = alunoRegistro.getIdCurso();
        if (idCurso != null) {
            Optional<Cursos> cursoOptional = cursoRepository.findById(Math.toIntExact(idCurso));
            cursoOptional.ifPresent(aluno::setNomeCursos);
        }

        Alunos alunoSalvo = alunoRepository.save(aluno);
        alunoRegistro.setIdCurso(alunoSalvo.getNomeCursos() != null ? Long.valueOf(alunoSalvo.getNomeCursos().getId()) : null);

        return alunoRegistro;
    }
    public Alunos update(Alunos alunos,Long id){
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
