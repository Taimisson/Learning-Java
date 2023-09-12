public class Caneta{

    private String cor, marca, tipo;
    private double preco;
    private boolean vazia;
    
    public Caneta(String cor, String marca, String tipo, double preco, boolean vazia){
        this.cor = cor;
        this.marca = marca;
        this.tipo = tipo;
        this.preco = preco;
        this.vazia = vazia;
    }
    
    public Caneta(String cor){
        this.cor = cor;
    }
    

    
    /** VISIBILIDADE TIPO_DE_RETORNO NOME_DO_MÉTODO(PARÂMETROS **/
    
    // Métodos de acesso: GET
    
    public String getCor(){
        return cor;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public boolean isVazia(){
        return vazia;
    }
    
    // Métodos de acesso: SET
    
    public void setCor(String cor){
        this.cor = cor;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setTipo(String cor){
        this.tipo = tipo;
    }
    public void setPreco(double cor){
        this.preco = preco;
    }
    public void isVazia(boolean cor){
        this.vazia = vazia;
    }
    
}