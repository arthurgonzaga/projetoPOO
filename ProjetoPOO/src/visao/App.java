package visao;

import controle.ControleCadastros;
import modelo.Produto;
import modelo.Mercadinho;

import java.util.Scanner;

public class App {

    private static Scanner entrada;

    public static void main(String[] args) {
        Produto produto;
        entrada = new Scanner(System.in);
        ControleCadastros controleCadastros = new ControleCadastros();
        Mercadinho Mercadinho = controleCadastros.cadastraMercadinhoProprietario();
        boolean continua = true;
        limpaTela();
        while(continua) {
            logoMercado(Mercadinho);
            System.out.println("[1] CADASTRAR PRODUTO\n[2] BUSCAR PRODUTO\n[3] REMOVER PRODUTO\n[4] ALTERAR" +
                    " PRODUTO\n[5] QUATIDADE DE PRODUTOS CADASTRADOS\n[6] PRODUTO MAIS ANTIGO NO ESTOQUE\n" +
                    "[7] PRODUTOS VENCIDOS\n[8] ENCERRAR");
            int escolha = entrada.nextInt();
            switch (escolha) {
                case 1: {
                    Produto p = controleCadastros.cadastraDadosProduto(Mercadinho);
                    if(Mercadinho.incluirProduto(p)){
                        System.out.println("Produto cadastrado com sucesso");
                    }else{
                        System.out.println("Estoque cheio");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Informe o codigo do produto");
                    int codigo = entrada.nextInt();
                    produto = Mercadinho.consultarProduto(codigo);
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
                    if (Mercadinho.removerestoque(codigo)) {
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
                    System.out.println("Existem " + Mercadinho.quantidadeProduto() + " em estoque");
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

    }

   

    private static void limpaTela(){
        for(int x=0; x<=10; x++) System.out.println("");
    }

    private static void logoMercado(Mercadinho Mercadinho) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
