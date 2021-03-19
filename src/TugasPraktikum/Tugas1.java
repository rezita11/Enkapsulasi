package TugasPraktikum;
public class Tugas1 {
    public double penumpang;
    public double maxPenumpang;
    public double counter;
    public double beratPenumpang; 
    
    public Tugas1(double maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    
    //method mutator
    public void addPenumpang(double penumpang, double berat) {
    double temp;
    temp = this.penumpang + penumpang;
    if (temp > maxPenumpang){
        System.out.println("Penumpang melebihi kuota");    
    }else{
        this.penumpang = temp;
        counter = counter + (berat * penumpang);
    }
}
    public void getPenumpang (double password){
        if (password == 2.5){
            System.out.println("Password Benar");
        }else{
            System.out.println("Password Salah");
        }
    }
    
    public double getAverage(){
        System.out.println(counter + "" + this.penumpang);
        return counter / this.penumpang;
    }  
    public void cetakPenumpang (){
        System.out.println("Penumpang Bus Sekarang = " + this.penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah = " + this.maxPenumpang);
    }
}
