package latihan4;
public class UjiBus3 {

    public UjiBus3(int par) {
    }
    public static void main (String[] arg){
     
        Bus3 Bus = new Bus3(5);
        Bus.getPenumpang(17);
        Bus.getPenumpang(24);
        Bus.cetakPenumpang();
        
        Bus.addPenumpang(2);
        Bus.cetakPenumpang();
        
        Bus.addPenumpang(1);
        Bus.cetakPenumpang();
        
        Bus.addPenumpang(2);
        Bus.cetakPenumpang();
        
        Bus.addPenumpang(2);
        Bus.cetakPenumpang();
    }
}
