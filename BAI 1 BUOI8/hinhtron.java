
package bai.buoi8;

import java.util.Scanner;
public abstract class hinhtron extends HINHHOC {
    protected float bankinh;
    public hinhtron() {
        ten = "hình tròn";
    }
    public void nhapBankinh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bán kính: ");
        bankinh = sc.nextFloat();
    }
    @Override
    public void nhapThongTin() {
        nhapBankinh();
    }
    @Override
    public void tinhChuvi() {
        chuvi = 2 * pi * bankinh;
    }
    @Override
    public void tinhDientich() {
        dientich = pi * bankinh * bankinh;
    }
    @Override
    public void tinhThetich() {
        thetich = 0;
    }
}
