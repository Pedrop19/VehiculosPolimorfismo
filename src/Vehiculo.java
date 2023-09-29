public abstract class Vehiculo {
    
    private String matricula;
    private int potencia;

    public Vehiculo(String matricula, int potencia) {
        this.matricula = matricula;
        this.potencia = potencia;
    }

    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public abstract int getvMax();
    
    @Override
    public String toString() {
        return "matricula=" + matricula + ", potencia=" + potencia + ", Velocidad Maxima=" + getvMax();
    }
}
