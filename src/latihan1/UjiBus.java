package latihan1;
public class UjiBus {
public static void main (String [] arg){
    //membuat objek busMini dari kelas Bus
    Bus busMini = new Bus();
    //memasukkan nilai jumlah penumpang dan penumpang maksimal ke dalam objek
    busMini.penumpang = 5;
    busMini.maxPenumpang = 15;
    //memanggil method cetak pada kelas bus
    busMini.cetak();
    
    //menambah penumpang pada busMini
    busMini.penumpang = busMini.penumpang + 5;
    //memanggil method cetak pada kelas Bus
    busMini.cetak();
    
    //mengurangi jumlah penumpang pada busMini
    busMini.penumpang = busMini.penumpang - 2;
    busMini.cetak();
    
    //menambahkan jumlah penumpang pada busMini
    busMini.penumpang = busMini.penumpang +8;
    busMini.cetak();
    
}
    
}
