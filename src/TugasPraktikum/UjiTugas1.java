package TugasPraktikum;
public class UjiTugas1 {
    public static void main (String []args){
        Tugas1 Bus = new Tugas1(11);
        Bus.getPenumpang(17);
        Bus.getPenumpang(2.5);
        //penambahan penumpang
        Bus.addPenumpang(2,40); //tambah 2 penumpang
        Bus.cetakPenumpang();
        //penambahan penumpang
        Bus.addPenumpang(1,45); //tambah 1 penumpang
        Bus.cetakPenumpang();
        //penambahan penumpang
        Bus.addPenumpang(2,50); //tambah 2 penumpang
        Bus.cetakPenumpang();
        //penambahan penumpang
        Bus.addPenumpang(2,60); //tambah 2 penumpang
        Bus.cetakPenumpang();
        //cetak rata-rata penumpang
        System.out.println("Rata-rata berat penumpang = " +Bus.getAverage());
    }
    
}
