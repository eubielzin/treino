package Universidade.respository;

import Universidade.Model.Cursos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface CursoRepository extends JpaRepository<Cursos,Integer> {

}
