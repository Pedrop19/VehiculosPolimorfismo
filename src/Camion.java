public class Camion extends Vehiculo {

    private Remolque remolque;

    public Camion(String matricula, int potencia, Remolque remolque) {
        super(matricula, potencia);
        this.remolque = remolque;
    }

    public Remolque getRemolque() {
        return remolque;
    }

    public void setRemolque(Remolque remolque) {
        this.remolque = remolque;
    }

    @Override
    public int getvMax() {
        if (remolque == Remolque.PESADO)
            return 70;
        else {
            if (getPotencia() <= 200)
                return 80;
            else
                return 90;
        }
    }

    @Override
    public String toString() {
        return "Camion [" + super.toString() + ", remolque=" + remolque + "]";
    }

}
