package br.edu.ifsul.cc.lpoo.cs.model;

import java.util.List;

/**
 *
 * @author 20202pf.cc0002
 */
public class Local {

    private Integer id;
    private String nome;
    private String latitude;
    private String longitude;
    private List<Mapa> mapa;
    private List<Objetivo> objetivos;

    public Local() {
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
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * @param latitude the latitude to set
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * @return the longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * @param longitude the longitude to set
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * @return the mapa
     */
    public List<Mapa> getMapa() {
        return mapa;
    }

    /**
     * @param mapa the mapa to set
     */
    public void setMapa(List<Mapa> mapa) {
        this.mapa = mapa;
    }

    /**
     * @return the objetivos
     */
    public List<Objetivo> getObjetivos() {
        return objetivos;
    }

    /**
     * @param objetivos the objetivos to set
     */
    public void setObjetivos(List<Objetivo> objetivos) {
        this.objetivos = objetivos;
    }

}
