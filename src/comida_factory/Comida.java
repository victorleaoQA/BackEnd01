package comida_factory;

public class Comida {
    private String tipoComida;
    private int preço;
    private boolean temAlface;

    public Comida(String tipoComida){
        super();
        this.tipoComida = tipoComida;
    }
    public Comida(){
        super();
    }

    public String getTipoComida(){
        return tipoComida;
    }

    public void setTipoComida(String tipoComida){
        this.tipoComida = tipoComida;
    }

    public int getPreço() {
        return preço;
    }

    public void setPreço(int preço) {
        this.preço = preço;
    }

    public boolean isTemAlface() {
        return temAlface;
    }

    public void setTemAlface(boolean temAlface) {
        this.temAlface = temAlface;
    }

    public void descriçãoDaComida(){
        System.out.println("É um/uma "+getTipoComida()+" que custa: "+getPreço());
    }

    @Override
    public String toString() {
        return "Comida [tipoComida="+tipoComida+", preço="+preço+", temAlface="+temAlface+"]";
    }
}
