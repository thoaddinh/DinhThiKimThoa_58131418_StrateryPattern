
package BaiTap2;

public class ThanhToanCOD implements IThanhToan{

    @Override
    public double thanhToan(int tienHang) {
        if(tienHang > 2000000)
            return tienHang - tienHang*0.02;
        return tienHang;
    }
    
}
