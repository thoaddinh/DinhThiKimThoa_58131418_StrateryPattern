
package BaiTap1;


public class Chia implements ITinh{

    @Override
    public float tinh(float a, float b) {       
        if(b == 0) return Float.NaN;
        return a/b;
    }
    
}
