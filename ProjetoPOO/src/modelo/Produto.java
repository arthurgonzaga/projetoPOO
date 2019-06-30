/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;

public class Produto {

    private int codigo;
    private String descricao;
    private LocalDate dataDeFabricacao;
    private LocalDate dataDeValidade;
    private double preco;

    public Produto(int codigo) {
        this.codigo = codigo;
    }

    public Produto(int codigo, String descricao, LocalDate dataDeFabricacao, LocalDate dataDeValidade, double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.dataDeFabricacao = dataDeFabricacao;
        this.dataDeValidade = dataDeValidade;
        this.preco = preco;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataDeFabricacao() {
        return dataDeFabricacao;
    }

    public void setDataDeFabricacao(LocalDate dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
    }

    public LocalDate getDataDeValidade() {
        return this.dataDeValidade;
    }

    public void setDataDeValidade(LocalDate dataDeValidade) {
        dataDeValidade = dataDeValidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{\n    "
                + "codigo= " + codigo + ",\n    "
                + "descricao= '" + descricao + '\'' + ",\n    "
                + "dataFabricacao= " + dataDeFabricacao + ",\n    "
                + "dataValidade= " + dataDeValidade + ",\n    "
                + "preco= " + preco + "\n}";
    }

}
