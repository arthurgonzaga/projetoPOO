
package projeto;

import java.util.Arrays;

public class Mercadinho implements Cadastro {
    private final String nome;
    private final Proprietario nome_proprietario;
       private final Produto[] estoque;
      private static int Q;
    
      public Mercadinho(String nome, Proprietario proprietario){
          this.nome=nome;
          this.estoque=new Produto[1000];
          this.nome_proprietario=proprietario;
      }
      
      public String getNome(){
          return this.nome;
      }
public Proprietario getNome_proprietario(){
    return this.nome_proprietario;
}
public Produto[] getEstoque(){
    return this.estoque;
}
public boolean adicionar(Produto produto) {
 if(Q <1000){
     this.estoque[Q]=produto;
     ++Q;
     return true;
 }else{
     return false;
 }
}
    @Override
    public Produto consultar(int codigo){
    if (Q >0){
        for(int x = 0; x < Q; ++x) {
            if(this.estoque[x].getCodigo()==codigo){
                return this.estoque[x];
            }
        }
        return null;
    }else{
        return null;
    }
}
    @Override
    public boolean alterar(Produto produto) {
    for(int x = 0; x < Q; ++x) {
        if (this.estoque[x].getCodigo()==produto.getCodigo()){
            this.estoque[x]=produto;
            return true;
        }
    }
    return false;
}
    @Override
    public boolean remover(int codigo) {
    for(int x=0; x< Q; ++x){
        if(this.estoque[x].getCodigo()==codigo && x< Q){
    this.estoque[x]=this.estoque[x+1];
    --Q;
    return true;
        }
}
    return false;
}
    @Override
    public int quantidade(){
    return Q;
}
    @Override
    public double placmercadoria(){
    double preco = 0.0D;
    Produto[] varA=this.estoque;
    int varB=varA.length;
    
     for(int varC = 0; varC < varB; ++varC) {
       Produto p = varA[varC];
            preco += p.getPreco();
    }
return preco;
}
    @Override
    public Produto produtoold(){
    return null;
}
    @Override
    public Produto[] vencido(){
    return new Produto[0];
}
    @Override
    public String toString(){
return "Supermercado{nome='" + this.nome + '\'' + ", proprietario='" + this.nome_proprietario + '\'' + ", estoque=" + Arrays.toString(this.estoque) + '}';
}

    @Override
    public boolean incluirProduto(Produto var1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}