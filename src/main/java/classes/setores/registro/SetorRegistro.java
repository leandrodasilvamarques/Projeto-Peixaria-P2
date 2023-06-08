package classes.setores.registro;

import classes.setores.embarcacao.Barco;
import classes.setores.empresa.Pescaria;

import java.util.ArrayList;

public class SetorRegistro {

    //atributos
    public static ArrayList<Pesca> todoasPescas = new ArrayList<>();
    //

    //getters setters
    public static Barco getBarcoPorPesca(Pesca pesca){
        return Pescaria.SETOR_EMBARCACAO.getBarcoPorPesca(pesca);
    }
    //

    //metodos para aplicação
    public static void adicionarPesca(Pesca pesca){
        todoasPescas.add(pesca);
    }
    //
}
