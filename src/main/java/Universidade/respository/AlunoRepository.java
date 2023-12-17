package Universidade.respository;

import Universidade.Model.Alunos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Optional;

@Repository
@EnableJpaRepositories
public interface AlunoRepository extends JpaRepository<Alunos,Long> {

}
