public class Moto extends Vehiculo {

    private int plazas;

    public Moto(String matricula, int potencia, int plazas) {
        super(matricula, potencia);
        this.plazas = plazas;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    @Override
    public int getvMax() {
        if (getPotencia() <= 125)
            return 100;
        else if (getPotencia() > 126 && getPotencia() <= 250)
            return 160;
        else
            return 200;
    }

    @Override
    public String toString() {
        return "Moto [" + super.toString() + ", plazas=" + plazas + "]";
    }

}
