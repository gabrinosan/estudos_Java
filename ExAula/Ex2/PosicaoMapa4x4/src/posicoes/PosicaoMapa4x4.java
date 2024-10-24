package posicoes;

public class PosicaoMapa4x4 {
    private int x;
    private int y;

    public boolean setX(int x){
        if (x < 4 && x >= 0){
            this.x = x; 
            return true;
        } else {
            reset();
            return false;
        }
    }

    public boolean setY(int y){
        if (y < 4 && y >= 0){
            this.y = y; 
            return true;
        } else {
            reset();
            return false;
        }
    }
    
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void imprime(){
        System.out.println("(" + x + "," + y + ")");
    }

    public int distancia(PosicaoMapa4x4 p){
        int distanciaPontoX = x - p.x;
        if (distanciaPontoX < 0) distanciaPontoX *= -1;

        int distanciaPontoY = y - p.y;
        if (distanciaPontoY < 0) distanciaPontoY *= -1;
    
        return distanciaPontoX + distanciaPontoY;
    }

    private void reset(){
        x = 0;
        y = 0;
    }
}
