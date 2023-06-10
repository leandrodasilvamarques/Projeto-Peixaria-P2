package classes.setores.registro;

import classes.setores.embarcacao.Barco;
import classes.setores.empresa.Pescaria;
import classes.setores.recursosHumanos.Funcionario;
import classes.setores.recursosHumanos.Pescador;

import java.util.ArrayList;
import java.util.Date;

public class SetorRegistro {
    //atributos
    private ArrayList<Pesca> arrayListDeTodoAsPescas = new ArrayList<>();
    //

    //getters setters
    public double getTotalDeQuilosDePeixeDeTodasAsPescas() {
        double somaQuilos = 0;
        for (Pesca percorrePesca : arrayListDeTodoAsPescas) {
            if (percorrePesca.getPesoEmQuilos() > 0) {
                somaQuilos += percorrePesca.getPesoEmQuilos();
            }
        }
        return somaQuilos;
    }
    public void getPescaPelaData(Date digiteUmaData) {
        for (Pesca percorreArrayDePescas : arrayListDeTodoAsPescas) {
            if (percorreArrayDePescas.getDataDaPesca() == digiteUmaData) {
                System.out.println("Pescas com essa data:\n" + percorreArrayDePescas + "\n");
            }
        }
    }
    public String getRegistros() {
        return Pescaria.SETOR_EMBARCACAO.getListaDeBarcos().toString();
    }
    //

    //metodos para aplicação
    public void adicionarPesca(Pesca pesca) {
        arrayListDeTodoAsPescas.add(pesca);
    }
    public double subtracaoDeQuilosDePeixe(double quantidadeParaSubtrair){
        return getTotalDeQuilosDePeixeDeTodasAsPescas() - quantidadeParaSubtrair;
    }
    //


    @Override
    public String toString() {
        return "SetorRegistro{" +
                "arrayListDeTodoAsPescas=" + arrayListDeTodoAsPescas +
                '}';
    }
}
