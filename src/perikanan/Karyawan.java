package perikanan;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Karyawan {

    // Variable
    private String userName, namaKaryawan, alamat, password;
    private int nomorTelepon;
    private ArrayList<String> datauserName;
    private ArrayList<String> datanamaKaryawan;
    private ArrayList<String> dataalamat;
    private ArrayList<String> datapassword;
    private ArrayList<Integer> datanomorTelepon;



    // Constructor 1 (kosong)
    public Karyawan() {
    this.datauserName = new ArrayList<>();
    this.datanamaKaryawan = new ArrayList<>();
    this.dataalamat = new ArrayList<>();
    this.datapassword = new ArrayList<>();
    this.datanomorTelepon = new ArrayList<>();  
        

    }

    // Constructor 2 (berisi parameter)
    public Karyawan(String nama, String alamat, String username, String password, int nomorTelepon) {
        this.userName = username;
        this.namaKaryawan = nama;
        this.alamat = alamat;
        this.password = password;
        this.nomorTelepon = nomorTelepon;
        
        
    this.datauserName = new ArrayList<>();
    this.datanamaKaryawan = new ArrayList<>();
    this.dataalamat = new ArrayList<>();
    this.datapassword = new ArrayList<>();
    this.datanomorTelepon = new ArrayList<>(); 
    }

    // Method Procedure (void)
    public void tampilkanData() {
        System.out.println("Nama: " + namaKaryawan);     
        System.out.println("Username: " + userName);
        System.out.println("No Telp: " + nomorTelepon);
        System.out.println("alamat: " + alamat);
    }

    
    public void inputDataUser(String data) {
        this.datauserName.add(data);
    
    }
    
    public void inputDataNama(String data) {
        this.datanamaKaryawan.add(data);
    
    }
    
    public void inputDataalamat(String data) {
        this.dataalamat.add(data);
    
    }
    
    public void inputDatapassword(String data) {
        this.datapassword.add(data);
    
    }
    
    public void inputDatanomor(Integer data) {
        this.datanomorTelepon.add(data);
    
    }
    
    
    
   //mengembalikan UserName
    public String getUserName() {
        return this.userName;
    }
//mengembalikan Nama Karyawan
    public String getNamaKaryawan() {
        return this.namaKaryawan;
    }

    //mengembalikan Alamat
    public String getAlamat() {
        return this.alamat;
    }

    //mengembalikan password
    public String getPassword() {
        return this.password;
    }
//mengembalikan NomorTelpon
    public int getNomorTelepon() {
        return this.nomorTelepon;
    }
    
    
    
    
    
    public ArrayList<String> listDatauser() {
        return this.datauserName;
    
    }
    
    public ArrayList<String> listDataNama() {
        return this.datanamaKaryawan;
    
    }
    
    public ArrayList<String> listDataalamat() {
        return this.dataalamat;
    
    }
    
    public ArrayList<String> listDatapassword() {
        return this.datapassword;
    
    }
    
    public ArrayList<Integer> listDatanomor() {
        return this.datanomorTelepon;
    
    }
    


    //Mengisi nilai UserName
    public void setUserName(String userName) {
        this.userName = userName;
    }

    //Mengisi nilai NamaKaryawan
    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    //Mengisi nilai Alamat
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    //Mengisi nilai Password
    public void setPassword(String password) {
        this.password = password;
    }

    //Mengisi nilai NomorTelepon
    public void setNomorTelepon(int nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }
    
    public int getIndexData(String nama) {
        int index = this.datanamaKaryawan.indexOf(nama);
        if (index < 0 ) {
            JOptionPane.showMessageDialog(null, "Data Tidak ditemukan");
        
        }
        return index;
    }
    
    public void searchdata(String nama) {
        int i = getIndexData(nama);
        if (i < 0) {
            return; // FIX: hentikan proses jika data tidak ditemukan, agar tidak terjadi IndexOutOfBoundsException
        }
        String user = this.datauserName.get(i);
        String Alamat = this.dataalamat.get(i);
        int telepon = this.datanomorTelepon.get(i);
       
        
        String pesan = "Nama : " + nama + "\nuser: " + user + "\n" + " alamat : " + Alamat + "\ntelepon: " + telepon;
        
        JOptionPane.showMessageDialog(null, pesan);
    }
    
    public void ubahDataKaryawan(String UserName, String Nama, String Alamat, int NomorTelepon) {
       // FIX: pencarian index harus berdasarkan Nama (sesuai isi getIndexData yang mencari di list nama),
       // sebelumnya kode lama memakai UserName sehingga index yang ditemukan salah/tidak ketemu
       int i = getIndexData(Nama);
       if (i < 0) {
           return; // FIX: hentikan proses jika data tidak ditemukan
       }
       this.listDatauser().set(i, UserName);
       this.listDataNama().set(i, Nama);
       this.listDataalamat().set(i, Alamat);
       this.listDatanomor().set(i, NomorTelepon);
        JOptionPane.showMessageDialog(null, "Data Berhasil Diubah!");
    }
    
     public void hapusDataKaryawan(String UserName, String Nama, String Alamat, int NomorTelepon) {
        // FIX: sama seperti di atas, pencarian index berdasarkan Nama, bukan UserName
        int i = getIndexData(Nama);
        if (i < 0) {
            return; // FIX: hentikan proses jika data tidak ditemukan
        }
        this.listDatauser().remove(i);
        this.listDataNama().remove(i);
        this.listDataalamat().remove(i);
        this.listDatanomor().remove(i);
        JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus!");
    }
}