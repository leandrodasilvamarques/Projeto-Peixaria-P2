package controladores;

import classes.Barco;
import classes.Financeiro;
import classes.RecursosHumanos;

import java.util.ArrayList;

public class Pescaria {

    private static ArrayList<Barco> barcos = new ArrayList<>();
    public static final  Financeiro financeiro = new Financeiro();
    public static final RecursosHumanos funcionarios = new RecursosHumanos();

    public static void adicionarBarco(Barco barco){
        barcos.add(barco);
    }

}
