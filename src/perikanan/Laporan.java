/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perikanan;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */

public class Laporan {

    // Variable
    private String kondisiLele, kebutuhan;
    private String jumlah;                         
    private int leleYangSiapDijual;
    private ArrayList<String> datakondisilele;
    private ArrayList<String> datakebutuhan;
    private ArrayList<String> datajumlah;           
    private ArrayList<Integer> datalele_yang_siap_dijual;
    private String kondisi;
    private Integer leleyangsiapdijual;


    // Constructor 1
    public Laporan() {
        this.datakondisilele = new ArrayList<>();
        this.datakebutuhan = new ArrayList<>();
        this.datajumlah = new ArrayList<>();
        this.datalele_yang_siap_dijual = new ArrayList<>();
    }

    // Constructor 2
    public Laporan(String kondisiLele, String kebutuhan, int leleYangSiapDijual, String jumlah) { // ← diubah
        this.jumlah = jumlah;
        this.kondisiLele = kondisiLele;
        this.kebutuhan = kebutuhan;
        this.leleYangSiapDijual = leleYangSiapDijual;

        this.datakondisilele = new ArrayList<>();
        this.datakebutuhan = new ArrayList<>();
        this.datajumlah = new ArrayList<>();
        this.datalele_yang_siap_dijual = new ArrayList<>();
    }

    // Procedure (void)
    public void tampilkanLaporan() {
        System.out.println("Jumlah : " + jumlah);
        System.out.println("Kondisi Lele : " + kondisiLele);
        System.out.println("Kebutuhan : " + kebutuhan);
        System.out.println("Lele Siap Dijual : " + leleYangSiapDijual);
    }


    public void inputDatakondisi(String data) {
        this.datakondisilele.add(data);
    }

    public void inputDataKebutuhan(String data) {
        this.datakebutuhan.add(data);
    }

    public void inputDataJumlah(String data) { 
        this.datajumlah.add(data);
    }

    public void inputDataleleyangsiapdijual(Integer data) {
        this.datalele_yang_siap_dijual.add(data);
    }


    // Mengembalikan jumlah
    public String getJumlah() {                  
        return jumlah;
    }

    // Mengembalikan KondisiLele
    public String getKondisiLele() {
        return kondisiLele;
    }

    // Mengembalikan kebutuhan
    public String getKebutuhan() {
        return kebutuhan;
    }

    // Mengembalikan lele yang siap dijual
    public int getLeleYangSiapDijual() {
        return leleYangSiapDijual;
    }


    public ArrayList<String> listDatakondisilele() {
        return this.datakondisilele;
    }

    public ArrayList<String> listDatakebutuhan() {
        return this.datakebutuhan;
    }

    public ArrayList<String> listDatajumlah() {  
        return this.datajumlah;
    }

    public ArrayList<Integer> listDatalele_yang_siap_dijual() {
        return this.datalele_yang_siap_dijual;
    }

    // Mengisi nilai jumlah
    public void setJumlah(String jumlah) {        
        this.jumlah = jumlah;
    }

    // Mengisi nilai Kondisi lele
    public void setKondisiLele(String kondisiLele) {
        this.kondisiLele = kondisiLele;
    }

    // Mengisi nilai kebutuhan
    public void setKebutuhan(String kebutuhan) {
        this.kebutuhan = kebutuhan;
    }

    // Mengisi nilai lele yang siap dijual
    public void setLeleYangSiapDijual(int leleYangSiapDijual) {
        this.leleYangSiapDijual = leleYangSiapDijual;
    }

    public int getIndexData(String jumlah) {      // ← diubah
        int index = this.datajumlah.indexOf(jumlah);
        if (index < 0) {
            JOptionPane.showMessageDialog(null, "Data Tidak ditemukan");
        }
        return index;
    }

    public void searchdata(String jumlah) {       
        int i = getIndexData(jumlah);
        String kebutuhan = this.datakebutuhan.get(i);
        String kondisi = this.datakondisilele.get(i);
        int leleyangsiapdijual = this.datalele_yang_siap_dijual.get(i);

        String pesan = "Jumlah : " + jumlah + "\nkebutuhan: " + kebutuhan + "\n" + " kondisi : " + kondisi + "\nleleyangsiapdijual: " + leleyangsiapdijual;

        JOptionPane.showMessageDialog(null, pesan);
    }

    public void ubahDataLaporan(String Jumlah, String Kebutuhan, String Kondisi, int leleyangsiapdijual) {
        int i = getIndexData(Jumlah);
        this.listDatajumlah().set(i, Jumlah);
        this.listDatakebutuhan().set(i, Kebutuhan);
        this.listDatakondisilele().set(i, Kondisi);
        this.listDatalele_yang_siap_dijual().set(i, leleyangsiapdijual);
        JOptionPane.showMessageDialog(null, "Data Berhasil Diubah!");
    }

    public void hapusDataLaporan(String Jumlah, String Kebutuhan, String Kondisi, int leleyangsiapdijual) {
        int i = getIndexData(Jumlah);
        this.listDatajumlah().remove(i);
        this.listDatakebutuhan().remove(i);
        this.listDatakondisilele().remove(i);
        this.listDatalele_yang_siap_dijual().remove(i);
        JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus!");
    }
}