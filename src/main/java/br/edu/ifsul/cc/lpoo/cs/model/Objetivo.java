package br.edu.ifsul.cc.lpoo.cs.model;

import java.util.List;

/**
 *
 * @author 20202pf.cc0002
 */
public class Objetivo {

    private Integer id;
    private String descricao;
    private Integer pontos;
    private List<Local> locais;
    private ResultadoID resultadoID;

    public Objetivo() {

    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the pontos
     */
    public Integer getPontos() {
        return pontos;
    }

    /**
     * @param pontos the pontos to set
     */
    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    /**
     * @return the locais
     */
    public List<Local> getLocais() {
        return locais;
    }

    /**
     * @param locais the locais to set
     */
    public void setLocais(List<Local> locais) {
        this.locais = locais;
    }

    /**
     * @return the resultadoID
     */
    public ResultadoID getResultadoID() {
        return resultadoID;
    }

    /**
     * @param resultadoID the resultadoID to set
     */
    public void setResultadoID(ResultadoID resultadoID) {
        this.resultadoID = resultadoID;
    }

}
