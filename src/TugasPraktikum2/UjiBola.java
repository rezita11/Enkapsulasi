package TugasPraktikum2;
public class UjiBola {
    public static void main (String[] args){
        Bola b = new Bola();
        System.out.println("Bangun Ruang Bola");
        b.setJarijari(14);
        
        System.out.println("Diameter Bola = "+ b.showDiameter() + "cm");
        System.out.println("Luas Permukaan = " + b.showLuasPermukaan() + "cm2");
        System.out.println("Volume Bola = " + b.showVolume() + "cm3");
    }
    
}
