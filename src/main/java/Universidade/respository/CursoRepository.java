package Universidade.respository;

import Universidade.Model.Alunos;
import Universidade.Model.Cursos;
import org.hibernate.engine.jdbc.cursor.spi.RefCursorSupport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@EnableJpaRepositories
public interface CursoRepository extends JpaRepository<Cursos,Integer> {

}
