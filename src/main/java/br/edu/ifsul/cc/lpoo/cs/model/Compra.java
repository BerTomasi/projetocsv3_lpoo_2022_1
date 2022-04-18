package br.edu.ifsul.cc.lpoo.cs.model;

import java.util.Calendar;
import java.util.List;

/**
 *
 * @author 20202pf.cc0002
 */
public class Compra {
    private Integer id;
    private Calendar data;
    private Float total;
    private Jogador jogador;
    private List<ItensCompra> intensCompra;
    
    public Compra() {
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public List<ItensCompra> getIntensCompra() {
        return intensCompra;
    }

    public void setIntensCompra(List<ItensCompra> intensCompra) {
        this.intensCompra = intensCompra;
    }
}
