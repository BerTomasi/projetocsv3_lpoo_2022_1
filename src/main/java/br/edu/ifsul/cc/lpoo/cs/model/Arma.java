package br.edu.ifsul.cc.lpoo.cs.model;

import java.util.List;

/**
 *
 * @author 20202pf.cc0002
 */
public class Arma extends Artefato {

    private Float comprimento_cano;
    private Tipo tipo;
    private List<Municao> municao;

    public Arma() {
    }

    /**
     * @return the comprimento_cano
     */
    public Float getComprimento_cano() {
        return comprimento_cano;
    }

    /**
     * @param comprimento_cano the comprimento_cano to set
     */
    public void setComprimento_cano(Float comprimento_cano) {
        this.comprimento_cano = comprimento_cano;
    }

    /**
     * @return the tipo
     */
    public Tipo getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the municao
     */
    public List<Municao> getMunicao() {
        return municao;
    }

    /**
     * @param municao the municao to set
     */
    public void setMunicao(List<Municao> municao) {
        this.municao = municao;
    }

}
