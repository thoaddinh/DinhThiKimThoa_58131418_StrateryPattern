
package BaiTap2;

import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args) {
        ArrayList<HangHoa> gioHang1 = new ArrayList<>();
        ArrayList<HangHoa> gioHang2 = new ArrayList<>(); 
        
        gioHang1.add(new HangHoa("Sua", 800000, "TH True Milk"));
        gioHang1.add(new HangHoa("Trung", 100000, "Trung ga"));
        gioHang1.add(new HangHoa("Bot Mi", 200000, "Bot lam banh"));
        
        gioHang2.add(new HangHoa("Sach", 500000, "Giao trinh"));
        gioHang2.add(new HangHoa("Vo", 100000, "Vo"));
        gioHang2.add(new HangHoa("But", 150000, "But thien long"));
      
        //thanh toán giở hàng 1 online
        GioHang gio1 = new GioHang();
        gio1.setHangHoas(gioHang1);
        gio1.setHinhThucTT(new ThanhToanOnline());
        System.out.println("-------Gio Hang 1-------------------");
        for (HangHoa hangHoa : gioHang1) {
            System.out.println(hangHoa.getTenHH()+ " - "+ hangHoa.getGia() + " - "+ hangHoa.getMoTa());
        }
        System.out.println("Tong tien hang cua gio hang 1: "+ gio1.tongTienHang());
        System.out.println("So tien can thanh toan online cua gio hang 1: "+ gio1.thanhToan());
        
        //thanh toán giỏ hang 2 COD
        GioHang gio2 = new GioHang();
        gio2.setHangHoas(gioHang2);
        gio2.setHinhThucTT(new ThanhToanCOD());
        System.out.println("-------Gio Hang 2-------------------");
        for (HangHoa hangHoa : gioHang2) {
            System.out.println(hangHoa.getTenHH()+ " - "+ hangHoa.getGia() + " - "+ hangHoa.getMoTa());
        }
        System.out.println("Tong tien hang cua gio hang 2: "+ gio2.tongTienHang());
        System.out.println("So tien can thanh toan COD cua gio hang  2: "+ gio2.thanhToan());        
        
    }
    
}
