package br.edu.ifsul.cc.lpoo.cs.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author 20202pf.cc0002
 */
@Entity
@Table(name = "tb_itensCompra")

public class ItensCompra implements Serializable {

    @Id
    @SequenceGenerator(name = "seq_itensCompra", sequenceName = "seq_itensCompra_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_itensCompra", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(nullable = false)
    private String quantidade;

    @Column(nullable = false)
    private Float valor;

    @OneToMany(mappedBy = "itensCompra")
    private Compra compra; //agregação por composiçãoc - ref. ent. forte.

    public ItensCompra() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    /**
     * @return the compra
     */
    public Compra getCompra() {
        return compra;
    }

    /**
     * @param compra the compra to set
     */
    public void setCompra(Compra compra) {
        this.compra = compra;
    }

}
