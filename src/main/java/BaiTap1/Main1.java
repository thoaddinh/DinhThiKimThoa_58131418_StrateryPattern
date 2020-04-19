
package BaiTap1;

public class Main1 {

    public static void main(String[] args) {
       Context cong = new Context();
       cong.setTinhToan(new Cong());
       System.out.println("75 + 12 = "+cong.tinh(75, 12));
       
       Context tru = new Context();
       tru.setTinhToan(new Tru());
        System.out.println("54 - 78 = "+tru.tinh(54, 78));
    }
    
}
