// Classe A (Circulo)
public class Circulo{
   private double raio;
   private Ponto2D ponto;

   // atributos para definir o circulo
   public Circulo(double raio, Ponto2D ponto) {
      this.raio = raio;
      this.ponto = new Ponto2D(ponto.getX(), ponto.getY());
   }
   
   // associacao por agregacao (ponto gerado fora do método)
   public boolean contains(Ponto2D ponto) {
      double dx = ponto.getX() - this.ponto.getX();
      double dy = ponto.getY() - this.ponto.getY();

      return ((dx*dx + dy*dy) <= (this.raio*this.raio));
   }
   
   
   // associacaoo por composicao (gera o ponto dentro do método)
   public boolean contains(double x, double y) {
      return contains(new Ponto2D(x, y));
   }
   

   // funcao que verifica se um Ponto2D está contido no Circulo
   

}