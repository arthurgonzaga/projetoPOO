package modelo;

import java.util.ArrayList;
import java.util.Arrays;
import modelo.*;

public class Mercadinho implements Cadastro {

    private final String nome;
    private final Proprietario proprietario;
    private final ArrayList<Produto> estoque;
    private static int quantidade;

    public Mercadinho(String nome, Proprietario proprietario) {
        this.nome = nome;
        this.proprietario = proprietario;
        estoque = new ArrayList<>(1000);
        quantidade = estoque.size();
        
    }

    public String getNome() {
        return this.nome;
    }

    public Proprietario getproprietario() {
        return proprietario;
    }

    public ArrayList<Produto> getEstoque() {
        return this.estoque;
    }
    public boolean isLimpo(){
        if(estoque.isEmpty()){
            return true;
        }
        return false;
    }

    public boolean adicionar(Produto produto) {
        if (quantidade < 1000) {
            estoque.add(produto);
            ++quantidade;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Produto consultar(int codigo) {
        if (quantidade > 0) {
            for (int x = 0; x < quantidade; ++x) {
                if (estoque.get(x).getCodigo() == codigo) {
                    return estoque.get(x);
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @Override
    public boolean alterar(Produto produto) {
        for (int x = 0; x < quantidade; ++x) {
            if (estoque.get(x).getCodigo() == produto.getCodigo()) {
                estoque.add(x, produto);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remover(int codigo) {
        for (int x = 0; x < quantidade; x++) {
            
            if (estoque.get(x).getCodigo() == codigo) {
                estoque.remove(x);
                quantidade--;
                return true;
            }
            
        }
        return false;
    }

    @Override
    public int quantidade() {
        return quantidade;
    }

    @Override
    public double placmercadoria() {
        double preco = 0.0D;

        for (int indice = 0; indice < estoque.size(); ++indice) {
            Produto produto = estoque.get(indice);
            preco += produto.getPreco();
        }
        return preco;
    }

    @Override
    public Produto produtoold() {
        return null;
    }

    @Override
    public Produto[] vencido() {
        return new Produto[0];
    }
    
    @Override
    public String toString() {
        return "Supermercado{\n    "
                + "nome= '" + nome + '\'' + ",\n    "
                + "proprietario= '" + proprietario + '\'' + ",\n    "
                + "estoque= " + estoque.toString() + "\n"
                + "}";
    }

    @Override
    public boolean incluirProduto(Produto produto) {
        return estoque.add(produto);
    }
    
    public int getQuantidade() {
        return estoque.size();
    }

    public boolean removerEstoque(int codigo) {
        Produto produto = new Produto(codigo);
        return estoque.remove(produto);
    }

    public Produto consultarProduto(int codigo) {
        return estoque.get(codigo - 1);
    }

    public Proprietario getProprietario() {
        return proprietario;
    }
}
