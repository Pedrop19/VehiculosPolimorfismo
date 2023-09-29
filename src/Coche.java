public class Coche extends Vehiculo {

    private int peso;

    public Coche(String matricula, int potencia, int peso) {
        super(matricula, potencia);
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public int getvMax() {
        if (getPotencia() <= 100)
            return 150;
        else if (getPotencia() > 100 && getPotencia() <= 180)
            return 190;
        else
            return 220;
    }

    @Override
    public String toString() {
        return "Coche [" + super.toString() + ", peso=" + peso + "]";
    }

}
