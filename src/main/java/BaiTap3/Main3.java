
package BaiTap3;

import java.util.ArrayList;
import java.util.Date;

public class Main3 {

    public static void main(String[] args) {
        QLSV qlsv = new QLSV();
        ArrayList<SinhVien> dsSinhVien = new ArrayList<>();
        dsSinhVien.add(new SinhVien("Thoa Dinh", new Date(1998, 10, 20), (float) 8.0));
        dsSinhVien.add(new SinhVien("Thuy Xuan", new Date(1998, 06, 02), (float) 6.0));
        dsSinhVien.add(new SinhVien("Suong Tran", new Date(1998, 07, 05), (float) 9.0));
        dsSinhVien.add(new SinhVien("Hoang Toni", new Date(1998, 02, 02), (float) 8.0));
        dsSinhVien.add(new SinhVien("Thanh Mickey", new Date(1998, 10, 5), (float) 7.0));
        
        qlsv.setSinhViens(dsSinhVien);
     //   qlsv.inDS();
     
        System.out.println("---------Danh sach sinh vien sap xep theo diem:-----------");
        qlsv.setiSoSanh(new SoSanhTheoDiem());
        qlsv.sapXep();
        qlsv.inDS();
        
        System.out.println("");
        System.out.println("-----Danh sach sinh vien sap xep theo ten:---------");
        qlsv.setiSoSanh(new SoSanhTheoTen());
        qlsv.sapXep();
        qlsv.inDS();
    }
    
}
