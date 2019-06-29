    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author weslley
 */
public class Limpeza extends Produto{
    private boolean nocivo;

      public Limpeza(int codigo, String descricao, LocalDate dataFabricacao,
                   LocalDate dataValidade, double preco, boolean nocivo) {
        super(codigo, descricao, dataFabricacao, dataValidade, preco);
        this.nocivo = nocivo;
    }
    public boolean isToxico(){
        return this.nocivo;
    }
    public void setToxico(boolean Toxico){
        this.nocivo=nocivo;
    }
}
