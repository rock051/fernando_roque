public class classeB{
    private int b1;
    private float b2;
    
    public classeB(){
        b1 = 1;
        b2 = 1.2f;
    }
    
    public int getInt(){
        return b1;
    }
    
    public float getFloat(){
        return b2;
    }
    public int SetInt(){
        return b1*2;
    }
    public float SetFloat(){
        return b2+3;
    }
    public String toString(){
        return "numero inteiro" + b1;
    }                
}
