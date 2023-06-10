package classes.setores.registro;

import classes.setores.embarcacao.Barco;
import classes.setores.empresa.Pescaria;
import classes.setores.recursosHumanos.Pescador;

import java.util.ArrayList;
import java.util.Date;

public class SetorRegistro {
    //atributos
    private ArrayList<Pesca> arrayListDeTodoAsPescas = new ArrayList<>();
    private ArrayList<SetorRegistro> historicosDosPescadores = new ArrayList<>();
    //

    //getters setters
    public double simulaGetTotalDeQuilosDePeixeDeTodasAsPescas() {
        double somaQuilos = 0;
        for (Pesca percorrePesca : arrayListDeTodoAsPescas) {
            if (percorrePesca.getPesoEmQuilos() > 0) {
                somaQuilos += percorrePesca.getPesoEmQuilos();
            }
        }
        return somaQuilos;
    }
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
    public Barco getBarcoPorPesca(Pesca pesca) {
        return Pescaria.SETOR_EMBARCACAO.getBarcoPorPesca(pesca);
    }
    public String getRegistros() {
        return Pescaria.SETOR_EMBARCACAO.getListaDeBarcos().toString();
    }
    public ArrayList<SetorRegistro> getHistoricosDosPescadores() {
        return historicosDosPescadores;
    }
    public void setHistoricosDosPescadores(ArrayList<SetorRegistro> historicosDosPescadores) {
        this.historicosDosPescadores = historicosDosPescadores;
    }
    public double getRendaBrutaTotal(){

        double valor = 0;

        for (Pesca pescas: arrayListDeTodoAsPescas){

            valor+= pescas.getRendaBrutPesca();
        }
        return valor;
    }
    public double getRendaLiquidaTotal(){

        double valor = 0;

        for (Pesca pescas: arrayListDeTodoAsPescas){

            valor+= pescas.getLucroPesca();
        }
        return valor;

    }
    public double getDespesaTotal(){

        double valor = 0;

        for (Pesca pescas: arrayListDeTodoAsPescas){

            valor+= pescas.getDespesaPesca();
        }
        return valor;

    }
    //

    //metodos para aplicação
    public void adicionarPesca(Pesca pesca) {
        arrayListDeTodoAsPescas.add(pesca);
    }
    public double simulacaoSubtracaoDeQuilosDePeixe(double quantidadeParaSubtrair) {
        return simulaGetTotalDeQuilosDePeixeDeTodasAsPescas() - quantidadeParaSubtrair;
    }
    public double subtracaoDeQuilosDePeixe(double quantidadeParaSubtrair){
        return getTotalDeQuilosDePeixeDeTodasAsPescas() - quantidadeParaSubtrair;
    }
    public void adicionarHistoricoDePescador(SetorRegistro registroPescador){

        historicosDosPescadores.add(registroPescador);

    }
    //

    @Override
    public String toString() {
        return "SetorRegistro{" +
                "arrayListDeTodoAsPescas=" + arrayListDeTodoAsPescas +
                '}';
    }
}
