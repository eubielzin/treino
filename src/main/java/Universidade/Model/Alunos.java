package Universidade.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Alunos")
public class Alunos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "Codigo_Do_Aluno")
    private String codigoDoAluno;
    @Column(name = "Nome")
    private String nome;
    @Column(name = "CPF")
    private String cpf;
    @Column(name = "Endereco")
    private String endereco;
    @Column(name = "Cep")
    private String cep;
    @Column(name = "Email")
    private String email;
    @Column(name = "Numero_De_Telefone")
    private String numeroDeTelefone;
    @Column(name = "Data_De_CadastroA")
    private Date dataDeCadastroA;

    @ManyToOne
    @JoinColumn (name = "Curso")
    private Cursos NomeCursos;

    public Alunos() {
    }

    public Alunos(Integer id, String codigoDoAluno, String nome, String cpf, String endereco, String cep, String email, String numeroDeTelefone, Date dataDeCadastroA, Cursos nomeCursos) {
        this.id = id;
        this.codigoDoAluno = codigoDoAluno;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.cep = cep;
        this.email = email;
        this.numeroDeTelefone = numeroDeTelefone;
        this.dataDeCadastroA = dataDeCadastroA;
        NomeCursos = nomeCursos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigoDoAluno() {
        return codigoDoAluno;
    }

    public void setCodigoDoAluno(String codigoDoAluno) {
        this.codigoDoAluno = codigoDoAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroDeTelefone() {
        return numeroDeTelefone;
    }

    public void setNumeroDeTelefone(String numeroDeTelefone) {
        this.numeroDeTelefone = numeroDeTelefone;
    }

    public Date getDataDeCadastroA() {
        return dataDeCadastroA;
    }

    public void setDataDeCadastroA(Date dataDeCadastroA) {
        this.dataDeCadastroA = dataDeCadastroA;
    }

    public Cursos getNomeCursos() {
        return NomeCursos;
    }

    public void setNomeCursos(Cursos nomeCursos) {
        NomeCursos = nomeCursos;
    }
}
