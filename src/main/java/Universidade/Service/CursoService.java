package Universidade.Service;

import Universidade.respository.AlunoRepository;
import Universidade.respository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService {
    @Autowired
    private final AlunoRepository alunoRepository;
    @Autowired
    private final CursoRepository cursoRepository;

    public CursoService(AlunoRepository alunoRepository, CursoRepository cursoRepository) {
        this.alunoRepository = alunoRepository;
        this.cursoRepository = cursoRepository;
    }
//    @Transactional
//    public CursoRegistro create(CursoRegistro cursoRegistro){
//        Cursos cursos = new Cursos();
//        if (!())
//        cursos.setNomeDoCurso(cursoRegistro.getNomeDoCurso());
//        cursos.setCargaHoraria(cursoRegistro.getCargaHoraria());
//
//    }

}
