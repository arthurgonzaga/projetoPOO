/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.time.LocalDate;

/**
 *
 * @author weslley
 */
public class Alimento extends Produto {
private String tipo;

    public Alimento(int codigo, String descricao, LocalDate data_de_fabricacao, LocalDate data_de_validade, double preco) {
        super(codigo, descricao, data_de_fabricacao, data_de_validade, preco);
        this.tipo=tipo;
    }
 public String getTipo() {
        return this.tipo;
    }
     public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}



