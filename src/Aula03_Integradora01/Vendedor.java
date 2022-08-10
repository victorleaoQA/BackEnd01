package Aula03_Integradora01;

    //Validação que usa pripriedades de subclasse apenas
    //Classe abstrata Vendedor. Aqui vai apenas o Tempate Method
public abstract class Vendedor {
    protected String nome;
    protected int vendas;
    protected int pontosPorVenda;

    public void vender(int qtdVendas){
        this.vendas += qtdVendas;
        System.out.println(this.nome+" realizou "+qtdVendas+" vendas...");
    }

    //Método que calcula os pontos do vendedor de acordo com os seus aspectos a serem considerados
    public abstract int calcularPontos();

    //TEMPLATE METHOD. Recebe o total de pontos calculados a partir da subclasse e valida cada item para retornar a categoria
    public String mostrarCategoria(){
        int pontosVendedor = calcularPontos();
        return this.nome+" tem um total de "+pontosVendedor+" pontos e categoriza como "+getNomeCategoria(pontosVendedor);
    }

    //Recebo os pontos e informo uma categorização
    private String getNomeCategoria(int pontosVendedor){
        if (pontosVendedor < 20){
            return "Vendedor NOVATO";
        } else if (pontosVendedor < 31) {
            return "Vendedor APRENDIZ";
        } else if (pontosVendedor < 41) {
            return "Vendedor BOM";
        }else {
            return "Vendedor MESTRE";
        }

    }
}
