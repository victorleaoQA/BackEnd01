package Aula10_Logger.Mesa;

import org.apache.log4j.Logger;

import java.util.List;

public class NumerosInteiros {
    private static final Logger logger = Logger.getLogger(NumerosInteiros.class);
    private List<Integer> listainteiros;
    private int numero;

    public NumerosInteiros(List<Integer> listainteiros, int numero) {
        this.listainteiros = listainteiros;
        this.numero = numero;
    }

    public List<Integer> getListainteiros() {
        return listainteiros;
    }

    public void setListainteiros(List<Integer> listainteiros) {
        this.listainteiros = listainteiros;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void mediaInteiros(){
        return
    }
}
