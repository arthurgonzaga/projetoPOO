
package projeto;
import java.time.LocalDate;

/**
 *
 * @author weslley
 */
public class Proprietario{

    public static void main(String[] args) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
private String nome_proprietario;
private LocalDate dataNascimento;
private String sexo;

public Proprietario(String nome,LocalDate dataNascimento, String sexo){
    this.nome_proprietario=nome;
    this.dataNascimento=dataNascimento;
    this.sexo=sexo;
}
public String getNome_proprietario(){
    return this.nome_proprietario;
}
public void setNome_proprietario(String nome_proprietario){
    this.nome_proprietario=nome_proprietario;
}
public LocalDate getDataNascimento() {
return this.dataNascimento;    
}
public void setDataNascimento(LocalDate dataNascimento){
    this.dataNascimento=dataNascimento;
}
public String getSexo(){
    return this.sexo;
}
public void setSexo(String sexo) {
    this.sexo=sexo;
}
}
