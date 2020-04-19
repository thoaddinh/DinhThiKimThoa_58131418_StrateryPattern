
package BaiTap2;

import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args) {
        ArrayList<HangHoa> gioHang1 = new ArrayList<>();
        ArrayList<HangHoa> gioHang2 = new ArrayList<>(); 
        
        gioHang1.add(new HangHoa("Sữa", 1500000, "TH True Milk"));
        gioHang1.add(new HangHoa("Trứng", 1000000, "Trứng gà"));
        gioHang1.add(new HangHoa("Bột Mì", 2000000, "Bột làm bánh"));
        
        gioHang2.add(new HangHoa("Sách", 500000, "Giáo trình"));
        gioHang2.add(new HangHoa("Vở", 100000, "Vở"));
        gioHang2.add(new HangHoa("Bút", 1500000, "Bút thiên long"));
      
        //thanh toán giở hàng 1 online
        GioHang gio1 = new GioHang();
        gio1.setHangHoas(gioHang1);
        gio1.setHinhThucTT(new ThanhToanOnline());
        System.out.println("Số tiền thanh toán online của giỏ hàng 1: "+ gio1.thanhToan());
        
        //thanh toán giỏ hang 2 COD
        GioHang gio2 = new GioHang();
        gio2.setHangHoas(gioHang2);
        gio2.setHinhThucTT(new ThanhToanCOD());
        System.out.println("Số tiền thanh toán COD của giỏ hàng  2: "+ gio2.thanhToan());        
        
    }
    
}
