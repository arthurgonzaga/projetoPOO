/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;
import java.time.LocalDate;
public class Produto {
public static void main (String[] args) {
private int codigo;
private String descricao;
private LocalDate data_de_fabricacao;
private LocalDate data_de_validade;
private double preco;

public Produto(int codigo, String descricao, java.time.LocalDate data_de_fabricacao, java.time.LocalDate data_de_validade, double preco){
this.codigo = codigo;
        this.descricao = descricao;
        this.data_de_fabricacao = this.data_de_fabricacao;
        this.data_de_validade = this.data_de_validade;
        this.preco = preco;
}
public int getCodigo() {
 return this.codigo;
}
public void setCodigo(int codigo){
this.codigo = codigo;
}
public String setDescricao(){
    return this.descricao;
}
public void setDescricao(java.lang.String descricao){
this.descricao=descricao;
}
public LocalDate getDateFabricacao(){
    return this.data_de_fabricacao;
}
    public void setData_de_fabricacao(LocalDate data_de_fabricacao) {
  this.data_de_fabricacao=data_de_fabricacao;
    }
public LocalDate getDateValidade(){
return this.data_de_validade;
}
public void setData_de_validade(java.time.LocalDate data_de_validade){
    this.data_de_validade=this.data_de_validade;
}
public double getPreco(){
return this.preco;
}
public void setPreco(double preco){
this.preco = preco;
}
@Override
public String toString(){

return "Produto{codigo=" + this.codigo + ", descricao='" + this.descricao + '\'' + ", dataFabricacao=" + this.data_de_fabricacao + ", dataValidade=" + this.data_de_validade + ", preco=" + this.preco + '}';
}
} 
    

