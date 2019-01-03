
package Aplicacao;

import xadrez.xadrezPartida;

public class Xadrez {

    public static void main(String[] args) {
        
        xadrezPartida partida = new xadrezPartida();
        UI.printTabuleiro(partida.getPecas());
    }
    
}
