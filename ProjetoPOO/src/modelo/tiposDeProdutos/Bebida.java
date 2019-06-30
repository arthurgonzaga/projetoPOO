/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.tiposDeProdutos;

import java.time.LocalDate;
import modelo.Produto;

public class Bebida extends Produto {

    private int graduacaoAlocolica;

    public Bebida(int codigo, String descricao, LocalDate dataFabricacao, LocalDate dataValidade, double preco, int graduacaoAlocolica) {
        super(codigo, descricao, dataFabricacao, dataValidade, preco);
        this.graduacaoAlocolica = graduacaoAlocolica;
    }

    public int getGraduacaoAlocolica() {
        return this.graduacaoAlocolica;
    }

    public void setGraduacaoAlocolica(int graduacaoAlocolica) {
        this.graduacaoAlocolica = graduacaoAlocolica;
    }
}
