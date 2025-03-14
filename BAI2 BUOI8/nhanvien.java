
package bai2.buoi8;
class nhanvien extends nguoi {
    private int Luong;
    public nhanvien(String ten, String diachi, int luong) {
        super(ten, diachi);
        this.Luong = luong;
    }
    @Override
    public void hienthi() {
        System.out.println("Nhân viên: " + layten() + ", Địa chỉ: " + laydiachi() + ", Lương: " + Luong);
    }
}
