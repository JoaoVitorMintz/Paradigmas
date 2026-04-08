public class Ponto2D_07 {
    private double x,y;
    // inicializa um ponto alocado dinamicamente e iniciliza os campos do ponto
    public Ponto2D_07(){
        this.x = 0;
        this.y = 0;
    }
    public Ponto2D_07(double x, double y){
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
    public Ponto2D_07 add(Ponto2D_07 outro){
        return new Ponto2D_07(this.x + outro.x, this.y+outro.y);
    }

    // Multiplicar ambas as coordenadas de um ponto 
    public Ponto2D_07 scale(double s){
        
        return new Ponto2D_07(this.x * s, this.y * s);

    }

    //Calcular o coeficiente angular de uma reta que passe pelos dois pontos
    public double gradient(Ponto2D_07 outro) {
        
        if (outro.x == this.x && outro.y == this.y) {
            return 0.0;
        }
        
        return (double)(outro.y - this.y)/(outro.x - this.x);
    }

    // calcular a distância de Euclediana entre dois pontos;
    public double distEuclid(Ponto2D_07 outro) {
        return Math.sqrt(Math.pow((outro.x-this.x), 2) + Math.pow(outro.y-this.y, 2));
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    @Override
    public boolean equals(Object obj) {

        // mesmo objeto
        if (this == obj) return true;

        // null ou tipo diferente
        if (obj == null || getClass() != obj.getClass()) return false;

        // cast
        Ponto2D_07 outro = (Ponto2D_07) obj;

        return this.x == outro.x && this.y == outro.y;
    }

    @Override
    public int hashCode() {
        return (int)(x * 31 + y);
    }
}

