public class Pagamento extends Produtos{
    private String pix;
    private String especie;
    private String trasferencia;
    private String debito;

    public void setPix(String pix){
        this.pix = pix;
    }
    public String getPix(){
        return pix;
    }
    public void setEspecie(String especie){
        this.especie = especie;
    }
    public String getEspecie(){
        return especie;
    }
    public void setTrasferencia(String trasferencia){
        this.trasferencia = trasferencia;
    }
    public String getTrasferencia(){
        return trasferencia;
    }
    public void setDebito(String debito){
        this.debito = debito;
    }
    public String getDebito(){
        return debito;
    }
}
