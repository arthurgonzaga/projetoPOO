/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.time.LocalDate;

/**
 *
 * @author weslley
 */
public class Limpeza extends Produto{
    private boolean Toxico;

    public Limpeza(int codigo, String descricao, LocalDate data_de_fabricacao, LocalDate data_de_validade, double preco) {
        super(codigo, descricao, data_de_fabricacao, data_de_validade, preco);
    this.Toxico=Toxico;
    }
    public boolean isToxico(){
        return this.Toxico;
    }
    public void setToxico(boolean Toxico){
        this.Toxico=Toxico;
    }
}
