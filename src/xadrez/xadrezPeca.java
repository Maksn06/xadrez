
package xadrez;
import Tabuleiro.Tabuleiro;
import Tabuleiro.Peca;

public class xadrezPeca extends Peca{
    private Cor cor;

    public xadrezPeca(Tabuleiro tabuleiro) {
        super(tabuleiro);
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }
    
}
