package TugasPraktikum2;
public class Bola {
    private double phi = Math.PI, jari, diameter, luasPermukaan, volume;
    public void setJarijari(double r){
        jari = r;
    }
    public double showDiameter(){
        return 2 * jari;
    }
    public double showLuasPermukaan(){
        return 4 * phi * jari *jari;
    }
    public double showVolume(){
        return 4/3 * phi * jari * jari;
    }
    
}
