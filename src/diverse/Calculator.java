package diverse;

public class Calculator {
    int a;
    int b;
    int c;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
   /* public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
        this.c = this.a+this.b;
    }*/

    @Override
    public String toString() {
        return "Calculator{" +
                c +
                '}';
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }


    /*public int suma(Calculator obj){
       return obj.getA()+obj.getB();
    }*/
    public int suma(){
        return this.a+this.b;
    }
    /*public void afiseazaSuma(Calculator calculator){
        System.out.println(calculator.suma(calculator));
    }*/
    public void afiseazaSuma(Calculator calculator){
        System.out.println(calculator.suma());
    }
   /* public int afiseazaSuma(Calculator calculator){
        return calculator.suma();
    }*/
   

}
