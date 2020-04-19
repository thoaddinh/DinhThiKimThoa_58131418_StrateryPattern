
package BaiTap1;

public class Context {

   ITinh tinhToan;

    public void setTinhToan(ITinh tinhToan) {
        this.tinhToan = tinhToan;
    }
   
    float tinh(float a, float b){
        return tinhToan.tinh(a, b);
    }
    
}
