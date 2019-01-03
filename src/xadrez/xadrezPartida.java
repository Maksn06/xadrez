package xadrez;

import Tabuleiro.Tabuleiro;

public class xadrezPartida {

    private Tabuleiro tabuleiro;

    public xadrezPartida() {
        tabuleiro = new Tabuleiro(8, 8);
    }

    public xadrezPeca[][] getPecas() {
        xadrezPeca[][] mat = new xadrezPeca[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for (int i = 0; i < tabuleiro.getLinhas(); i++) {
            for (int j = 0; j < tabuleiro.getColunas(); j++) {

            }
        }
        return mat;
    }
}
