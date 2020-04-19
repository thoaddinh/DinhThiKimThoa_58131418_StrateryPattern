
package BaiTap2;

import java.util.ArrayList;


public class GioHang {
    IThanhToan hinhThucTT;
    ArrayList<HangHoa> hangHoas = new ArrayList<>();

    public void setHangHoas(ArrayList<HangHoa> hangHoas) {
        this.hangHoas = hangHoas;
    }
 
    public void setHinhThucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }
    
    public double thanhToan(){
        double sum = 0;
        for (HangHoa hangHoa : hangHoas) {
            sum+= hinhThucTT.thanhToan(hangHoa.getGia());
        }
        return sum;
    }
}
