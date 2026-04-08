
public class Ponto2D {
    private double x,y;
    // inicializa um ponto alocado dinamicamente e iniciliza os campos do ponto
    public Ponto2D(){
        this.x = 0;
        this.y = 0;
    }
    public Ponto2D(double x, double y){
        this.x = x;
        this.y = y;
    }
    // Retornar os valores das componentes x 
    public double getX(){
        return this.x;
    }
    // Retornar os valores das componentes y
    public double getY(){
        return this.y;
    }

    //Somar dois pontos e obtem um terceiro;
    public Ponto2D add(Ponto2D outro){
        return new Ponto2D(this.x + outro.x, this.y+outro.y);
    }

    // Multiplicar ambas as coordenadas de um ponto 
    public Ponto2D scale(double s){
        
        return new Ponto2D(this.x * s, this.y * s);

    }

    //Calcular o coeficiente angular de uma reta que passe pelos dois pontos
    public double gradient(Ponto2D outro) {
        
        if (outro.x == this.x && outro.y == this.y) {
            return 0.0;
        }
        
        return (double)(outro.y - this.y)/(outro.x - this.x);
    }

    // calcular a distância de Euclediana entre dois pontos;
    public double distEuclid(Ponto2D outro) {
        return Math.sqrt(Math.pow((outro.x-this.x), 2) + Math.pow(outro.y-this.y, 2));
    }
}

