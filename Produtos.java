public class Produtos {
   protected int codigo;
    protected int quantidadeEstoque;
    protected String nome;
    protected String cor;
    protected double tamanho;
    protected double valor;

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public int getCodigo(){
        return codigo;
    }
    public void setQuantidadeEstoque(int quantidadeEstoque){
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public int getQuantidadeEstoque(){
        return quantidadeEstoque;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return cor;
    }
    public void setTamanho(double tamanho){
        this.tamanho = tamanho;
    }
    public double getTamanho(){
        return tamanho;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    public double getValor(){
        return valor;
    }
}
