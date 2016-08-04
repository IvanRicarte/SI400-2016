/*
(c) Ivan L M Ricarte
 */
package si400_qidade;

/**
 * Classe que mantém nome e data de nascimento.
 * 
 * @author Ivan L M Ricarte <ricarte@ft.unicamp.br>
 */
public class Pessoa {
    private String nome;
    private int anoNascimento;
    
    public Pessoa(String nome, int nasc) {
        this.nome = nome;
        anoNascimento = nasc;
    }
    
    public int calculaIdade(int ano) {
        return ano - anoNascimento;
    }

    public int calculaIdade() {
        // TODO: obter ano automaticamente
        int anoCorrente = 2016;        
        return calculaIdade(anoCorrente);
    } 
    
    public String getNome() {
        return nome;
    }
}

