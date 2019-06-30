/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.tiposDeProdutos;

import java.time.LocalDate;
import modelo.Produto;

/**
 *
 * @author weslley
 */
public class Alimento extends Produto {

    private String tipo;
    private final String classificacao;

    public Alimento(int codigo, String descricao, LocalDate dataFabricacao,
            LocalDate dataValidade, double preco, String classificacao) {
        super(codigo, descricao, dataFabricacao, dataValidade, preco);
        this.classificacao = classificacao;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
