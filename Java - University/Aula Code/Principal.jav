public class Principal{
    
    public static void main(String[] args){
        
        Caneta c = new Caneta("Azul");
        
        double valorCaneta = c.getPreco();
        
        c.setCor("Verdinho");
        
        System.out.println("Cor da caneta: "+ c.getCor());
    }    
}