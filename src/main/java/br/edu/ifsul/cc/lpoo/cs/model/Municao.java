package br.edu.ifsul.cc.lpoo.cs.model;

import java.util.List;

/**
 *
 * @author 20202pf.cc0002
 */
public class Municao {

    private Boolean explosiva;
    private Calibre calibre;
    private List<Arma> armas;

    public Municao() {
    }

    /**
     * @return the explosiva
     */
    public Boolean getExplosiva() {
        return explosiva;
    }

    /**
     * @param explosiva the explosiva to set
     */
    public void setExplosiva(Boolean explosiva) {
        this.explosiva = explosiva;
    }

    /**
     * @return the calibre
     */
    public Calibre getCalibre() {
        return calibre;
    }

    /**
     * @param calibre the calibre to set
     */
    public void setCalibre(Calibre calibre) {
        this.calibre = calibre;
    }

    /**
     * @return the armas
     */
    public List<Arma> getArmas() {
        return armas;
    }

    /**
     * @param armas the armas to set
     */
    public void setArmas(List<Arma> armas) {
        this.armas = armas;
    }
}
