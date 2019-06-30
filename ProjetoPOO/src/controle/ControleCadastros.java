package controle;

import modelo.tiposDeProdutos.Bebida;
import modelo.tiposDeProdutos.Alimento;
import modelo.tiposDeProdutos.Limpeza;
import modelo.*;
import modelo.Mercadinho;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ControleCadastros {

    private Scanner entrada;
    private DateTimeFormatter formatoData;

    
    // Dados do produto a ser cadastrado 
    String descricao;
    String data_de_fabricacao;
    String dataValidade;
    double preco;
    int codigo;
    
    // Dados do mercadinho/propietario a ser cadastrado
    String nomeMercadinho;
    String nomeProprietario;
    String dataNascimento;
    String sexo;
    
    // Produto a ser cadastrado
    Produto produto;
    
    // Mercado a ser cadastrado 
    Mercadinho mercadinho;
    
    public ControleCadastros() {
        entrada = new Scanner(System.in);
        formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    }

    /**
     *
     * @param Mercadinho
     * @return
     */
    public Produto cadastraDadosProduto(Mercadinho mercadinho) {
        this.mercadinho = mercadinho;
        perguntarDadosProduto();
        Produto produto = new Produto(codigo, descricao, 
                            LocalDate.parse(data_de_fabricacao, formatoData),
                            LocalDate.parse(dataValidade, formatoData), preco);
        while (true) {
            System.out.println("\n\nEscolha a categoria dos produtos:\n"
                    + "[1] para Alimentos\n"
                    + "[2] para Limpeza\n"
                    + "[3] para Bebidas");
            int escolha = entrada.nextInt();
            switch (escolha) {
                case 1: {
                    System.out.println("Qual o tipo de classificação [1]NATURAL [2]ARTIFICIAL");
                    int opcao = entrada.nextInt();
                    String classificacao = (opcao == 1) ? "Natural" : "Artificial";
                    produto = new Alimento(codigo, descricao, 
                            LocalDate.parse(data_de_fabricacao, formatoData),
                            LocalDate.parse(dataValidade, formatoData), preco, classificacao);
                    break;
                }
                case 2: {
                    System.out.println("O produto é nocivo [1]SIM [2]NÃO");
                    int opcao = entrada.nextInt();
                    boolean nocivo = (opcao == 1) ? true : false;
                    produto = new Limpeza(codigo, descricao, 
                            LocalDate.parse(data_de_fabricacao, formatoData),
                            LocalDate.parse(dataValidade, formatoData), preco, nocivo);
                    break;
                }
                case 3: {
                    System.out.println("Informe a graduação alcoolica da bebida:");
                    int graduacaoAlcolica = entrada.nextInt();
                    produto = new Bebida(codigo, descricao, 
                            LocalDate.parse(data_de_fabricacao, formatoData),
                            LocalDate.parse(dataValidade, formatoData), preco, graduacaoAlcolica);
                    break;
                }
                default:
                    System.out.println("VALOR INVÁLIDO");
            }
            System.out.println("O código do produto é " + codigo);
            return produto;
        }
    }
    
    // Seta todos os dados do produto
    private void perguntarDadosProduto(){
        System.out.println("\n\n|---DADOS PRODUTO---|");
        System.out.println("Informe a descrição:");
        descricao = entrada.nextLine();
        System.out.println("Informe a data de fabricação:");
        data_de_fabricacao = entrada.nextLine();
        System.out.println("Informe a data de validade:");
        dataValidade = entrada.nextLine();
        System.out.println("Informe o preco:");
        preco = Double.valueOf(entrada.nextLine());
        codigo = geraCodigoProduto();
    }

    //Seta todos os dados do Mercadinho/Propietário
    private void perguntarDadosPropietario(){
        System.out.println("**********Mercadinho*************");
        System.out.println("Informe o nome do Mercadinho:");
        nomeMercadinho = entrada.nextLine();
        System.out.println("\n\n|---DADOS PROPRIETÁRIO---|");
        System.out.println("Informe o nome:");
        nomeProprietario = entrada.nextLine();
        System.out.println("Informe a data de nascimento (dd/MM/yyyy):");
        dataNascimento = entrada.nextLine();
        System.out.println("Informe o sexo:");
        String entradaSexo = entrada.nextLine();
        if(entradaSexo.charAt(0) == 'm' || entradaSexo.charAt(0) == 'M'){
            sexo = "Masculino";
        }else{
            sexo = "Feminino";
        }
    }
    
    public Mercadinho cadastraMercadinhoProprietario() {
        perguntarDadosPropietario();
        return new Mercadinho(nomeMercadinho, new Proprietario(nomeProprietario,
                LocalDate.parse(dataNascimento, formatoData), sexo));
    }

    private int geraCodigoProduto() {
        int quantidadeDeProdutos = mercadinho.getQuantidade();
        codigo = quantidadeDeProdutos + 1;
        return codigo;
    }

}
