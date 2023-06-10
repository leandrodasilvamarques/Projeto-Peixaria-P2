package aplicacao.metodosParicipativos.interacoesIniciais;

import aplicacao.metodosParicipativos.aplicacaoAdmin.AplicacaoAdmin;
import aplicacao.metodosParicipativos.aplicacaoUsuario.AplicacaoUsuario;
import classes.setores.recursosHumanos.Gerente;

import javax.swing.*;

public class InteracaoInicial {

    public UserViewInicial userViewInicial;

    public InteracaoInicial(){
        userViewInicial = new UserViewInicial();
    }




    public static void aplicacaoAdminOuUsuario(){

        boolean admin = false;

        if (admin == true){

            AplicacaoAdmin.aplicacaoAdmin();

        }
        else{

            AplicacaoUsuario.aplicacaoUsuario();

        }
    }

}
