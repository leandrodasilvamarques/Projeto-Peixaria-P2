package classes.setores.registro;

import classes.setores.embarcacao.Barco;
import classes.setores.empresa.Pescaria;

import java.util.ArrayList;
import java.util.Date;

public class SetorRegistro {

    //atributos
    public static ArrayList<Pesca> arrayListDeTodoAsPescas = new ArrayList<>();
    //

    //getters setters
    public static void getPescaPelaData(Date digiteUmaData){
        for (Pesca percorreArrayDePescas : arrayListDeTodoAsPescas) {
            if(percorreArrayDePescas.getDataDaPesca() == digiteUmaData){
                System.out.println("Pescas com essa data:\n" + percorreArrayDePescas + "\n");
            }
        }
    }
    public static Barco getBarcoPorPesca(Pesca pesca){
        return Pescaria.SETOR_EMBARCACAO.getBarcoPorPesca(pesca);
    }
    public static String getRegistros(){
        return Pescaria.SETOR_EMBARCACAO.getListaDeBarcos().toString();
    }
    //

    //metodos para aplicação
    public static void adicionarPesca(Pesca pesca){
        arrayListDeTodoAsPescas.add(pesca);
    }
    //
}
