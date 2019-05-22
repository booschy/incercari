package diverse;

public class Mercedes {
    private String culoare;
   public String nrMasina;
   String tipMotor;

    public Mercedes(String nrMasina, String tipMotor) {
        this.culoare = "rosu";
        this.nrMasina = nrMasina;
        this.tipMotor = tipMotor;
    }

    @Override
    public String toString() {
        return "Mercedes{" +
                "culoare='" + culoare + '\'' +
                ", nrMasina='" + nrMasina + '\'' +
                ", tipMotor='" + tipMotor + '\'' +
                '}';
    }
}
