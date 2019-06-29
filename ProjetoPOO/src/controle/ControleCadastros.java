/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelo.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class ControleCadastros {
    private Scanner entrada;
    private DateTimeFormatter formatoData;

    public ControleCadastros(){
        entrada = new Scanner(System.in);
        formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    }

    /**
     *
     * @param Mercadinho
     * @return
     */
    public Produto cadastraDadosProduto(Mercadinho Mercadinho){
        System.out.println("\n\n|---DADOS PRODUTO---|");
        System.out.println("Informe a descrição:");
        String descricao = entrada.nextLine();
        System.out.println("Informe a data de fabricação:");
        String data_de_fabricacao = entrada.nextLine();
        System.out.println("Informe a data de validade:");
        String dataValidade = entrada.nextLine();
        System.out.println("Informe o preco:");
        double preco = entrada.nextDouble();
        int codigo = geraCodigoProduto(Mercadinho);
        System.out.println("O código do produto é "+codigo);
        while(true){
            System.out.println("\n\nEscolha a categoria dos produtos, digite [1] para Alimentos" +
                    "[2] para Limpeza e [3] para Bebidas:");
            int escolha = entrada.nextInt();
            switch(escolha){
                case 1:{
                    System.out.println("Qual o tipo de classificação [1]NATURAL [2]ARTIFICIAL");
                    int opcao = entrada.nextInt();
                    String classificacao = (opcao==1)?"Natural" :"Artificial";
                    return new Alimento(codigo,descricao,LocalDate.parse(data_de_fabricacao,formatoData),
                            LocalDate.parse(dataValidade,formatoData),preco,classificacao);
                }
                case 2:{
                    System.out.println("O produto é nocivo [1]SIM [2]NÃO");
                    int opcao = entrada.nextInt();
                    boolean nocivo = (opcao==1)?true :false;
                CharSequence dataFabricacao = null;
                    return  new Limpeza(codigo,descricao,LocalDate.parse(dataFabricacao,formatoData),
                            LocalDate.parse(dataValidade,formatoData),preco,nocivo);
                }
                case 3:{
                    System.out.println("Informe a graduação alcoolica da bebida:");
                    int graduacaoAlcolica = entrada.nextInt();
                    return new Bebida(codigo,descricao,LocalDate.parse(data_de_fabricacao,formatoData),
                            LocalDate.parse(dataValidade,formatoData),preco,graduacaoAlcolica);

                }
                default:
                    System.out.println("VALOR INVÁLIDO");
            }
        }
    }

    public Mercadinho cadastraMercadinhoProprietario(){
        Scanner dadosMercadinho = new Scanner(System.in);
        System.out.println("**********Mercadinho*************");
        System.out.println("Informe o nome do Mercadinho:");
        String nomeMercadinho = entrada.nextLine();
        System.out.println("\n\n|---DADOS PROPRIETÁRIO---|");
        System.out.println("Informe o nome:");
        String nomeProprietario = entrada.nextLine();
        System.out.println("Informe a data de nascimento:");
        String dataNascimento = entrada.nextLine();
        System.out.println("Informe o sexo:");
        String sexo = entrada.nextLine();
        sexo = ((sexo.charAt(0)=='m')||(sexo.charAt(0)=='M'))?"Masculino":"Feminino";
        return new Mercadinho(nomeMercadinho,new Proprietario(nomeProprietario,
                LocalDate.parse(dataNascimento,formatoData),sexo));
    }

    private int geraCodigoProduto(Mercadinho Mercadinho){
        int codigo = geraCodigo();
        int quantidade = 0;
        Produto[] produtos = Mercadinho.getEstoque();
        while(true){
            for(int x=0; x<Mercadinho.Q(); x++){
                if(produtos[x].getCodigo()!=codigo){
                    quantidade++;
                }
            }
            if(quantidade==Mercadinho.Q()){
                break;
            }else{
                codigo = geraCodigo();
            }
        }
        return codigo;
    }

    private int geraCodigo(){
        Random aleatorio = new Random();
        int codigo = aleatorio.nextInt();
        while(true){
            if(codigo>0){
                break;
            }else{
                codigo = aleatorio.nextInt();
            }
        }
        return codigo;
    }
}