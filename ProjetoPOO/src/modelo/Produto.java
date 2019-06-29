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
    private LocalDate data_de_fabricacao;
    private LocalDate data_de_validade;
    private double preco;

    public Produto(int codigo, String descricao, LocalDate dataFabricacao, LocalDate dataValidade, double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.data_de_fabricacao = dataFabricacao;
        this.data_de_validade = dataValidade;
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

    public LocalDate getData_de_fabricacao() {
        return this.data_de_fabricacao;
    }

    public void setData_de_fabricacao(LocalDate data_de_fabricacao) {
        this.data_de_fabricacao = data_de_fabricacao;
    }

    public LocalDate getData_de_validade() {
        return this.data_de_validade;
    }

    public void setData_de_validade(LocalDate data_de_validade) {
        this.data_de_validade = data_de_validade;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{codigo=" + this.codigo + ", descricao='" + this.descricao + '\'' + ", dataFabricacao=" + this.data_de_fabricacao + ", dataValidade=" + this.data_de_validade + ", preco=" + this.preco + '}';
    }
  
public static void main (String[] args) {
}
}
