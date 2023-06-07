package classes.setores;

import classes.Barco;

import java.util.ArrayList;
import java.util.List;

public class SetorEmbarcacao {

    public List<Barco> listaBarcos;

    public SetorEmbarcacao(){
        listaBarcos = new ArrayList<>();
    }

    public void adicionaNovoBarco(Barco barco){
        listaBarcos.add(barco);
    }


}
