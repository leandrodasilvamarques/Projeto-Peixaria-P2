package pescariaApi.classesAbstratas;

public enum Barco {

    BARCO1(1),
    BARCO2(2),
    BARCO3(3);

    int numero;

    Barco(int numero){
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }
}
