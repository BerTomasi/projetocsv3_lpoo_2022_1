package br.edu.ifsul.cc.lpoo.cs.model;

import java.io.Serializable;

/**
 *
 * @author 20202pf.cc0002
 */
@Entity
@Table(name = "tb_endereco")
public class Endereco implements Serializable{

@Id

//atributos seguindo a nomenclatra do DC (diagrama de classes)
    private Integer id;
    private String cep;
    private String complemento;
    
    public Endereco () { // construtor sem parametros
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
