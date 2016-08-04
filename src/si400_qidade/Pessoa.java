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
    private int anoDeNascimento;
    
    public Pessoa(String nome, int nasc) {
        this.nome = nome;
        anoDeNascimento = nasc;
    }
    
    public int calculaIdade(int ano) {
        return ano - anoDeNascimento;
    }

    public int calculaIdade() {
        int anoCorrente = 2016;        
        return calculaIdade(anoCorrente);
    } 
    
    public String getNome() {
        return nome;
    }
}

