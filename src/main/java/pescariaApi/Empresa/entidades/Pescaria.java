package pescariaApi.Empresa.entidades;

import pescariaApi.Empresa.entidades.Financeiro.Financeiro;
import pescariaApi.classesDeMetodos.MetodosAdminstrativos;
import pescariaApi.classesDeMetodos.MetodosUsuario;

import java.util.List;

public class Pescaria {
    private List<Barco> barcos;
    private Financeiro financeiro;
    MetodosAdminstrativos acoesAdmin;
    MetodosUsuario acoesUsuario;

    public List<Barco> getBarcos() {
        return barcos;
    }

    public void setBarcos(List<Barco> barcos) {
        this.barcos = barcos;
    }

    public Financeiro getFinanceiro() {
        return financeiro;
    }

    public void setFinanceiro(Financeiro financeiro) {
        this.financeiro = financeiro;
    }

    public MetodosAdminstrativos getAcoesAdmin() {
        return acoesAdmin;
    }

    public void setAcoesAdmin(MetodosAdminstrativos acoesAdmin) {
        this.acoesAdmin = acoesAdmin;
    }

    public MetodosUsuario getAcoesUsuario() {
        return acoesUsuario;
    }

    public void setAcoesUsuario(MetodosUsuario acoesUsuario) {
        this.acoesUsuario = acoesUsuario;
    }
}
