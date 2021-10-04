

public class Triangolo {
    private String tipo;
    private final int lato1;
    private final int lato2;
    private final int lato3;

    public Triangolo(int lato1, int lato2, int lato3) {
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }
    
    public String getTipo(){
        if(lato1 == lato2 && lato1 == lato3)
            tipo = "Equilatero";
        else if(lato1 == lato2 && lato1 != lato3 || lato1 == lato3 && lato1 != lato2 || lato2 == lato3 && lato1 != lato2)
            tipo = "Isoscele";
        else if(lato1 != lato2 && lato2 != lato3 && lato1 != lato3)
            tipo = "Scaleno";
        
        return tipo;
    }
    
    public int getPerimetro(){        
        return lato1 + lato2 + lato3;
    }
    
    public int getArea(){
        int p = getPerimetro() / 2;
        
        return (int) Math.sqrt(p * (p - lato1)* (p - lato2) * (p - lato3));
    }
    
}
