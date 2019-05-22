package diverse;

public class Main {
    public static void main(String[] args) {
    Calculator calculator= new Calculator(5,6);
       //calculator.suma(calculator);
       // calculator.afiseazaSuma(calculator);
       int c= calculator.suma();
        System.out.println(c);

        calculator.afiseazaSuma(calculator);
       //System.out.println(calculator.afiseazaSuma(calculator));
        System.out.println(calculator.toString());
       // System.out.println(calculator instanceof Calculator);

        //Mercedes mercedes = new Mercedes("45ddd","benzina");
       // Mercedes mercedes1 = new Mercedes("rosu","47sda","motorina");

       // System.out.println(mercedes.toString());
    }
}
