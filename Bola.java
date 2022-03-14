package bola;

public class Bola {

    private double jarijari;

    public void setJarijari(double jari) {
        this.jarijari = jari;
    }

    public double showDiameter() {
        return jarijari * 2;
    }
    public double LuasPermukaan() {
        return 4*Math.PI*Math.pow(jarijari, 2);
    }
    public double showVolume() {
        return Math.PI* Math.pow(jarijari, 3)*4/3;
    }
    public void cetak(){
        System.out.println("Diameter=\t"+showDiameter());
        System.out.println("Luas Permukaan=\t"+LuasPermukaan());
        System.out.println("Volume=\t"+showDiameter());
    }
}
