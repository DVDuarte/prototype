package org.padraodeprojeto;

public class PlanoSaude implements Cloneable {
    private String tipoPlano;
    private String cobertura;
    private double valorMensal;

    public PlanoSaude(String tipoPlano, String cobertura, double valorMensal) {
        this.tipoPlano = tipoPlano;
        this.cobertura = cobertura;
        this.valorMensal = valorMensal;
    }

    public String getTipoPlano() {
        return tipoPlano;
    }

    public void setTipoPlano(String tipoPlano) {
        this.tipoPlano = tipoPlano;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    public double getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(double valorMensal) {
        this.valorMensal = valorMensal;
    }

    @Override
    public PlanoSaude clone() throws CloneNotSupportedException {
        return (PlanoSaude) super.clone();
    }

    @Override
    public String toString() {
        return "PlanoSaude{" +
                "tipoPlano='" + tipoPlano + '\'' +
                ", cobertura='" + cobertura + '\'' +
                ", valorMensal=" + valorMensal +
                '}';
    }
}