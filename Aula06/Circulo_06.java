// Classe A (Circulo)
public class Circulo_06 extends Ponto2D_06 {
   private double raio;

   // atributos para definir o circulo
   public Circulo_06(double raio, double x, double y) {
      super(x, y);
      this.raio = raio;
   }
   
   // associacao por agregacao (ponto gerado fora do método)
   public boolean contains(Ponto2D_06 ponto) {
      double dx = ponto.getX() - this.getX();
      double dy = ponto.getY() - this.getY();

      return ((dx*dx + dy*dy) <= (this.raio*this.raio));
   }
   
   
   // associacaoo por composicao (gera o ponto dentro do método)
   public boolean contains(double x, double y) {
      return contains(new Ponto2D_06(x, y));
   }
   

   // funcao que verifica se um Ponto2D está contido no Circulo
   

}