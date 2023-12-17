package Universidade.respository;

import Universidade.Model.Alunos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;


@Repository
@EnableJpaRepositories
public interface AlunoRepository extends JpaRepository<Alunos,Long> {

}
