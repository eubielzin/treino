package Universidade.Service;

import Universidade.Model.Alunos;
import Universidade.Model.Cursos;
import Universidade.dto.request.AlunoRegistro;
import Universidade.respository.AlunoRepository;
import Universidade.respository.CursoRepository;
import jakarta.persistence.EntityNotFoundException;
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
      //  aluno.setDataDeCadastroA(Date.from(Instant.now());

        Long idCurso = alunoRegistro.getIdCurso();
        if (idCurso != null) {
            Optional<Cursos> cursoOptional = cursoRepository.findById(Math.toIntExact(idCurso));
            cursoOptional.ifPresent(aluno::setNomeCursos);
        }

        Alunos alunoSalvo = alunoRepository.save(aluno);
        alunoRegistro.setIdCurso(alunoSalvo.getNomeCursos() != null ? Long.valueOf(alunoSalvo.getNomeCursos().getId()) : null);

        return alunoRegistro;
    }
    @Transactional
    public AlunoRegistro update(AlunoRegistro alunoRegistro,Long id) {
        Alunos a = new Alunos();
        try {
            a = alunoRepository.getReferenceById(id);
            if (!alunoRepository.existsById(id)) {
                throw new EntityNotFoundException("Alunos com id " + id + " Não encontrado");
            }
            a.setCep(alunoRegistro.getCep());
            a.setEmail(alunoRegistro.getEmail());
            a.setCpf(alunoRegistro.getCpf());
            a.setEndereco(alunoRegistro.getEndereco());
            a.setNome(alunoRegistro.getNome());
            a.setNumeroDeTelefone(alunoRegistro.getNumeroDeTelefone());
            alunoRepository.save(a);
            return alunoRegistro;


        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return alunoRegistro;
    }public void deletarAluno(long id) {
        Optional<Alunos> aluno = alunoRepository.findById(id);

        if (aluno != null) {
            alunoRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Aluno não encontrado com ID: " + id);
        }
    }

}
