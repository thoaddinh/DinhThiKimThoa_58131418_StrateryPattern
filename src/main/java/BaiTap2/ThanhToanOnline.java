
package BaiTap2;

public class ThanhToanOnline implements IThanhToan{

    @Override
    public double thanhToan(int tienHang) {
        if(tienHang < 1000000) return tienHang - tienHang*0.05;
        return tienHang - tienHang*0.07;
    }
}
