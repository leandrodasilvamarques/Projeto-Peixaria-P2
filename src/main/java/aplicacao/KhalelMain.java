package aplicacao;

import classes.Barco;
import classes.setores.Pescaria;

import javax.swing.*;

public class KhalelMain {
    public static void main(String[] args) {
        Pescaria pescaria = new Pescaria();

        pescaria.SETOR_EMBARCACAO.adicionaNovoBarco(new Barco(123));
        pescaria.SETOR_EMBARCACAO.adicionaNovoBarco(new Barco(143));
        pescaria.SETOR_EMBARCACAO.adicionaNovoBarco(new Barco(123432));
        pescaria.SETOR_EMBARCACAO.adicionaNovoBarco(new Barco(1232342132));
        pescaria.SETOR_EMBARCACAO.adicionaNovoBarco(new Barco(123432));

        JOptionPane.showMessageDialog(null, pescaria.SETOR_EMBARCACAO.listaBarcos);
    }

}
