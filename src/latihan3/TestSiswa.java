package latihan3;
public class TestSiswa {
    public static void main (String args []) {
        EncapSiswa siswa = new EncapSiswa ();
        siswa.setName ("Rezita");
        siswa.setAbsen (33);
        siswa.setAddress ("Blitar");
        
        System.out.println("Name : "+siswa.getName() + " Absen : " + siswa.getAbsen() + " Address : " +siswa.getAddress() );
    }
    
}
