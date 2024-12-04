/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datasepatu;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControllerSepatu {
    ArrayList<ModelSepatu> ArrayData;
    DefaultTableModel TableList;
    
    public ControllerSepatu() {
        ArrayData = new ArrayList<ModelSepatu>();
    }
    public void InsertData(String nama, int ukuran, String warna, boolean jenis) {
        ModelSepatu spt = new ModelSepatu(nama, ukuran, warna, jenis);
        ArrayData.add(spt);
    }
}
