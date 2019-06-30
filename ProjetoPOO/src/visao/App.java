package visao;

import controle.ControleCadastros;
import modelo.Produto;
import modelo.Mercadinho;

import java.util.Scanner;

public class App {

    private static Scanner entrada;
    private static Produto produto;
    private static boolean continua;
    private static ControleCadastros controleCadastros;
    private static Mercadinho mercadinho;


    public static void main(String[] args) {
        entrada = new Scanner(System.in);
        controleCadastros = new ControleCadastros();
        mercadinho = controleCadastros.cadastraMercadinhoProprietario();
        continua = true;
        limpaTela();
        while(continua) {
            //logoMercado(Mercadinho);
            System.out.println("[1] CADASTRAR PRODUTO\n[2] BUSCAR PRODUTO\n[3] REMOVER PRODUTO\n[4] ALTERAR" +
                    " PRODUTO\n[5] QUATIDADE DE PRODUTOS CADASTRADOS\n[6] PRODUTO MAIS ANTIGO NO ESTOQUE\n" +
                    "[7] PRODUTOS VENCIDOS\n[8] ENCERRAR");
            int escolha = entrada.nextInt();
            escolher(escolha);
        }

    }

    private static void escolher(int escolha){
        switch (escolha) {
                case 1: {
                    Produto produto = controleCadastros.cadastraDadosProduto(mercadinho);
                    if(mercadinho.incluirProduto(produto)){
                        System.out.println("Produto cadastrado com sucesso");
                    }else{
                        System.out.println("Estoque cheio");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Informe o codigo do produto");
                    int codigo = entrada.nextInt();
                    produto = mercadinho.consultarProduto(codigo);
                    if (produto == null) {
                        System.out.println("Produto não existe");
                    } else {
                        System.out.println(produto.toString());
                    }
                    break;
                }
                case 3: {
                    System.out.println("Informe o codigo do produto:");
                    int codigo = entrada.nextInt();
                    if (mercadinho.removerEstoque(codigo)) {
                        System.out.println("Produto removido com sucesso");
                    } else {
                        System.out.println("Produto não existe");
                    }
                    break;
                }
                case 4: {
                    break;
                }
                case 5: {
                    System.out.println("Existem " + mercadinho.getQuantidade() + " em estoque");
                    break;
                }
                case 6: {
                    break;
                }
                case 7: {
                    break;
                }
                case 8: {
                    continua = false;
                    break;
                }
                default:
                    System.out.println("VALOR INVALIDO");
            }
            System.out.println("\n\n");
    }
    
    private static void limpaTela(){
        for(int x=0; x<=10; x++) System.out.println("");
    }

    private static void logoMercado(Mercadinho Mercadinho) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
