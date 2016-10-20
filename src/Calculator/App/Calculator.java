package Calculator.App;

public class Calculator {
    private double result;
    
    public double getResult(){
        return this.result;
    }
    
    public void sum(double x,double y){
        this.result = x + y;
    }
    
    public void sub(double x,double y){
        this.result = x - y;
    }
}
