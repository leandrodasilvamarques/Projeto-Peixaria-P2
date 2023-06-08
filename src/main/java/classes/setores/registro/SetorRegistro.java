package classes.setores.registro;

import classes.setores.embarcacao.Barco;
import classes.setores.empresa.Pescaria;

import java.util.ArrayList;

public class SetorRegistro {

    public static ArrayList<Pesca> todoasPescas = new ArrayList<>();

    public static void adicionarPesca(Pesca pesca){
        todoasPescas.add(pesca);
    }

    public static Barco getBarcoPorPesca(Pesca pesca){
       return Pescaria.SETOR_EMBARCACAO.getBarcoPorPesca(pesca);
    }
}
