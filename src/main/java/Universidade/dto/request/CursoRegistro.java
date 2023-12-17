package Universidade.dto.request;


import java.util.Date;

public class CursoRegistro {

    private  String nomeDoCursoDTO;

    private String cargaHorariaDTO;
    private Date dataDeCadastroCDTO;
    private String codigoDoCursoDTO;

    public String getNomeDoCursoDTO() {
        return nomeDoCursoDTO;
    }

    public void setNomeDoCursoDTO(String nomeDoCursoDTO) {
        this.nomeDoCursoDTO = nomeDoCursoDTO;
    }

    public String getCargaHorariaDTO() {
        return cargaHorariaDTO;
    }

    public void setCargaHorariaDTO(String cargaHorariaDTO) {
        this.cargaHorariaDTO = cargaHorariaDTO;
    }

    public Date getDataDeCadastroCDTO() {
        return dataDeCadastroCDTO;
    }

    public void setDataDeCadastroCDTO(Date dataDeCadastroCDTO) {
        this.dataDeCadastroCDTO = dataDeCadastroCDTO;
    }

    public String getCodigoDoCursoDTO() {
        return codigoDoCursoDTO;
    }

    public void setCodigoDoCursoDTO(String codigoDoCursoDTO) {
        this.codigoDoCursoDTO = codigoDoCursoDTO;
    }
}
