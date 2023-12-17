package Universidade.dto.request;


import java.util.Date;

public class AlunoRegistro {


    private String nomeDTO;
    private String cpfDTO;
    private String enderecoDTO;
    private String cepDTO;
    private String emailDTO;
    private String numeroDeTelefone;
    private String codigoDoAlunoDTO;
    private Date dataDeCadastrodoDTO;
    private  Integer IdCurso;


    public String getNomeDTO() {
        return nomeDTO;
    }

    public void setNomeDTO(String nomeDTO) {
        this.nomeDTO = nomeDTO;
    }

    public String getCpfDTO() {
        return cpfDTO;
    }

    public void setCpfDTO(String cpfDTO) {
        this.cpfDTO = cpfDTO;
    }

    public String getEnderecoDTO() {
        return enderecoDTO;
    }

    public void setEnderecoDTO(String enderecoDTO) {
        this.enderecoDTO = enderecoDTO;
    }

    public String getCepDTO() {
        return cepDTO;
    }

    public void setCepDTO(String cepDTO) {
        this.cepDTO = cepDTO;
    }

    public String getEmailDTO() {
        return emailDTO;
    }

    public void setEmailDTO(String emailDTO) {
        this.emailDTO = emailDTO;
    }

    public String getNumeroDeTelefone() {
        return numeroDeTelefone;
    }

    public void setNumeroDeTelefone(String numeroDeTelefone) {
        this.numeroDeTelefone = numeroDeTelefone;
    }

    public String getCodigoDoAlunoDTO() {
        return codigoDoAlunoDTO;
    }

    public void setCodigoDoAlunoDTO(String codigoDoAlunoDTO) {
        this.codigoDoAlunoDTO = codigoDoAlunoDTO;
    }

    public Date getDataDeCadastrodoDTO() {
        return dataDeCadastrodoDTO;
    }

    public void setDataDeCadastrodoDTO(Date dataDeCadastrodoDTO) {
        this.dataDeCadastrodoDTO = dataDeCadastrodoDTO;
    }

    public Integer getIdCurso() {
        return IdCurso;
    }

    public void setIdCurso(Integer idCurso) {
        IdCurso = idCurso;
    }
}
