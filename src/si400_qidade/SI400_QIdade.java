/*
(c) Ivan L M Ricarte
 */
package si400_qidade;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ivan L M Ricarte <ricarte@ft.unicamp.br>
 */
public class SI400_QIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String nome;
            nome = args[0];
            int anoNasc;
            anoNasc = Integer.parseInt(args[1]);
            Pessoa p;
            p = new Pessoa(nome, anoNasc);
            String mensagem = "Idade de " + p.getNome();
            if (args.length == 3) {
                int anoRef;
                anoRef = Integer.parseInt(args[2]);
                mensagem = mensagem.concat(" em " + anoRef + ": " + p.calculaIdade(anoRef));
            } else {
                mensagem = mensagem.concat(": " + p.calculaIdade());
            }
            mensagem = mensagem.concat(" anos.");
            System.out.println(mensagem);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.err.println("Argumentos necessários: nome anoNascimento [anoReferencia]");
            Logger.getLogger(SI400_QIdade.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException ex) {
            System.err.println("Argumentos de ano devem ser numéricos");
            Logger.getLogger(SI400_QIdade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
