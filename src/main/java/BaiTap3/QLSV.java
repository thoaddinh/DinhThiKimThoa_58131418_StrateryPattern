
package BaiTap3;

import java.util.ArrayList;
import java.util.Collections;
public class QLSV {
    ArrayList<SinhVien> sinhViens = new ArrayList<>();
    ISoSanh<SinhVien> iSoSanh;

    public void setSinhViens(ArrayList<SinhVien> sinhViens) {
        this.sinhViens = sinhViens;
    }

    public void setiSoSanh(ISoSanh<SinhVien> iSoSanh) {
        this.iSoSanh = iSoSanh;
    }
    
    public void sapXep(){
        for (int i = 0; i < sinhViens.size() - 1; i++) {
            for (int j = 0; j < sinhViens.size() - 1 - i; j++) {
                if(iSoSanh.soSanh(sinhViens.get(j), sinhViens.get(j + 1)) > 0)
                    Collections.swap(sinhViens, j, j+1);       
            }
        }
        
    }
    
    public void inDS(){
        int i = 1;
         for (SinhVien sinhVien : sinhViens) {
             System.out.println("----------Thông Tin Sinh Vien "+i+" -----------");
             System.out.println(sinhVien.getHoTen());
             System.out.println(sinhVien.getNgaySinh());
             System.out.println(sinhVien.getDiemTB());
             i++;
        }
    }
}
