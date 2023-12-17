package Universidade.dto.request;


import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.regex.Pattern;

public class AlunoRegistro {


    private String nome;
    private String cpf;
    private String endereco;
    private String cep;
    private String email;
    private String numeroDeTelefone;
    @DateTimeFormat(pattern = "DD/MM/yyyy")
    private Date dataDeCadastrodo;
    private  Long IdCurso;

    public AlunoRegistro() {
    }

    public AlunoRegistro(String nome, String cpf, String endereco, String cep, String email, String numeroDeTelefone, Date dataDeCadastrodo, Long idCurso) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.cep = cep;
        this.email = email;
        this.numeroDeTelefone = numeroDeTelefone;
        this.dataDeCadastrodo = dataDeCadastrodo;
        IdCurso = idCurso;
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

    public Date getDataDeCadastrodo() {
        return dataDeCadastrodo;
    }

    public void setDataDeCadastrodo(Date dataDeCadastrodo) {
        this.dataDeCadastrodo = dataDeCadastrodo;
    }

    public Long getIdCurso() {
        return IdCurso;
    }

    public void setIdCurso(Long idCurso) {
        IdCurso = idCurso;
    }
}
