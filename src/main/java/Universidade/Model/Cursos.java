package Universidade.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Cursos")
public class Cursos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Nome_Do_Curso")
    private  String nomeDoCurso;
    @Column(name = "Data_De_CadastroC")
    private Date dataDeCadastroC;
    @Column(name = "Carga_Horaria")
    private String cargaHoraria;
    @OneToMany(mappedBy = "NomeCursos")
    private List<Alunos> listaAlunos ;

    public Cursos() {
    }

    public Cursos(Long id, String nomeDoCurso, Date dataDeCadastroC, String cargaHoraria) {
        this.id = id;
        this.nomeDoCurso = nomeDoCurso;
        this.dataDeCadastroC = dataDeCadastroC;
        this.cargaHoraria = cargaHoraria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeDoCurso() {
        return nomeDoCurso;
    }

    public void setNomeDoCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }

    public Date getDataDeCadastroC() {
        return dataDeCadastroC;
    }

    public void setDataDeCadastroC(Date dataDeCadastroC) {
        this.dataDeCadastroC = dataDeCadastroC;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public List<Alunos> getListaAlunos() {
        return listaAlunos;
    }
}
