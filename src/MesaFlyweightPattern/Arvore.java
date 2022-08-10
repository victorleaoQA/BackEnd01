package MesaFlyweightPattern;

public class Arvore {
    private String tipoArvore;
    private int altura;
    private int largura;
    private String cor;

    public Arvore(String tipoArvore){
        super();
        this.tipoArvore = tipoArvore;
    }
    public Arvore(){
        super();
    }

    public String getTipoArvore() {
        return tipoArvore;
    }

    public void setTipoArvore(String tipoArvore) {
        this.tipoArvore = tipoArvore;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void descricaoDaArvore(){
        System.out.println("É uma "+getTipoArvore()+" Tem uma altura "+getAltura()+" Tem uma altura "+getAltura()+" e tem uma cor "+getCor());

    }

    @Override
    public String toString() {
        return "";
    }
}
