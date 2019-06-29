
package projeto;
interface Cadastro {
     boolean incluirProduto(Produto var1);

    Produto consultar(int var1);

    boolean alterar(Produto var1);

    boolean remover(int var1);

    int quantidade();

    double placmercadoria();

    Produto produtoold();

    Produto[] vencido();
}

